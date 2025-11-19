// Slime enemy subclass

// TODO: Extend Enemy

public class Slime extends Enemy{

    // TODO: Create constructor
    // Must call super(...)
    public Slime(){
        super(health,damage,name);
        this.health = health;
        this.damage = damage;
        this.name = name;
    }

    // TODO: Implement update()
    @Override
    void update(){
        System.out.println("The slime slugs forward");
    }

    // TODO: Implement attack()
    @Override
    void attack(){
        System.out.println("The slime slimes you!");
        System.out.println("The attack does " + this.damage + " damage! :0");
    }
}
