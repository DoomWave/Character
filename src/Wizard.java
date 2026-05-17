public class Wizard extends Character{
    String name = "Gandalf";
    int level = 99;
    int health = 45;

    @Override
    void attack() {
        System.out.println(name + " use his magic stick");
    }

    @Override
    void displayStats() {
        System.out.println(name + " health points and is level " + level);
    }
}
