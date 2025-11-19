// Slime enemy subclass

// TODO: Extend Enemy

public class Slime extends Enemy{

    // TODO: Create constructor
    // Must call super(...)
    public Slime(int health, int damage, String name){
        super(health, damage, name);
    }

    // TODO: Implement update()
    public void update(){
        System.out.println("The slime flops towards you.");
    }

    // TODO: Implement attack()
    public void attack(){
        System.out.println("The slime tries to envelop you.");
    }
}
