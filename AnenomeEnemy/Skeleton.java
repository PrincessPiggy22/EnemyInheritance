// Skeleton enemy subclass

// TODO: Extend Enemy

public class Skeleton extends Enemy {

    // TODO: Create constructor (call super)
    public Skeleton(int health, int damage, String name){
        super(health,damage,name);
    }

    // TODO: Implement update()
    @Override
    void update(){
        System.out.println("The skeleton marches forward");
    }


    // TODO: Implement attack()
    @Override
    void attack(){
        System.out.println("The skeleton throws it's bones at you!");
        System.out.println("The attack does " + this.damage + " damage! :0");
    }
}

