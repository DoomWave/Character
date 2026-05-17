public class Archer extends Character{
    String name = "Link";
    int health = 75;
    int level = 18;

    @Override
    void attack() {
        System.out.println(name + " use his fire bow");
    }

    @Override
    void displayStats() {
        System.out.println(name + " health points and is level " + level);
    }
}
