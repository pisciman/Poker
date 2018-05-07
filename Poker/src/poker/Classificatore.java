package poker;

import java.util.ArrayList;
import java.util.Arrays;

public class Classificatore {

    public static PuntoMano classifica(ArrayList<Carta> l) {

        if(l == null)
        {
            return PuntoMano.INDEFINITO;
        }
        
    //    if (l.size() == 1)   return PuntoMano.ALTA;
       
        if(l.size() > 0){
            
            int u_valore = 1;
            int u_colore = 1;
            
            int[] a = new int[5];
            
            for (int i= 1 ; i<l.size() ; i++)
            {   
                if (l.get(0).getValore() == l.get(i).getValore())   u_valore++;
                if (l.get(0).getSimbolo().equals(l.get(i).getSimbolo()))    u_colore++;
            }
            
            for (int x= 0 ; x<l.size() ; x++)
            {   
                a[x]=l.get(x).getValore();
            }

            if (u_valore == 2)   return PuntoMano.COPPIA;
            if (u_valore == 3)   return PuntoMano.TRIS;
            if (u_valore == 4)   return PuntoMano.POKER;
             
            Arrays.sort(a);
             
            if (a[4]-a[0] != 4 && u_colore == 5 && u_valore == 1)    return PuntoMano.COLORE;
            if (a[4]-a[0] == 4 && u_colore != 5 && u_valore == 1)    return PuntoMano.SCALA;
            if (a[4]-a[0] == 4 && u_colore == 5 && u_valore == 1)    return PuntoMano.SCALAREALE;           
            
            if (u_valore == 1 && u_colore != 5 && a[4]-a[0] != 4)   return PuntoMano.ALTA;
            
        }          

        return PuntoMano.INDEFINITO;
    }
}
