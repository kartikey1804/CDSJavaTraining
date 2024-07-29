import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Calculator extends JFrame implements ActionListener {
    private JTextField display;
    private String operand1 = "", operand2 = "", operator = "";

    public Calculator() {
        // Create frame and textfield
        JFrame frame = new JFrame("Calculator");
        display = new JTextField(16);
        display.setEditable(false);

        // Create buttons
        String[] buttonLabels = {
                "7", "8", "9", "/",
                "4", "5", "6", "*",
                "1", "2", "3", "-",
                "0", ".", "C", "+"
        };

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 4));

        for (String label : buttonLabels) {
            JButton button = new JButton(label);
            button.addActionListener(this);
            panel.add(button);
        }

        JButton equalsButton = new JButton("=");
        equalsButton.addActionListener(this);
        panel.add(equalsButton);

        // Add components to frame
        frame.add(display, BorderLayout.NORTH);
        frame.add(panel);
        frame.setSize(200, 250);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {
        String input = e.getActionCommand();

        if (input.charAt(0) >= '0' && input.charAt(0) <= '9' || input.equals(".")) {
            if (!operator.isEmpty()) {
                operand2 += input;
            } else {
                operand1 += input;
            }
            display.setText(operand1 + operator + operand2);
        } else if (input.equals("C")) {
            operand1 = operand2 = operator = "";
            display.setText("");
        } else if (input.equals("=")) {
            double result = switch (operator) {
                case "+" -> Double.parseDouble(operand1) + Double.parseDouble(operand2);
                case "-" -> Double.parseDouble(operand1) - Double.parseDouble(operand2);
                case "*" -> Double.parseDouble(operand1) * Double.parseDouble(operand2);
                case "/" -> Double.parseDouble(operand1) / Double.parseDouble(operand2);
                default -> 0;
            };
            display.setText(operand1 + operator + operand2 + "=" + result);
            operand1 = Double.toString(result);
            operator = operand2 = "";
        } else {
            if (!operator.isEmpty() && !operand2.isEmpty()) {
                actionPerformed(new ActionEvent(this, ActionEvent.ACTION_PERFORMED, "="));
            }
            operator = input;
            display.setText(operand1 + operator);
        }
    }

    public static void main(String[] args) {
        new Calculator();
    }
}