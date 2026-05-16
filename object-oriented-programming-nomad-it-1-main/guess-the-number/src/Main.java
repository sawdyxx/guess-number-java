import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class Main extends JFrame {

    int number;
    int attempts = 0;

    JTextField input;
    JLabel result;

    Main() {

        setTitle("Угадай число");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        Random random = new Random();
        number = random.nextInt(100) + 1;

        JLabel text = new JLabel("Введите число от 1 до 100:");

        input = new JTextField(10);

        JButton button = new JButton("Проверить");

        result = new JLabel(" ");

        button.addActionListener(e -> {

            int guess = Integer.parseInt(input.getText());

            attempts++;

            if (guess > number) {
                result.setText("Меньше");
            }

            else if (guess < number) {
                result.setText("Больше");
            }

            else {
                result.setText("Угадал! Попыток: " + attempts);
            }

        });

        add(text);
        add(input);
        add(button);
        add(result);

        setVisible(true);
    }

    public static void main(String[] args) {

        new Main();

    }
}