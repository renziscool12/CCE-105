class Gojo extends GameCharacter {

    public Gojo(String name, int health, int attackPower) {
        super(name, health, attackPower);
    }

    @Override
    public void attack() {
        System.out.println(name + " attacks with a powerful strike! It deals " + attackPower + " damage!");
    }

    @Override
    public void specialMove() {
        System.out.println(name
                + " uses his special move: Infinity! It creates an impenetrable barrier, making him invincible for a short time!");
    }

    @Override
    public void takeDamage() {
        health -= attackPower; // Assuming the damage taken is equal to the attacker's power
        System.out.println(name + " takes " + attackPower + " damage! Remaining health: " + health);
    }
}