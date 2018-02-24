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
        if(l.size() > 1){
            return PuntoMano.COPPIA;
        }

        return PuntoMano.INDEFINITO;
    }
}
