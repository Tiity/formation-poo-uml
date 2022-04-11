package pojo;

public interface ICharacter {
    public void speak(String replique);
    public boolean attack(ICharacter enemy);
    public void move();
    public boolean defend();
    public String getName();
    public void setHealthPoint(int healthPoint);
    public int getHealthPoint();
}