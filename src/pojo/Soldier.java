package pojo;

public class Soldier extends AbstractCharacter {

    private int attackDamage;

    public Soldier() {
        
    }

    public Soldier(String name, int healthPoint, int moveSpeed, int attackDamage) {
        super(name, healthPoint, moveSpeed);
        this.attackDamage = attackDamage;
    }

    @Override
    public boolean attack(ICharacter enemy) {

        if (!super.attack(enemy)) { // On appel la method 'attack' de la class parent afin de vérifier si on peut attaquer l'énemie
            return false;
        }

        if (enemy.defend()) { // si l'énemie se defend on retourne false car l'attaque a échoué
            return false;
        }

        int healthPoint = enemy.getHealthPoint() - attackDamage; // on recupère les point de vie de l'énemie et on les soustraits avec les point de dégats du soldat
        enemy.setHealthPoint(healthPoint); // on met à jour les points de vie de l'énemie

        System.out.println(String.format("%s donne un coup d'épée spéctaculaire ! %s perd %d point de vie, il lui reste %d", name, enemy.getName(), attackDamage, enemy.getHealthPoint()));
        return true; // l'attaque est passée on retourne true
    }

    @Override
    public boolean defend() {
        if (super.defend()) { // On appel la method 'defend' de la class parent afin de vérifier si on peut se défendre
            System.out.println(String.format("%s est robuste il pare l'attaque !", name));
            return true;
        }

        return false;
    }

    public int getAttackDamage() {
        return attackDamage;
    }

    public void setAttackDamage(int attackDamage) {
        this.attackDamage = attackDamage;
    }
}