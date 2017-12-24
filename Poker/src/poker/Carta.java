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

/**
 * Rappresentazione della carta. 
 * TODO:Deve usare esattamente TRE caratteri.
 * BUG: Stampa a volte due, a volte tre caratteri.
 * Se la carta è coperta deve stampare tre asterischi
 * @return (Cambio colore) [Valore][Simbolo Seme]
 */
 @Override
 public String toString() {
     if (isCoperto())
         return "***";
     else
        return getColore()+valore.toString() + seme.toString() ;
 }
 
 public int compareSeme (Carta c2) {
     if (this.seme.ordinal() < c2.seme.ordinal())
         return -1;
     if (this.seme.ordinal() > c2.seme.ordinal())
         return 1;
     return 0;
 } // Non credo che serva, l'ho fatto per sbaglio, in ogni caso se ce n'e' di bisogno e' qui
    
 public int compareValore(Carta c2) {
     if ((this.toString().equals("A")) || (c2.toString().equals("A"))) { // Controllo per gli assi (Gli assi valgono di piu')
         if (this.toString().equals("A")) {
             if (!c2.toString().equals("A"))
                 return 1;
         }
         return -1;
     }
     else {
         if (this.valore.getValore() < c2.valore.getValore())
             return -1;
         if (this.valore.getValore() > c2.valore.getValore())
             return 1;
     }
     return 0;
 }
  
  public boolean isCoperto()
    {
        return coperto;
    }

    /*** Restituisce il codice per la stampa a colori su teriminale
     * TODO: REFACTORING, Controllare se funziona anche in Windows
     * @return la stringa ANSI che cambia il colore sul terminal
     */
  public String getColore(){
      final String ANSI_RED = "\u001B[31m";
      final String ANSI_BLACK = "\u001B[30m";
      if (seme.simbolo.equals("♥") || seme.simbolo.equals("♦"))
          return ANSI_RED;
      else 
          return ANSI_BLACK;
  }

    public static void main(String[] args) {
      Carta c = new Carta(Seme.CUORI, Valore.ASSO, false);
      System.out.println(c);
      c = new Carta(Seme.FIORI, Valore.DIECI, false);
      System.out.println(c);
    }

}




    