/*
 * 3.Aim of the program -Implement a GUI application which consists of one List Box and one button. 
 * The list box will have four different color names. When the user will select a color from the list box 
 * and click on the button, the panel color will be changed to that color.
 * Input: Select any color from the list box
 * Output: Panel background color will be changed accordingly
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class lab9_3 extends JFrame implements ActionListener {
    private JComboBox<String> colorList;
    private JButton changeColorBtn;
    private JPanel panel;

    lab9_3() {
        setTitle("Color Changer App");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create panel
        panel = new JPanel();
        getContentPane().add(panel, BorderLayout.CENTER);

        // Create combo box with color options
        String[] colors = { "Red", "Green", "Blue", "Yellow" };
        colorList = new JComboBox<>(colors);
        colorList.setSelectedIndex(0);
        panel.add(colorList);

        // Create button
        changeColorBtn = new JButton("Change Color");
        panel.add(changeColorBtn);
        changeColorBtn.addActionListener(this);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == changeColorBtn) {
            String selectedColor = (String) colorList.getSelectedItem();
            switch (selectedColor) {
                case "Red":
                    panel.setBackground(Color.RED);
                    break;
                case "Green":
                    panel.setBackground(Color.GREEN);
                    break;
                case "Blue":
                    panel.setBackground(Color.BLUE);
                    break;
                case "Yellow":
                    panel.setBackground(Color.YELLOW);
                    break;
                default:
                    break;
            }
        }
    }

    public static void main(String[] args) {
        new lab9_3();
    }
}
