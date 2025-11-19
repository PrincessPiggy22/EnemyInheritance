// Slime enemy subclass

// TODO: Extend Enemy

public class Slime extends Enemy{

    // TODO: Create constructor
    // Must call super(...)
    public Slime(int health, int damage, String name){
        super(health,damage,name);
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
