/*
 * AWT & Swing
 * These are java modules used for creating GUI applications.
 * AWT: Abstract Window Toolkit
 * Swing: It is a part of AWT. It is a set of classes that provide more powerful and flexible components than AWT.
 * AWT is heavy weight components and Swing is light weight components.
 * Container is a component that can contain other components.
 * Container can either be a window or a panel.
 * 
 * Window: It is a top level container.
 * Window is a container that container frames and dialog boxes.
 * Frame: It is a top level container that contains a title bar, border and buttons for closing, minimizing and maximizing the window.
 * Dialog: It is a top level container that contains a title bar, border and buttons for closing the dialog box.
 * 
 * Panel: It is a container that can contain other components.
 * 
 * Components that can be placed in a  container are called as child components.
 * Such as Label, Button, TextField, TextArea, CheckBox, RadioButton, ComboBox, ListBox, etc.
 * 
 * 
 */

import java.awt.*;

class AWTEx1 extends Frame{
    AWTEx1(){
        Button b = new Button("Click Me");
        b.setBounds(30, 100, 80, 30);
        Label l =new Label("First Label");
        l.setBounds(30, 50, 100, 30);
        TextField t = new TextField();
        t.setBounds(30, 150, 100, 30);
        add(l);
        add(t);
        add(b);
        setSize(300, 300);
        setLayout(null);
        setVisible(true);
    }
    public static void main(String[] args) {
        AWTEx1 a = new AWTEx1();
    }
}