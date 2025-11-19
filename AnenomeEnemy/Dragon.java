// Dragon enemy subclass

// TODO: Extend Enemy

public class Dragon extends Enemy {

    // TODO: Create constructor (call super)
    public Dragon(int health, int damage, String name){
        super(health,damage,name);
    }
    
    // TODO: Implement update()
    @Override
    void update(){
        System.out.println("The dragon stomps forward");
    }
    
    // TODO: Implement attack()
    @Override
    void attack(){
        System.out.println("The dragon blasts fire at you!");
        System.out.println("The attack does " + this.damage + " damage! :0");
    }
}
