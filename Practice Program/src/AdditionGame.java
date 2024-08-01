import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
public class AdditionGame extends JFrame {
    JLabel questionLabel;
    JTextField answerField;
    JButton submitButton;
    JLabel feedbackLabel;
    JLabel scoreLabel;

    int num1;
    int num2;
    int score;

    public AdditionGame() {
    setTitle("Addition Game");
    setSize(300,300);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setLayout(new GridLayout(5, 1));

    questionLabel =new
    JLabel("Question: ");
    add(questionLabel);
    answerField =new
    JTextField();
    add(answerField);
    submitButton =new
    JButton("Submit");
    add(submitButton);
    feedbackLabel =new
    JLabel("Play Responsibly ");
    add(feedbackLabel);
    scoreLabel =new
    JLabel("Score: 0");
    add(scoreLabel);

        submitButton.addActionListener(new
    SubmitButtonListener());
    generateQuestion();
    setVisible(true);
}
    public void generateQuestion() {
        Random num = new Random();
        num1 = num.nextInt(100);
        num2 = num.nextInt(100);
        questionLabel.setText("What is " + num1 + " + " + num2 + "?");
    }
    private class SubmitButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                int answer = Integer.parseInt(answerField.getText());
                if (answer == num1 + num2) {
                    feedbackLabel.setText("Correct!");
                    score++;
                } else {
                    feedbackLabel.setText("Game Over. Now Get Lost" );
                }
                scoreLabel.setText("Score: " + score);
                answerField.setText("");
                generateQuestion();
            } catch (NumberFormatException ex) {
                feedbackLabel.setText("Please enter a valid number.");
            }
        }
    }
    public static void main(String[] args) {
        new AdditionGame();
    }
}