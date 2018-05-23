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
            
            int u_valore = 1 , u_valore2 = 1 , coppia=0;
            int u_colore = 1;
            
            int[] a = new int[5];
  
            for (int i= 1 ; i<l.size() ; i++)
            {   
                if (l.get(0).getValore() == l.get(i).getValore())   u_valore++;
                if (l.get(0).getSimbolo().equals(l.get(i).getSimbolo()))    u_colore++;
            }
                   
            for (int x= 0 ; x<l.size() ; x++)   //abbiamo creato un array che contiene i valori delle carte nella lista
            {                                   //perche non si poteva ordinare una lista del genere
                a[x]=l.get(x).getValore();
            }
            
           
            
            Arrays.sort(a);
            
         /*   for(int i=0; i<a.length-1; i++)   //per trovare doppia copia
            {   
                for (int y = i+1 ; y<a.length; y++)
                    if(a[i] == y )
                    {
                        u_valore++;
                    }
                
            } */
                
            if (u_valore == 2)   return PuntoMano.COPPIA;
            if (u_valore == 3)   return PuntoMano.TRIS;
            if (u_valore == 4)   return PuntoMano.POKER;   
            
            if (a[0] == 1 && a[4] == 13 && a[4]-a[1] == 3 && u_colore == 5 && u_valore == 1) return PuntoMano.SCALAREALE; 
            if (a[4]-a[0] == 4 && u_colore == 5 && u_valore == 1)    return PuntoMano.SCALACOLORE;           
            if (a[4]-a[0] != 4 && u_colore == 5 && u_valore == 1)    return PuntoMano.COLORE;     
            if (a[4]-a[0] == 4 && u_colore != 5 && u_valore == 1)    return PuntoMano.SCALA;
            
  
            
            if (u_valore == 1 && u_colore != 5 && a[4]-a[0] != 4)   return PuntoMano.ALTA;
            
        }          

        return PuntoMano.INDEFINITO;
    }
}
