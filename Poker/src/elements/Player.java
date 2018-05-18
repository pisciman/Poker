/* Metodi da creare: 
 *
 * Inserimento del nome
 * Controllo se è maschio o femmina
 * Controllo per età minima
 * Carte in mano
 * Budget disponibile */

package elements;

/**
 * @author a.torricelli
 * @author u.pollarini
 * @author m.sferruzza
 * @author s.d'angiolella
 * @author m.cavalieri
 */
public class Player
{
    // ATTRIBUTES
    private String name;
    private char sex;
    private int age;
    public int money;
    
    // CONSTRUCOTRS
    public Player (String name, char sex, int age, int money)
    {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.money = money;
    }
    
    // METHODS
    public void setName(String newName) {
        this.name = newName;
    }
    
    public void setSex(char newSex) throws Exception {
        if (newSex == 'm' || newSex == 'f' || newSex == 'M' || newSex == 'F') this.sex = newSex;
        else throw new Exception("I think you have some problem, haven't you?");
    }
    
    public void betMoney(int newSum) throws Exception {
        if (newSum > 0) this.money = newSum;
        else throw new Exception("You can't bet a negative money sum");
    }
    
    public void setAge(int newAge) throws Exception {
        if (newAge > 0) this.age = newAge;
        else throw new Exception("Are you ok with your life?");
    }
    
    public String getName() {
        return name;
    }
    
    public char getSex() {
        return sex;
    }
    
    public int getMoney() {
        return money;
    }
    
    public int getAge() {
        return age;
    }
}