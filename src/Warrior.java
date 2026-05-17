public class Warrior extends Character{
    public Warrior(){
        super("Warrior", 55, 99);
    }
    @Override
    void attack() {
        System.out.println(name + " use his DragonSlayer");
    }
    @Override
    void displayStats(){
        System.out.println(name + " has " + health +  " HP and is level " + level);    }
}
