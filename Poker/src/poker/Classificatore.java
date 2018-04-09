package poker;

import java.util.ArrayList;

public class Classificatore {

    public static PuntoMano classifica(ArrayList<Carta> l) {

        if(l == null)
        {
            return PuntoMano.INDEFINITO;
        }
        if(l.size() == 1){
            return PuntoMano.ALTA;
        }
        if(l.size() == 2){
            if (l.get(0).getValore()!=l.get(1).getValore())
                return PuntoMano.ALTA;
            else
            {
                return PuntoMano.COPPIA;
            }
        }
        if(l.size() > 2){
            
            int uguali = 1 ;
            
            for (int i= 0 ; i<l.size() ; i++)
            {              
                if (l.get(i).getValore() == l.get(i).getValore()) uguali++;           
            }
            
            if (uguali == 0)   return PuntoMano.ALTA;
            if (uguali == 3)   return PuntoMano.TRIS;
            if (uguali == 4)   return PuntoMano.POKER;
        }

        return PuntoMano.INDEFINITO;
    }
}
