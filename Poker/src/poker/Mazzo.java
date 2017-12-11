package poker;

/**
 * 
 *
 * @author m.santosuosso
 */
public class Mazzo {
    private Carta mazzo[] = new Carta[52];
    String semi [] = {"Cuori", "Quadri", "Fiori", "Picche"};
    
/*--Variabili-----------------------------------------------------------------*/

    /**
     * Genera in modo ordinato un mazzo di 52 carte da poker coperte
     */
    public void generate() {
       for (int tempSeme = 0; tempSeme < 4; tempSeme++)
            for (int tempValore = 0; tempValore < 13; tempValore++)
                mazzo[tempValore + (13 * tempSeme)] = new Carta(semi[tempSeme], tempValore, true);
    }
    
/*--Metodo generate-----------------------------------------------------------*/
}