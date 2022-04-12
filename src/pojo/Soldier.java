package pojo;

public class Soldier {

    private int healthPoint;
    private String name;
    private int attackDamage;
    private int moveSpeed;

    public Soldier(int healthPoint, String name, int attackDamage, int moveSpeed) {
        this.healthPoint = healthPoint;
        this.name = name;
        this.attackDamage = attackDamage;
        this.moveSpeed = moveSpeed;
    }

    public void attack(String enemyName) {
        String attacking = String.format("%s a infligé %d de dégats à %s !", name, attackDamage, enemyName);
        System.out.println(attacking);
    }

    public void move() {
        String moving = String.format("%s a fait un bon de %d cases !", name, moveSpeed);
        System.out.println(moving);
    }
}
