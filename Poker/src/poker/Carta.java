package poker;

/**
* Definisce una carta da gioco del poker classica
* costituita dal <code>seme</code>, dal <code>valore</code> e
* dallo stato <code>coperto</code> di ogni carta.
*
* @author m.santosuosso
* @author a.torricelli
* @author s.nicolini
* @author d.santacroce
* @author piffy (main di prova, stinghe del colore)
*/
public class Carta {
    /**Seme della carta*/
    final private Seme seme;
    /**Valore (numero) della carta*/
    final private Valore valore;
    /**Definisce lo stato (coperto(true) o scoperto(false) della carta)*/
    private boolean coperto;
     
    public Carta(Seme seme, Valore valore, boolean coperto) {
        this.seme = seme;
        this.valore = valore;
        this.coperto = coperto;
    }
      
    public Carta(Seme seme, Valore valore) {
            this.seme = seme;
            this.valore = valore;
            this.coperto = true;
    }

    public int getValore() {
        return valore.getValore();
    }
    
    /**
    * Rappresentazione della carta.
    * 
    * Se la carta è coperta deve stampare tre asterischi
    * @return (Cambio colore) [Valore][Simbolo Seme]
    */
    @Override
    public String toString() {
        if (isCoperto())
            return "***";
        else
            if (this.valore.valore.equals("10"))
                return getColore() + valore.toString() + seme.toString();
            else
                return getColore() + valore.toString() + " " + seme.toString();
    }

    public int compareSeme (Carta c2) {
        if (this.seme.ordinal() < c2.seme.ordinal())
            return -1;
        if (this.seme.ordinal() > c2.seme.ordinal())
            return 1;
        return 0;
    }

    /**
     * TODO: Refactoring. La questione dell'asso deve essere risolta in modo più semplice.
     * @param c2
     * @return
     */
    public int compareValore(Carta c2) {
        if (this.valore.equals(Valore.ASSO)){ /* Controllo per gli assi (Gli assi valgono di piu')*/
            if (c2.valore.equals(Valore.ASSO))
                return 0;
            else
                return 1;
        }
        else {
            if (c2.valore.equals(Valore.ASSO))
                return -1;
            else {
                if (this.getValore() < c2.getValore())
                    return -1;
                if (this.getValore() > c2.getValore())
                    return 1;
            }
        }
        return 0;
    }

    /**
     * Compara due carte tenendo conto del valore soltanto (regole texas hold'em).
     * 
     * @param c2 Seconda carta da confrontare con quella corrente
     * @return
     */
    public int compareTo(Carta c2) {
        if (this.compareValore(c2) == -1)
            return -1;
        if (this.compareValore(c2) == 1)
            return 1;
        return 0;
    }

    public boolean isCoperto()
    {
        return coperto;
    }

    /**
    * Restituisce il codice per la stampa a colori su teriminale
    * @return la stringa ANSI che cambia il colore sul terminal
    */
    public String getColore() {
        final String ANSI_RED = "\u001B[31m";
        final String ANSI_BLACK = "\u001B[30m";

        if (seme.simbolo.equals("♥") || seme.simbolo.equals("♦"))
            return ANSI_RED;
        else
            return ANSI_BLACK;
    }
}