public class Warrior extends Character{
    String name = "Guts";
    int health = 200;
    int level = 27;
    @Override
    void attack() {
        System.out.println(name + " use his DragonSlayer");
    }
    @Override
    void displayStats(){
        System.out.println(name + " has " + health +" HP" + " and is level " + level);
    }
}
