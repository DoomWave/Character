public class Character {
    String name;
    protected int health;
    protected int level;
    public Character(String name, int health, int level) {
        this.name = name;
        this.health = health;
        this.level = level;
    }
    public void attack(){
        System.out.println("Attack");
    }

    public void displayStats(){
        System.out.println("health points");
    }
}
