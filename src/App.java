import pojo.*;

public class App {
    public static void main(String[] args) {
        // Je créer mon héro
        Soldier hero = new Soldier("Xavier", 200, 5, 5);
        Soldier enemy = new Soldier("Christophe", 100, 10, 8);

        // Je le fait se déplacer
        hero.move();

        // Le hero attaque un ennemi
        hero.attack(enemy);
    }
}
