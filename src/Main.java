import classes.*;
import enums.PersonMood;
import records.Relationship;

import java.util.ArrayList;

class Main {
    public static void main(String[] args) {
        Person king = new Person("Отец-король");
        Person queen = new Person("Мать-королева");

        Fiance prince = new Fiance("Королевич");
        Sword princesSword = new Sword();
        princesSword.use(prince);

        Fiance princess = new Fiance("Невеста");
        prince.engage(princess);

        Castle castle = new Castle();
        ArrayList<Person> castleVisitors = new ArrayList<Person>();
        castleVisitors.add(prince);
        castleVisitors.add(princess);
        castle.acceptVisitors(castleVisitors, 2);

        king.changeMood(PersonMood.DISAPPOINTED);
        queen.changeMood(PersonMood.DISAPPOINTED);

        Wedding wedding = new Wedding();
        wedding.prepare();
    }
    /*
     * Королевичу ничего другого не оставалось, как везти ее во дворец. 
     * Ведь он поклялся на своем мече. Отец-король и мать-королева очень огорчились, увидев невесту своего любимого сына.
     * Стоило ездить за такой красоткой чуть не на край света! Но раз слово дано, надо его выполнять.
     * Принялись готовиться к свадьбе. 
     */
}