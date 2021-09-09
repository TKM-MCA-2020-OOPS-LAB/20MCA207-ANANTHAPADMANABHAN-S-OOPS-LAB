import java.awt.event.*;
import java.awt.*;


class calculator implements ActionListener {

    Button b1, b2, b3, b4;
    TextField t1, t2;
    Label l1;
    Frame f;

    calculator() {

        f = new Frame(" Simple Calculator");

        t1 = new TextField();
        t1.setBounds(50, 100, 150, 30);
        f.add(t1);


        t2 = new TextField();
        t2.setBounds(50, 150, 150, 30);
        f.add(t2);


        l1 = new Label("Result :");
        l1.setBounds(50, 300, 150, 30);
        f.add(l1);

        b1 = new Button("+");
        b1.setBounds(150, 200, 100, 30);
        f.add(b1);

        b2 = new Button("-");
        b2.setBounds(250, 200, 100, 30);
        f.add(b2);

        b3 = new Button("*");
        b3.setBounds(350, 200, 100, 30);
        f.add(b3);

        b4 = new Button("/");
        b4.setBounds(450, 200, 100, 30);
        f.add(b4);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);



        f.setLayout(null);
        f.setSize(600, 500);
        f.setVisible(true);

    }

    public void actionPerformed(ActionEvent e) {

        int a = Integer.parseInt(t1.getText());
        int b = Integer.parseInt(t2.getText());
        int c = 0;

        if (e.getSource().equals(b1)) {
            c = a + b;
        } else if (e.getSource().equals(b2)) {
            c = a - b;
        } else if (e.getSource().equals(b3)) {
            c = a * b;
        } else if (e.getSource().equals(b4)) {
            c = a / b;
        }
        l1.setText(String.valueOf("Result is :   " + c));
    }

    public static void main(String args[]) {
        calculator ctr = new calculator();
    }
}

