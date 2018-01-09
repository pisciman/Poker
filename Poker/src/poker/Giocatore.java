package poker;

/**
 *
 * @author sfemat
 */
public class Giocatore {
    private int nCarte;
    private String nick;
    private float soldi;
    
    public Giocatore(String nk, int nC, float sd) {
        this.nCarte = nC;
        this.nick = nk;
        this.soldi = sd;
    }

    public int getnCarte() {
        return nCarte;
    }

    public String getNick() {
        return nick;
    }

    public float getSoldi() {
        return soldi;
    }

    public void setnCarte(int nCarte) {
        this.nCarte = nCarte;
    }
    
    public void setSoldi(float soldi) {
        this.soldi = soldi;
    }
    
     /**
     * @author simodangio
     * @return 
     *
     */
    
    @Override
    public String toString() {
        return "Giocatore{" + "nCarte=" + nCarte + ", nick=" + nick + ", soldi=" + soldi + '}';
    }
    
}
