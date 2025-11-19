// Skeleton enemy subclass

// TODO: Extend Enemy

public class Skeleton extends Enemy {

    // TODO: Create constructor (call super)
    public Skeleton(int health, int damage, String name){
        super(health,damage,name);
        System.out.println("BOSS BATTLE ALERT\n-----------------");
        System.out.println(this.name + " SKELETON\n");
    }

    // TODO: Implement update()
    @Override
    void update(){
        System.out.println("--------|UPDATE|--------");
        System.out.println(this.name + " skeleton marches forward");
    }


    // TODO: Implement attack()
    @Override
    void attack(){
        System.out.println("--------|ATTACK|--------");
        System.out.println(this.name + " throws it's bones at you!");
        System.out.println("The attack does " + this.damage + " damage! :0");
    }
}

