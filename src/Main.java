public class Main {
    public static void main(String[] args) {
//        Character myCharacter = new Character();
//        myCharacter.attack();
        Warrior Guts = new Warrior();
        Guts.attack();
        Guts.displayStats();
        Archer Link = new Archer();
        Link.attack();
        Link.displayStats();
        Wizard Gandalf = new Wizard();
        Gandalf.attack();
        Gandalf.displayStats();
    }
}
