/*
 * 3. Aim of the program -Design a Stop Watch using event handling and
 * multi-threading in Java.
 */
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

class StopWatch extends JFrame implements ActionListener {
    private static final long serialVersionUID = 1L;
    private JLabel label;
    private JButton startButton;
    private JButton stopButton;
    private JButton resetButton;
    private long startTime;
    private long stopTime;
    private boolean isRunning;

    public StopWatch() {
        label = new JLabel("00:00:00");
        startButton = new JButton("Start");
        stopButton = new JButton("Stop");
        resetButton = new JButton("Reset");
        startTime = 0;
        stopTime = 0;
        isRunning = false;

        setLayout(null);
        label.setBounds(100, 50, 100, 30);
        startButton.setBounds(50, 100, 100, 30);
        stopButton.setBounds(150, 100, 100, 30);
        resetButton.setBounds(100, 150, 100, 30);

        add(label);
        add(startButton);
        add(stopButton);
        add(resetButton);

        startButton.addActionListener(this);
        stopButton.addActionListener(this);
        resetButton.addActionListener(this);

        setSize(300, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == startButton) {
            if (!isRunning) {
                isRunning = true;
                startTime = System.currentTimeMillis();
                new Thread(() -> {
                    while (isRunning) {
                        long elapsedTime = System.currentTimeMillis() - startTime;
                        long seconds = elapsedTime / 1000;
                        long minutes = seconds / 60;
                        long hours = minutes / 60;
                        seconds %= 60;
                        minutes %= 60;
                        label.setText(String.format("%02d:%02d:%02d", hours, minutes, seconds));
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e1) {
                            e1.printStackTrace();
                        }
                    }
                }).start();
            }
        } else if (e.getSource() == stopButton) {
            if (isRunning) {
                isRunning = false;
                stopTime = System.currentTimeMillis();
            }
        } else if (e.getSource() == resetButton) {
            if (!isRunning) {
                startTime = 0;
                stopTime = 0;
                label.setText("00:00:00");
            }
        }
    }
}

class lab10_3 {
    public static void main(String[] args) {
        new StopWatch();
    }
}
