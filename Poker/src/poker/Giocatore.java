package poker;

/**
 * @author Torricelli Alessio
 * @author sfemat
 */
public class Giocatore {
    private int nCarte;
    private String nomeGiocatore;
    private int soldi;
    
    public Giocatore(int nCarte, String nomeGiocatore, int soldi) {
        this.nCarte = nCarte;
        this.nomeGiocatore = nomeGiocatore;
        this.soldi = soldi;
    }

    public int getnCarte() {
        return nCarte;
    }

    public String getNick() {
        return nomeGiocatore;
    }

    public int getSoldi() {
        return soldi;
    }

    public void setnCarte(int nCarte) {
        this.nCarte = nCarte;
    }
    
    public void setSoldi(int soldi) {
        this.soldi = soldi;
    }

    @Override
    public String toString() {
        return "Giocatore{nCarte=" + nCarte + ", Nome Giocatore: " + nomeGiocatore + ", soldi: " + soldi + '}';
    }
}