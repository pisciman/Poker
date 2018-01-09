/* *******************************
   *   2018(c)Project made by:   * 
   *                             * 
   *       Gruppo Epsilon        * 
   ******************************* */

package poker;

/** Semplice classe che rappresenta un contenitore per fiches del poker. Una fiche non è altro che un 
 * gettone, il cui utilizzio principale è quello di venire usata come segnapunto o in sostituzione del
 * denaro.
 * 
 * @author Abati David
 * @author Nicolini Simone */

public class Contenitore 
{
    private static int maxFiches;   // valore totale delle fiches presenti sul banco.
    private final Fiche[] genere;   // valore della singola fiche, quest'ultimo attribuito in base al colore.
    
    /** Nel mondo reale, una fiche si caratterizza per il colore ed un valore,
     * quest'ultimo attribuito in base al primo. Un contenitore, invece, serve
     * a contenere le fiches presenti sul banco.
     * 
     * @param genere enum Fiche. Corrisponde al colore della fiche ed il valore ad esso attribuito. */
    
    public Contenitore (Fiche[] genere)
    {
        this.genere = genere;
        for (Fiche fiche : genere) {
            maxFiches += fiche.valore;
        }
    }
    
    /** Descrive una singola fiche. Più precisamente: il suo colore e valore.
     * 
     * @return Ritorna la descrizione generale di una fiche. */
    
    @Override
    public String toString() {
        Fiche fiche = genere[1];
        
        return "Fiche:\n\tcolore - " + fiche.name()+ "\n\tvalore - " + fiche.valore;
    }
    
    // Main di prova
    public static void main(String[] args) 
    {
        Fiche fiches [] = {Fiche.NERA, Fiche.VERDE, Fiche.VIOLA};
        Contenitore cont = new Contenitore(fiches);
        
        System.out.println(cont);
    }
}