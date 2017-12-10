
package poker;

import java.util.Random;


public class Mazzo {
    
 private int MaxCarta = 52;
 private Carta[] mazzo;

  public Mazzo(Carta[] mazzo) {
      setMazzo(mazzo);
   }

    Mazzo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


    public void setMazzo(Carta[] mazzo) {
        this.mazzo[0]= new Carta("Diamante","A","Rosso");
        this.mazzo[1]= new Carta("Diamante","1","Rosso");
        this.mazzo[2]= new Carta("Diamante","2","Rosso");
        this.mazzo[3]= new Carta("Diamante","3","Rosso");
        this.mazzo[4]= new Carta("Diamante","4","Rosso");
        this.mazzo[5]= new Carta("Diamante","5","Rosso");
        this.mazzo[6]= new Carta("Diamante","6","Rosso");
        this.mazzo[7]= new Carta("Diamante","7","Rosso");
        this.mazzo[8]= new Carta("Diamante","8","Rosso");
        this.mazzo[9]= new Carta("Diamante","9","Rosso");
        this.mazzo[10]= new Carta("Diamante","10","Rosso");
        this.mazzo[11]= new Carta("Diamante","J","Rosso");
        this.mazzo[12]= new Carta("Diamante","Q","Rosso");


        this.mazzo[13]= new Carta("Fiori","A","Nero");
        this.mazzo[14]= new Carta("Fiori","1","Nero");
        this.mazzo[15]= new Carta("Fiori","2","Nero");
        this.mazzo[16]= new Carta("Fiori","3","Nero");
        this.mazzo[17]= new Carta("Fiori","4","Nero");
        this.mazzo[18]= new Carta("Fiori","5","Nero");
        this.mazzo[19]= new Carta("Fiori","6","Nero");
        this.mazzo[20]= new Carta("Fiori","7","Nero");
        this.mazzo[21]= new Carta("Fiori","8","Nero");
        this.mazzo[22]= new Carta("Fiori","9","Nero");
        this.mazzo[23]= new Carta("Fiori","10","Nero");
        this.mazzo[24]= new Carta("Fiori","J","Nero");
        this.mazzo[25]= new Carta("Fiori","Q","Nero");


        this.mazzo[26]= new Carta("Cuori","A","Rosso");
        this.mazzo[27]= new Carta("Cuori","1","Rosso");
        this.mazzo[28]= new Carta("Cuori","2","Rosso");
        this.mazzo[29]= new Carta("Cuori","3","Rosso");
        this.mazzo[30]= new Carta("Cuori","4","Rosso");
        this.mazzo[31]= new Carta("Cuori","5","Rosso");
        this.mazzo[32]= new Carta("Cuori","6","Rosso");
        this.mazzo[33]= new Carta("Cuori","7","Rosso");
        this.mazzo[34]= new Carta("Cuori","8","Rosso");
        this.mazzo[35]= new Carta("Cuori","9","Rosso");
        this.mazzo[36]= new Carta("Cuori","10","Rosso");
        this.mazzo[37]= new Carta("Cuori","J","Rosso");
        this.mazzo[38]= new Carta("Cuori","Q","Rosso");
        this.mazzo[39]= new Carta("Cuori","K","Rosso");

        this.mazzo[40]= new Carta("Picco","A","Nero");
        this.mazzo[41]= new Carta("Picco","1","Nero");
        this.mazzo[42]= new Carta("Picco","2","Nero");
        this.mazzo[43]= new Carta("Picco","3","Nero");
        this.mazzo[44]= new Carta("Picco","4","Nero");
        this.mazzo[45]= new Carta("Picco","5","Nero");
        this.mazzo[46]= new Carta("Picco","6","Nero");
        this.mazzo[47]= new Carta("Picco","7","Nero");
        this.mazzo[48]= new Carta("Picco","8","Nero");
        this.mazzo[49]= new Carta("Picco","9","Nero");
        this.mazzo[50]= new Carta("Picco","10","Nero");
        this.mazzo[51]= new Carta("Picco","J","Nero");
        this.mazzo[52]= new Carta("Picco","Q","Nero");
    }
 
 
 public void mix()
 {
     Random rand = new Random();
     
    for(int cont=0; cont<52; cont++)
    {
        Carta temp = mazzo[cont];
        int ran = rand.nextInt(52);
        mazzo[cont] = mazzo[ran];
        mazzo[ran] = mazzo[cont];
    }
 }

    @Override
    public String toString() {
        return "Mazzo{" + "mazzo=" + mazzo + '}';
    }
 

}



    
