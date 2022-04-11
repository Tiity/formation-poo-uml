package pojo;

public abstract class AbstractCharacter implements ICharacter {
    
    protected String name;
    protected int healthPoint;
    protected int moveSpeed;

    public AbstractCharacter() {
    }

    public AbstractCharacter(String name, int healthPoint, int moveSpeed) {
        this.name = name;
        this.healthPoint = healthPoint;
        this.moveSpeed = moveSpeed;
    }

    public boolean attack(ICharacter enemy) {
        if (enemy == null || enemy.getHealthPoint() < 1) {
            System.out.println(String.format("%s est déjà à terre !", enemy.getName()));
            return false;
        }

        return true;
    }

    @Override
    public void move() {
        System.out.println(String.format("%s fait un bon de %d cases", name, moveSpeed));
    }

    @Override
    public void speak(String replique) {
        System.out.println(String.format("%s dit: \"%s\"", name, replique));
    }

    @Override
    public boolean defend() {
        int random = (int) ((Math.random() * (3 - 0)) + 0);
        return random > 0 ? true : false;
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int getHealthPoint() {
        return healthPoint;
    }

    @Override
    public void setHealthPoint(int healthPoint) {
        this.healthPoint = healthPoint;
    }

    public int getMoveSpeed() {
        return moveSpeed;
    }

    public void setMoveSpeed(int moveSpeed) {
        this.moveSpeed = moveSpeed;
    }
}
