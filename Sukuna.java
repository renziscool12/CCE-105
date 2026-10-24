
class Sukuna extends GameCharacter {

    public Sukuna(String name, int health, int attackPower) {
        super(name, health, attackPower);
    }

    @Override
    public void attack() {
        System.out.println(name + " attacks with a devastating strike! It deals " + attackPower + " damage!");
    }

    @Override
    public void specialMove() {
        System.out.println(name
                + " uses Malevolent Shrine! It unleashes a flurry of cursed energy, dealing massive damage to all enemies!");
    }

    @Override
    public void takeDamage() {
        health -= attackPower;
        System.out.println(name + " takes " + attackPower + " damage! Remaining health: " + health);
    }
}