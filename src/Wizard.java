public class Wizard extends Character{
   public Wizard(){
        super("Gandalf", 55, 99);
   }
    @Override
    void attack() {
        System.out.println(name + " use his magic stick");
    }

    @Override
    void displayStats() {
        System.out.println(name + " has " + health +  " HP and is level " + level);    }
}
