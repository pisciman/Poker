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
 */
public class Carta {
    /**Seme della carta*/
    final private Seme seme;
    /**Valore (numero) della carta*/
    final private int valore;
    /**Definisce lo stato (coperto(true) o scoperto(false) della carta)*/
    private boolean coperto;
     
    public Carta(Seme seme, int valore, boolean coperto) {
        this.seme = seme;
        this.valore = valore;
        this.coperto = coperto;
    }
      
    public Carta(Seme seme, int valore) {
        this.seme =seme;
        this.valore =valore;
        this.coperto = true;
    }

    /**
     * Rappresentazione della carta. 
     * TODO:Deve usare esattamente TRE caratteri. 
     * Se la carta è coperta deve stampare tre asterischi
     * @return 
     */
    @Override
    public String toString()
    {
        return "Carta{seme=" + seme + ", valore=" + valore + ", coperto=" + coperto + '}';
    }

    public int getValore() {
        return valore;
    }
    
    /**
     * 
     * @return output testuale del valore
     */
    public String getStringValore() {

        if ((valore == 1) || (valore > 10)) {
            switch (valore) {
                case 1:
            return "Asso";
                case 11:
            return "Jack";
                case 12:
            return "Donna";
                case 13:
            return "Re";
            default: return "";
            }
        }
        else {
            return (""+valore);
        }
    }

    public Seme getSeme()
    {
        return seme;
    }
        
    public boolean isCoperto()
    {
        return coperto;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Carta other = (Carta) obj;
        if (this.seme != other.seme) {
            return false;
        }
        return this.valore == other.valore;
    }
}