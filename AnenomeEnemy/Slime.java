// Slime enemy subclass

// TODO: Extend Enemy


public class Slime extends Enemy{

    // TODO: Create constructor
    // Must call super(...)
    public Slime(int health, int damage, String name){
        super(health,damage,name);
        System.out.println("BOSS BATTLE ALERT\n-----------------");
        System.out.println(this.name + " THE SLIME\n");
    }

    // TODO: Implement update()
    @Override
    void update(){
        System.out.println("--------|UPDATE|--------");
        System.out.println("The slime slugs forward");
        //System.out.println("\n");
    }

    // TODO: Implement attack()
    @Override
    void attack(){
        System.out.println("--------|ATTACK|--------");
        System.out.println("The slime slimes you!");
        System.out.println("The attack does " + this.damage + " damage! :0");
        //System.out.println("\n");
    }
}
