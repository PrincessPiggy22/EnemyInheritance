// Driver for the Enemy inheritance lab

public class GameDriver {

    public static void main(String[] args) {

        // TODO: Add this commented line to show that Enemy cannot be instantiated:
        // Enemy e = new Enemy();

        // TODO: Create an Enemy[] array with:
        // new Slime(...)
        // new Skeleton(...)
        // new Dragon(...)
        Enemy[] enemies = {new Slime(5,1,"Bob"), new Skeleton(10,5,"Jack"), new Dragon(50,20,"Toothless")};

        // TODO: Loop through the array and call:
        // update(), attack(), takeDamage()
        for (int i = 0; i < enemies.length; i++) {
            enemies[i].update();
            enemies[i].attack();
            enemies[i].takeDamage(5);
        }

        // TODO: Add reflection answers as comments at the bottom of this file
        // in the readme
    }
}
