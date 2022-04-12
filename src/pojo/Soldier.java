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

    public void move() {
        String moving = String.format("%s a fait un bon de %d cases !", name, moveSpeed);
        System.out.println(moving);

        // System.out.println(name + " a fait un bon de " + moveSpeed + " cases !");
    }
}
