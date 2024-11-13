/*
 * 2. Aim of the program -Write a GUI program in Java with three Labels – Enter
 * the First Number, Enter the Second Number, Result, and three text fields for
 * - first number, second number and result and four buttons - Add, Sub,
 * multiply and reset as shown below. On clicking of any of these buttons, the
 * corresponding operation should be performed with input1 and input2 and the
 * result should be displayed in the result box.
 * Input: First and second number
 * Output: Appropriate result will be displayed in the result text field
 */

import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Calculator extends JFrame implements ActionListener {
    // Components
    private JLabel firstNumberLabel, secondNumberLabel, resultLabel;
    private JTextField firstNumberField, secondNumberField, resultField;
    private JButton addButton, subButton, multiplyButton, resetButton;

    public Calculator() {
        setTitle("Calculator");
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(5, 2));

        // Initialize components
        firstNumberLabel = new JLabel("Enter the First Number:");
        firstNumberField = new JTextField();
        secondNumberLabel = new JLabel("Enter the Second Number:");
        secondNumberField = new JTextField();
        resultLabel = new JLabel("Result:");
        resultField = new JTextField();
        resultField.setEditable(false);
        addButton = new JButton("Add");
        subButton = new JButton("Sub");
        multiplyButton = new JButton("Multiply");
        resetButton = new JButton("Reset");

        // Add action listeners
        addButton.addActionListener(this);
        subButton.addActionListener(this);
        multiplyButton.addActionListener(this);
        resetButton.addActionListener(this);

        // Add components to the frame
        add(firstNumberLabel);
        add(firstNumberField);
        add(secondNumberLabel);
        add(secondNumberField);
        add(resultLabel);
        add(resultField);
        add(addButton);
        add(subButton);
        add(multiplyButton);
        add(resetButton);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == addButton) {
            try {
                double num1 = Double.parseDouble(firstNumberField.getText());
                double num2 = Double.parseDouble(secondNumberField.getText());
                resultField.setText(String.valueOf(num1 + num2));
            } catch (NumberFormatException ex) {
                resultField.setText("Invalid input");
            }
        } else if (e.getSource() == subButton) {
            try {
                double num1 = Double.parseDouble(firstNumberField.getText());
                double num2 = Double.parseDouble(secondNumberField.getText());
                resultField.setText(String.valueOf(num1 - num2));
            } catch (NumberFormatException ex) {
                resultField.setText("Invalid input");
            }
        } else if (e.getSource() == multiplyButton) {
            try {
                double num1 = Double.parseDouble(firstNumberField.getText());
                double num2 = Double.parseDouble(secondNumberField.getText());
                resultField.setText(String.valueOf(num1 * num2));
            } catch (NumberFormatException ex) {
                resultField.setText("Invalid input");
            }
        } else if (e.getSource() == resetButton) {
            firstNumberField.setText("");
            secondNumberField.setText("");
            resultField.setText("");
        }
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Calculator());
    }
}