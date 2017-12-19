package poker;
import java.util.*;
public class Mazzo {
private final Carta[] mazzo = new Carta[52];
private int icarte=52;

/**
 * Genera il mazzo creando 52 carte
 */
public Mazzo() {
    
int c = 0;
    for (int j=1; j <=4; j++) {
        for (int i=1; i <=13; i++) { 
            mazzo[c] = new Carta(j,i);
            c++;            
        }
    }
    for (int i = 0; i < 52; i++) {
        System.out.println(mazzo[i]);
    }
    
 /*   System.out.println();         prova funzione mescola
    
    Mescola();  Mescola();  Mescola();  Mescola();
      
        for (int i = 0; i < 52; i++) {
        System.out.println(mazzo[i]);
    }   */   
 
}
/**
 * Funzione che mescola la carta
 */
private void Mescola(){
    Collections.shuffle(Arrays.asList(mazzo));
}

/**
 * Pesca una carta
 */
public Carta pesca(){
    icarte--;
    return mazzo[icarte];
}
}
