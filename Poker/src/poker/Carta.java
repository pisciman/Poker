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
    final private int valore;
    /**Definisce lo stato (coperto(1) o scoperto(0) della carta)*/
    private boolean coperto;
    
/*--Variabili-----------------------------------------------------------------*/
    
    public Carta(Seme seme, int valore, boolean coperto) {
        this.seme = seme;
        this.valore = valore;
        this.coperto = coperto;
    }
    
/*--Costruttore---------------------------------------------------------------*/
}
