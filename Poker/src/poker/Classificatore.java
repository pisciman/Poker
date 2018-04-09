package poker;

import java.util.ArrayList;

public class Classificatore {

    public static PuntoMano classifica(ArrayList<Carta> l) {

        if(l == null)
        {
            return PuntoMano.INDEFINITO;
        }
       
        if(l.size() > 0){
            
            int u_valore = 1;
            int u_colore = 1;
            
            for (int i= 1 ; i<l.size() ; i++)
            {   
                if (l.get(0).getValore() == l.get(i).getValore())   u_valore++;
                if (l.get(0).getSimbolo().equals(l.get(i).getSimbolo()))    u_colore++;
            }
            
            if (u_valore == 1 && u_colore != 5)   return PuntoMano.ALTA;
            if (u_valore == 2)   return PuntoMano.COPPIA;
            if (u_valore == 3)   return PuntoMano.TRIS;
            if (u_valore == 4)   return PuntoMano.POKER;
            if (u_colore == 5)   return PuntoMano.COLORE;
            
        }

        return PuntoMano.INDEFINITO;
    }
}
