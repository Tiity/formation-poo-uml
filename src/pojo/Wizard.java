package pojo;

public class Wizard extends AbstractCharacter {

    private int power;

    public Wizard() {
        
    }

    public Wizard(String name, int healthPoint, int moveSpeed, int power) {
        super(name, healthPoint, moveSpeed);
        this.power = power;
    }

    @Override
    public boolean attack(ICharacter enemy) {

        if (!super.attack(enemy)) {
            return false;
        }

        if (enemy.defend()) {
            return false;
        }

        int healthPoint = enemy.getHealthPoint() - power;
        enemy.setHealthPoint(healthPoint);

        System.out.println(String.format("%s lance un sort occulte ! %s perd %d point de vie, il lui reste %d", name, enemy.getName(), power, enemy.getHealthPoint()));
        return true;
    }

    @Override
    public boolean defend() {
        if (super.defend()) { // On appel la method 'defend' de la class parent afin de vérifier si on peut se défendre
            System.out.println(String.format("%s est rapide il esquive l'attaque !", name));
            return true;
        }

        return false;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }
}