/////////////////////////////
// Houman Irani
// 11/15/20
// CS 49J
////////////////////////////


import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;




public class E20_7 extends JFrame {

    private int rectangles = 1;

    private Random randomRect = new Random();

    public static void main (String[] args) {

        SwingUtilities.invokeLater(new Runnable()   {


            public void run() {

                E20_7 rect = new E20_7();
                rect.setTitle("SAMPLE DEMO");
                rect.setSize(new Dimension(340, 440));
                rect.setVisible(true);

            }
        });
    }



    public E20_7 ()   {


        super();
        setLayout(new BorderLayout());
        JButton more = new JButton("More");
        JButton fewer = new JButton("Fewer");



        more.addActionListener(new ActionListener()  {

            public void actionPerformed(ActionEvent ea)  {

                rectangles  *= 2;
                E20_7.this.repaint();
            }
        });


        fewer.addActionListener(new ActionListener()  {

            public void actionPerformed(ActionEvent ea) {

                if (rectangles >= 2) {

                    rectangles /= 2;
                    E20_7.this.repaint();

                }
            }
        });

        JPanel rectangleArea = new JPanel()  {


            public void paintComponent(Graphics gs) {

                super.paintComponent(gs);
                gs.setColor(Color.GRAY);


                for(int i = 0; i < rectangles; i++)  {

                    int a = (int)Math.floor(randomRect.nextDouble()*getWidth());
                    int b = (int)Math.floor(randomRect.nextDouble()*getHeight());
                    int c = (int)Math.floor(randomRect.nextDouble()*(getWidth()-a));
                    int d = (int)Math.floor(randomRect.nextDouble()*(getHeight()-b));
                    gs.drawRect(a,b,c,d);
                }
            }

        };



        add(more, BorderLayout.NORTH);
        add(fewer, BorderLayout.SOUTH);
        add(rectangleArea, BorderLayout.CENTER);

    }

}