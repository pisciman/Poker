
package poker;

public class Carta {
    private final int seme;
    private final int valore;
    private final int colore;
    
public Carta(int seme, int valore, int colore) {
    this.seme =seme;
    this.valore =valore;
    this.colore =colore;
}

public String getColore() {
    if(colore<26){
        return "rosso";
    }else return "nero";
}

public String getSeme() {
    switch (seme) {
        case 1:
            return "Cuori";
        case 2:
            return "Quadri";
        case 3:
            return "Fiori";
        case 4:
            return "Picche";
        default: return "";
    }
}
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
}
