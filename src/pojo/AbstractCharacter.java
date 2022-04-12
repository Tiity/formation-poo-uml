package pojo;

public abstract class AbstractCharacter {

    protected String name;
    protected int healthPoint;
    protected int moveSpeed;

    public AbstractCharacter(String name, int healthPoint, int moveSpeed) {
        this.name = name;
        this.healthPoint = healthPoint;
        this.moveSpeed = moveSpeed;
    }

    public void speak(String replique) {
        String text = String.format("%s dit: \"%s\"", name, replique);
        System.out.println(text);
    }

    public void move() {
        String moving = String.format("%s a fait un bon de %d cases !", name, moveSpeed);
        System.out.println(moving);
    }

    public String getName() {
        return name;
    }

    public int getHealthPoint() {
        return healthPoint;
    }
}
