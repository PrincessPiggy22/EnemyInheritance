// Lab: Abstract Enemies
// TODO: Declare this class as abstract

public abstract class Enemy {

    // TODO: Add protected instance variables:
    // health, damage, name
    protected int health;
    protected int damage;
    protected String name;

    // TODO: Create a constructor that initializes all fields
    public Enemy(int health, int damage, String name){
        this.health = health;
        this.damage = damage;
        this.name = name;
    }

    // TODO: Declare abstract methods:
    // update()
    abstract void update();
    // attack()
    abstract void attack();
    
    // TODO: Create a concrete takeDamage(int amount) method
    void takeDamage(int amount){
        System.out.println("--------|TAKE DMG|--------");
        this.health -= amount;
        System.out.println(this.name + " takes " + this.damage + " damage and has " + this.health +" hp left!");
        System.out.println("\n");
    }
    
    // TODO: Add a getName() method
    void getName(){
        System.out.println(this.name);
    }
}
