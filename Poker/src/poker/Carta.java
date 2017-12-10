
package poker;

public class Carta {
    
    private String seme;
    private String valore;
    private String colore;  
    private boolean coperta;

    /**
     * Costruttore
     * @param seme
     * @param valore
     * @param colore
     */
    public Carta(String seme, String valore, String colore /* ,boolean coperta*/) 
    {
        this.seme = seme;
        this.valore = valore;
        this.colore = colore;
    //    this.coperta = coperta;   
    }
    
    public String getSeme() {
        return seme;
    }

    public String getValore() {
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

    public void setValore(String valore) {
        this.valore = valore;
    }

    public void setColore(String colore) {
        this.colore = colore;
    }

    public void setCoperta(boolean coperta) {
        this.coperta = coperta;
    }
    
    
//  METODO ALTERNATIVO DEL COSTRUTTORE E SETTER    
    
 /*   public Carta(String seme, String valore, String colore, boolean coperta)
    {
        setCarta(seme,valore,colore,coperta);
    }
    
    public void setCarta(String seme, String valore, String colore, boolean coperta)
    {
        this.seme = seme;
        this.valore = valore;
        this.colore = colore;
        this.coperta = coperta;
    }*/
}
