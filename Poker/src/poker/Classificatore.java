package poker;

import java.util.ArrayList;

public class Classificatore {

    public static PuntoMano classifica(ArrayList<Carta> l) {

    if(l==null)
    {
        return PuntoMano.INDEFINITO;
    }
    else
        return PuntoMano.ALTA;

    }
}
