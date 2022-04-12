package pojo;

public class Soldier extends AbstractCharacter {

    private int attackDamage;

    public Soldier(String name, int healthPoint, int moveSpeed, int attackDamage) {
        super(name, healthPoint, moveSpeed);
        this.attackDamage = attackDamage;
    }

    public void attack(AbstractCharacter enemy) {
        String attacking = String.format("%s a infligé %d de dégats à %s !", name, attackDamage, enemy.getName());
        System.out.println(attacking);
    }
}
