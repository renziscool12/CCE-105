abstract class GameCharacter {
    String name;
    int health;
    int attackPower;

    public GameCharacter(String name, int health, int attackPower) {
        this.name = name;
        this.health = health;
        this.attackPower = attackPower;
    }

    // Abstract methods (must be implemented by subclasses)
    public abstract void attack();

    public abstract void specialMove();

    public abstract void takeDamage();

    // Concrete method
    public void showName() {
        System.out.println("Character: " + name);
    }
}
