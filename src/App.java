import pojo.ICharacter;
import pojo.Soldier;
import pojo.Wizard;

public class App {
    public static void main(String[] args) throws Exception {
        ICharacter hero = new Soldier("Stallone", 100, 4, 20);
        ICharacter enemy = new Wizard("Voldemort", 60, 10, 40);

        hero.speak("Héhé, je suis le plus fort !");
        hero.move();
        hero.attack(enemy);

        enemy.speak("Jeune prétentieux je vais te montrer la puissance de ma magie !");
        enemy.move();
        enemy.attack(hero);
    }
}
