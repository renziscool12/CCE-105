
import javax.swing.*;
import java.awt.*;

public class CharacterGUI extends JFrame {

    adtcharacter stack = new adtcharacter();
    JTextArea output = new JTextArea(15, 40);

    public CharacterGUI() {
        setTitle("Game Character Manager");
        setSize(500, 450);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        setLocationRelativeTo(null); // Center the window

        JButton gojo = new JButton("Add Gojo");
        JButton sukuna = new JButton("Add Sukuna");
        JButton warrior = new JButton("Add Warrior");
        JButton mage = new JButton("Add Mage");
        JButton view = new JButton("View Characters");
        JButton attack = new JButton("Attack Top");
        JButton special = new JButton("Special Move");
        JButton remove = new JButton("Remove Top");

        add(gojo);
        add(sukuna);
        add(warrior);
        add(mage);
        add(view);
        add(attack);
        add(special);
        add(remove);

        output.setEditable(false);
        add(new JScrollPane(output));

        gojo.addActionListener(e -> {
            stack.addScore(new Gojo("Gojo Satoru", 100, 50));
            output.setText("Gojo Satoru added!");
        });

        sukuna.addActionListener(e -> {
            stack.addScore(new Sukuna("Ryomen Sukuna", 120, 60));
            output.setText("Ryomen Sukuna added!");
        });

        warrior.addActionListener(e -> {
            stack.addScore(new Warrior("Warrior", 150, 40));
            output.setText("Warrior added!");
        });

        mage.addActionListener(e -> {
            stack.addScore(new Mage("Mage", 80, 70));
            output.setText("Mage added!");
        });

        view.addActionListener(e -> {
            output.setText("");

            if (stack.characterStack.isEmpty()) {
                output.setText("Stack is empty!");
                return;
            }

            for (GameCharacter c : stack.characterStack) {
                output.append(c.name + " | Health: " + c.health
                        + " | Attack: " + c.attackPower + "\n");
            }
        });

        attack.addActionListener(e -> {
            if (!stack.characterStack.isEmpty()) {
                GameCharacter c = stack.characterStack.peek();
                output.setText(c.name + " attacks!\nDamage: " + c.attackPower);
            } else {
                output.setText("Stack is empty!");
            }
        });

        special.addActionListener(e -> {
            if (!stack.characterStack.isEmpty()) {
                GameCharacter c = stack.characterStack.peek();
                output.setText(c.name + " uses a special move!");
            } else {
                output.setText("Stack is empty!");
            }
        });

        remove.addActionListener(e -> {
            if (!stack.characterStack.isEmpty()) {
                GameCharacter c = stack.characterStack.pop();
                output.setText(c.name + " removed from the stack!");
            } else {
                output.setText("Stack is empty!");
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new CharacterGUI().setVisible(true);
        });
    }
}
