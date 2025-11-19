// Dragon enemy subclass

// TODO: Extend Enemy

public class Dragon extends Enemy{
    // TODO: Create constructor
    // Must call super(...)
    public Dragon(int health, int damage, String name){
        super(health, damage, name);
    }

    // TODO: Implement update()
    public void update(){
        System.out.println("The dragon flies towards you charging up its fire breath attack.");
    }

    // TODO: Implement attack()
    public void attack(){
        System.out.println("The dragon shoots a fire ball at you.");
    }
}