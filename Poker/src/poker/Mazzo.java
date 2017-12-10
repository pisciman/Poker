
package poker
public class Mazzo {
private final Carta[] mazzo = new Carta[52];

public Mazzo() {
int c = 0;
    for (int j=0; j <=4; j++) {
        for (int i=0; i <=13; i++) { 
            mazzo[c] = new Carta(j,i,c);
            c++;
        }
    }
}
}
