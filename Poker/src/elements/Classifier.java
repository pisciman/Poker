package elements;

import java.util.ArrayList;
import values.Points;

public class Classifier
{
    // METHODS
    public static Points classifica(ArrayList<Card> list) {
        if (list == null) return Points.INDEFINITO;
        if (list.size() == 1) return Points.ALTA;
        if (list.size() > 1) {
            if (!list.get(0).getValue().equals(list.get(1).getValue())) return Points.ALTA;
            else return Points.COPPIA;
        }
        
        return Points.INDEFINITO;
    }  
}