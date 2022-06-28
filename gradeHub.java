import javax.swing.*;
import java.awt.*;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.InvalidPropertiesFormatException;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTabbedPane;

public class gradeHub {
    public gradeHub() {
        createUI();
    }

    public void createUI() {
        JFrame frame = new JFrame("GradeHub");
        frame.setSize(450, 550);

        frame.setResizable(false);
        frame.getContentPane().setBackground(Color.decode("#EBE8F0"));
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setLayout(null);


        //Create JTextField

        JTextField tf1 = new JTextField();
        JTextField tf2 = new JTextField();
        JTextField tf3 = new JTextField();


        tf1.setBounds(112,110,225,35);
        tf2.setBounds(112,165,225,35);
        tf3.setBounds(112,220,225,35);


        //Create Buttons

        JButton btn = new JButton("Calculate");
        JButton clear = new JButton("CLear");
        btn.setBounds(137, 270, 175, 25);
        clear.setBounds(137, 300, 175, 25);


        //Create JLabel

        JLabel label1 = new JLabel("Your current grade is");
        JLabel label2 = new JLabel("You score you got");
        JLabel label3 = new JLabel("Your final is worth");
        JLabel total = new JLabel();
        JLabel exceptions = new JLabel();

        label1.setBounds(150, 85,225, 30);
        label2.setBounds(150, 140, 225, 30);
        label3.setBounds(150, 195, 225, 30);
        total.setBounds(137, 330, 225, 30);
        exceptions.setBounds(150, 450, 225,30);


        //ActionListener

        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {

                    int currentGrade = Integer.parseInt(tf1.getText());
                    int youWant = Integer.parseInt(tf2.getText());
                    int percentage = Integer.parseInt(tf2.getText());

                    int getPercentage = 100 % percentage;

                    int totals = (youWant - currentGrade * (1- getPercentage )) / getPercentage;
                   total.setText(String.valueOf(totals));

                } catch (Exception i) {
                    exceptions.setText("Type a valid number");
                } finally {
                    total.getText();
                }
            }
        });

        clear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tf1.setText("");
                tf2.setText("");
                tf3.setText("");
                total.setText("");
                exceptions.setText("");
            }
        });


        frame.add(tf1);
        frame.add(tf2);
        frame.add(tf3);
        frame.add(btn);
        frame.add(label1);
        frame.add(label2);
        frame.add(label3);
        frame.add(clear);
        frame.add(total);
        frame.add(exceptions);
        frame.setVisible(true);
    }



    }



