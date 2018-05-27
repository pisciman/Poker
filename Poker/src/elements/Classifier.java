package elements;

import gui.GCarta;
import java.util.ArrayList;
import values.Points;

public class Classifier
{
    // METHODS
    public static Points classifica(ArrayList<GCarta> list) {
        if (list == null) return Points.INDEFINITO;
        if (list.size() == 1) return Points.ALTA;
        if (list.size() > 1) {
            //if (!list.get(0).getValore().equals(list.get(1).getValore())) 
                return Points.ALTA;
            //else return Points.COPPIA;
        }
        
        return Points.INDEFINITO;
    }  
}