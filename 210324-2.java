/*
 * 1. Aim of the program -Design a GUI application which consists of three Label
 * named as Red, Green and blue, three combo boxes which will consist the value
 * from 0 to 255 and one button named as show output. The user will select
 * different values from three combo boxes. When the user clicks on the button,
 * the panel background will be changed accordingly as per the value passed in
 * RGB format.
 * Input: select three color value(0-255) from 3 different combo box.
 * Output: The panel color will be changed accordingly
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class lab9_2 extends JFrame implements ActionListener {
	private JComboBox<String> redList, greenList, blueList;
	private JButton showOutputBtn;
	private JPanel panel;

	lab9_2() {
		setTitle("Color Changer App");
		setSize(300, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// Create panel
		panel = new JPanel();
		getContentPane().add(panel, BorderLayout.CENTER);

		// Create combo box with color options
		String[] colors = new String[256];
		for (int i = 0; i < 256; i++) {
			colors[i] = Integer.toString(i);
		}
		redList = new JComboBox<>(colors);
		greenList = new JComboBox<>(colors);
		blueList = new JComboBox<>(colors);
		panel.add(redList);
		panel.add(greenList);
		panel.add(blueList);

		// Create button
		showOutputBtn = new JButton("Show Output");
		panel.add(showOutputBtn);
		showOutputBtn.addActionListener(this);

		setVisible(true);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == showOutputBtn) {
			int red = Integer.parseInt((String) redList.getSelectedItem());
			int green = Integer.parseInt((String) greenList.getSelectedItem());
			int blue = Integer.parseInt((String) blueList.getSelectedItem());
			panel.setBackground(new Color(red, green, blue));
		}
	}

	public static void main(String[] args) {
		new lab9_2();
	}
}