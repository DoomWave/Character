public class Archer extends Character{
    public Archer(){
        super("Archer", 55, 99);
    }
    @Override
    void attack() {
        System.out.println(name + " use his fire bow");
    }

    @Override
    void displayStats() {
        System.out.println(name + " has " + health +  " HP and is level " + level);
    }
}
