class Warrior extends GameCharacter {
    public Warrior(String name, int health, int attackPower) {
        super(name, health, attackPower);
    }

    @Override
    public void attack() {
        System.out.println(name + " swings a mighty sword!");
    }

    @Override
    public void specialMove() {
        System.out.println(name + " uses Shield Bash!");
    }

    @Override
    public void takeDamage() {
        health -= attackPower; // Assuming the damage taken is equal to the attacker's power
        System.out.println(name + " takes " + attackPower + " damage! Remaining health: " + health);
    }
}
