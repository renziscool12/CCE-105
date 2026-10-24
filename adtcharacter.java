import java.util.Stack;

public class adtcharacter {
    Stack<GameCharacter> characterStack = new Stack<>();

    public void addScore(GameCharacter character) {
        characterStack.push(character);
    }

    public void displayScores() {
        System.out.println("Character Scores:");
        for (GameCharacter character : characterStack) {
            System.out.println(
                    character.name + " - Health: " + character.health + ", Attack Power: " + character.attackPower);
        }
    }

    public void removeScore() {
        if (!characterStack.isEmpty()) {
            GameCharacter removedCharacter = characterStack.pop();
            System.out.println("Removed character: " + removedCharacter.name);
        } else {
            System.out.println("No characters to remove.");
        }
    }
}
