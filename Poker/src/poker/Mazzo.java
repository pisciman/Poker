
package poker;

public class Mazzo {
    Carta[] c;
    int q=0;
   
   public Carta[] creaMazzo(){
       for(int i=0; i<4; i++) {
           for(int y=1;y<14;y++){
               c[q]=new Carta(y,i);
           }
    }
       return c;
   }
        

}
