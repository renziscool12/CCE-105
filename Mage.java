import java.util.Random;

class Mage extends GameCharacter {
    Random rand = new Random();
    int damage = rand.nextInt(attackPower / 2) + 10; // Random damage between 10 and half of attackPower
    int specialDamage = rand.nextInt(attackPower) + 20; // Random damage between 20 and attackPower

    public Mage(String name, int health, int attackPower) {
        super(name, health, attackPower);
    }

    @Override
    public void attack() {
        System.out.println(name + " casts a fireball! It deals " + damage + " damage!");
    }

    @Override
    public void specialMove() {
        System.out.println(name + " uses Meteor Strike! It deals " + specialDamage + " damage!");
    }

    @Override
    public void takeDamage() {
        health -= attackPower; // Assuming the damage taken is equal to the attacker's power
        System.out.println(name + " takes " + attackPower + " damage! Remaining health: " + health);
    }
}
