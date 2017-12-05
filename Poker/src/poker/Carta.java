
package poker;

public class Carta {
    
    public String seme;
    public int valore;
    public String colore;
    public boolean coperta;

    public Carta(String seme, int valore, String colore, boolean coperta) 
    {
        this.seme = seme;
        this.valore = valore;
        this.colore = colore;
        this.coperta = coperta;   
    }
    
    public String getSeme() {
        return seme;
    }

    public int getValore() {
        return valore;
    }

    public String getColore() {
        return colore;
    }

    public boolean isCoperta() {
        return coperta;
    }

    public void setSeme(String seme) {
        this.seme = seme;
    }

    public void setValore(int valore) {
        this.valore = valore;
    }

    public void setColore(String colore) {
        this.colore = colore;
    }

    public void setCoperta(boolean coperta) {
        this.coperta = coperta;
    }
    
    
//  METODO ALTERNATIVO DEL COSTRUTTORE E SETTER    
    
 /*   public Carta(String seme, int valore, String colore, boolean coperta)
    {
        setCarta(seme,valore,colore,coperta);
    }
    
    public void setCarta(String seme, int valore, String colore, boolean coperta)
    {
        this.seme = seme;
        this.valore = valore;
        this.colore = colore;
        this.coperta = coperta;
    }*/
}
