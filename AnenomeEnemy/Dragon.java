// Dragon enemy subclass

// TODO: Extend Enemy

public class Dragon extends Enemy {

    // TODO: Create constructor (call super)
    public Dragon(int health, int damage, String name){
        super(health,damage,name);
        System.out.println("BOSS BATTLE ALERT\n-----------------");
        System.out.println(this.name + " THE DRAGON\n");
    }

    // TODO: Implement update()
    @Override
    void update(){
        System.out.println("--------|UPDATE|--------");
        System.out.println(this.name + " stomps forward");
    }

    // TODO: Implement attack()
    @Override
    void attack(){
        System.out.println("--------|ATTACK|--------");
        System.out.println(this.name +  "blasts fire at you!");
        System.out.println("The attack does " + this.damage + " damage! :0");
    }
}
