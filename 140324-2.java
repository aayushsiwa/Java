// 1. Aim of the program -Design a registration form using Swing with following
// components on it – Label, Textbox, Text area, Checkbox, Radio button and
// Button, Image.

import javax.swing.*;
import java.awt.*;

class RegistrationForm extends JFrame {
    // Components
    private JLabel nameLabel, addressLabel;
    private JTextField nameField;
    private JTextArea addressArea;
    private JCheckBox agreeCheckBox;
    private JRadioButton maleRadioButton, femaleRadioButton;
    private ButtonGroup genderGroup;
    private JButton submitButton;
    private ImageIcon logoIcon;

    public RegistrationForm() {
        setTitle("Registration Form");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(7, 2));
        // setLayout(new FlowLayout());

        // Initialize components
        nameLabel = new JLabel("Name:");
        nameField = new JTextField();
        addressLabel = new JLabel("Address:");
        addressArea = new JTextArea();
        agreeCheckBox = new JCheckBox("I agree to the terms and conditions");
        maleRadioButton = new JRadioButton("Male");
        femaleRadioButton = new JRadioButton("Female");
        genderGroup = new ButtonGroup();
        genderGroup.add(maleRadioButton);
        genderGroup.add(femaleRadioButton);
        submitButton = new JButton("Submit");
        logoIcon = new ImageIcon("logo.png"); // Replace "logo.png" with your image file path

        // Add components to the frame
        add(nameLabel);
        add(nameField);
        add(addressLabel);
        add(addressArea);
        add(agreeCheckBox);
        add(new JLabel()); // Empty cell to align the radio buttons
        add(maleRadioButton);
        add(femaleRadioButton);
        add(new JLabel()); // Empty cell to align the submit button
        add(submitButton);
        add(new JLabel()); // Empty cell to align the logo
        add(new JLabel(logoIcon));

        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new RegistrationForm());
    }
}
