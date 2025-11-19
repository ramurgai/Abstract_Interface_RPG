// Skeleton enemy subclass

// TODO: Extend Enemy

public class Skeleton extends Enemy{
    // TODO: Create constructor
    // Must call super(...)
    public Skeleton(int health, int damage, String name){
        super(health, damage, name);

    }

    // TODO: Implement update()
    public void update(){
        System.out.println("The skeleton shuffles towards you sword in hand.");
    }

    // TODO: Implement attack()
    public void attack(){
        System.out.println("The skeleton tries to strike you with its sword.");
    }
}