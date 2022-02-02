//////////////////////////////
// Houman Irani
// CS 49J
// 11/08/2020
/////////////////////////////



import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;

import javax.swing.JButton;

import javax.swing.JLabel;

import javax.swing.JFrame;

import javax.swing.JPanel;

import java.awt.*;

public class E10_18   {


    private static int Click1 = 0;

    private static int Click2 = 0;

    public static void main(String[] args)   {


        JFrame frame = new JFrame("Click Count");

        JPanel panel = new JPanel();



        panel.setLayout(new GridBagLayout());

        JButton button1 = new JButton("Button 1");

        panel.add(button1);



        JButton button2 = new JButton("Button 2");

        panel.add(button2);



        final JLabel label = new JLabel("Click a button");

        panel.add(label);
        frame.add(panel);

        button1.addActionListener(new ActionListener() //button click listener for button1

                                  {

                                      public void actionPerformed(ActionEvent e)

                                      {

                                          Click1++;

                                          System.out.println("Button1, clicked " + Click1 + " Times");

                                          label.setText("I'm Button1 clicked  "+ Click1 + " Times");

                                      }

                                  }

        );

        button2.addActionListener(new ActionListener() //button click listener for button1

                                  {

                                      public void actionPerformed(ActionEvent e)

                                      {

                                          Click2++;

                                          System.out.println("Button2, clicked " + Click2 + " Times");

                                          label.setText("I'm Button2 clicked  "+ Click2 + " Times");

                                      }

                                  }

        );

        frame.setSize(450, 200);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setVisible(true);

    }

}