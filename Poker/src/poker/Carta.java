
package poker;


public class Carta {
    private final int seme;
    private final int valore;
    private boolean coperta=true;
    
/**
 * Costruttore della carta
 */    
public Carta(int seme, int valore) {
    this.seme =seme;
    this.valore =valore;
}

/**
 * Situazione iniziale di ogni carta , (coperta)
 */
public void setCoperta(boolean coperta) {
    this.coperta = coperta;
}

/**
 * 
 * @return se la carta è coperta o no 
 */
public String getCoperta() {
    if (coperta==false) {
        return "scoperta";
    } else {
        return "coperta";
    }
}

/**
 * 
 * @return output del colore
 */
public String getColore() {
    switch(this.seme){
        case 1:
            return "rosso";
        case 2:
            return "nero";
        case 3:
            return "rosso";
        case 4:
            return "nero";
        default: return "";
    }
}

/**
 * 
 * @return output del seme
 */
public String getSeme() {
    
    switch (seme) {
        case 1:
            return "Quadri";
        case 2:
            return "Fiori";
        case 3:
            return "Cuori";
        case 4:
            return "Picche";
        default: return "";
    }
}


/**
 * 
 * @return output del valore
 */
public String getValore() {
    if ((valore == 1) || (valore > 10)) {
        switch (valore) {
            case 1:
        return "Asso";
            case 11:
        return "Jack";
            case 12:
        return "Donna";
            case 13:
        return "Re";
        default: return "";
        }
    }
    else {
        return (""+valore);
    }
}

/**
 * Stampa le caratteristiche della carta
 * @return Carta
 */
    @Override
    public String toString() {
        if (this.coperta==false) {
            return "Carta{" + "seme=" + getSeme() + ", valore=" + getValore() + ", colore=" + getColore() + '}';
        }else return "Carta Coperta";
        
    }

}
