// create a java swing application that displays a window with a non functional button

import java.awt.*;

class lab9 extends Frame {
    lab9() {
        Button b = new Button("Click me");
        b.setBounds(50, 100, 100, 50);
        add(b);
        setSize(300, 300);
        setLayout(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        lab9 f = new lab9();
    }
}