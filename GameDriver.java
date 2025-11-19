// Driver for the Enemy inheritance lab

public class GameDriver {

    public static void main(String[] args) {

        // TODO: Add this commented line to show that Enemy cannot be instantiated:
        //Enemy e = new Enemy(); Can't do this silly!

        // TODO: Create an Enemy[] array with:
        // new Slime(...)
        Slime slime = new Slime(10, 1, "slime" );
        // new Skeleton(...)
        Skeleton skeleton = new Skeleton(1, 10, "skeleton");
        // new Dragon(...)
        Dragon dragon = new Dragon(100, 100, "dragon");
        Enemy[] enemies = {slime, skeleton, dragon};

        // TODO: Loop through the array and call:
        // update(), attack(), takeDamage()
        for (Enemy enemy: enemies){
            System.out.println(enemy.getName());
            enemy.update();
            enemy.attack();
            enemy.takeDamage((int)(Math.random() * 11));
            System.out.println();
        }
        // TODO: Add reflection answers as comments at the bottom of this file
    }
}
