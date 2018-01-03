/* *******************************
   *   2018(c)Project made by:   * 
   *                             * 
   *       Gruppo Epsilon        * 
   ******************************* */

package poker;

/** Semplice classe che rappresenta una fiche del poker, ovvero un gettone, il cui utilizzo è quello
 * di venir usato come segnapunti o in sostituzione del denaro.
 * Le fiches possiedono valori differenti a differenza del colore (esempio: rosso = 50€).
 * 
 * @author Abati David
 * @author Nicolini Simone */

public class Fiche 
{
    // ATTRIBUTI
    public static int maxFiches;
    private final Tipo categoria;
    
    // COSTRUTTORI
    /** Permette la creazione di una nuova fiche.
     * 
     * @param genere Corrisponde al colore della fiche ed il valore in denaro. */
    
    public Fiche (Tipo genere)
    {
        this.categoria = genere;
    }
    
    // METODI
    /** In base alla fiche corrente, viene restituito il suo valore. Quest'ultimo dovrebbe essere
     * sommato assieme quello delle altre fiche in mano al singolo giocatore.
     * 
     * @return Ritorna il valore della fiche corrente */
    
    public int getFicheValue () {
        return categoria.valore;
    }
    
    /** Descrizione della fiche corrente. Più specificatamente: il colore e valore corrispondenti
     * 
     * @return Ritorna una descrizione della fiche */
    
    @Override
    public String toString () {
        return "Fiche { categoria : " + categoria + "}";
    }
    
    public static void main(String[] args) {
        Fiche f = new Fiche(Tipo.VERDE);
        
        System.out.println(f);
    }
}