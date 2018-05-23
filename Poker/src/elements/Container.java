package elements;

import values.Fiche;

public class Container
{
    // ATTRIBUTES
    private int maxFiches;
    private final Fiche[] genere;
    
    // CONSTRUCTORS
    public Container (Fiche... genere)
    {
        this.genere = genere;
        for (Fiche fiche : genere) maxFiches += fiche.getValue();
    }
    
    // METHODS
    @Override
    public String toString() {
        Fiche fiche = genere[1];
        
        return "Fiche:\n\tcolore - " + fiche.name()+ "\n\tvalore - " + fiche.getValue();
    }
}