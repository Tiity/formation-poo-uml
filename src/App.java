import pojo.Soldier;

public class App {
    public static void main(String[] args) {
        // Je créer mon héro
        Soldier hero = new Soldier(100, "Xavier", 5, 5);

        // Je le fait se déplacer
        hero.move();
    }
}
