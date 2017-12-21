package poker;

/**
 * Definisce una carta da gioco del poker classica
 * costituita dal <code>seme</code>, dal <code>valore</code> e
 * dallo stato <code>coperto</code> di ogni carta.
 *
 * @author m.santosuosso
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
    }
    /**
     * Rappresentazione della carta. 
     * Deve usare esattamente TRE caratteri. 
     * Se la carta è coperta deve stampare tre asterischi
     * @return 
     */
    @Override
    public String toString() {
        return "";
    }

}
