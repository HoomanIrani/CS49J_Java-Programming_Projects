////////////////////////
// Houman Irani
// CS 49J
// 11/17/20
///////////////////////



import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.SwingUtilities;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;



public class P20_1 extends JFrame {

    private int rectangles = 1;
    private Random randomRect = new Random();

    public static void main(String[] args) {

        SwingUtilities.invokeLater(new Runnable()  {

            public void run() {

                P20_1 rect = new P20_1();
                rect.setTitle("Rectangles");
                rect.setSize(new Dimension(340, 440));
                rect.setVisible(true);

            }
        });
    }


    public P20_1()  {

        super();

        setLayout(new BorderLayout());


        @SuppressWarnings("unused") final JSlider slider = new JSlider(JSlider.HORIZONTAL, 0, 500, 1);

        slider.addChangeListener(new ChangeListener() {
            @Override

            public void stateChanged(ChangeEvent arg0) {
                rectangles = slider.getValue();
                P20_1.this.repaint();

            }

        });





        JPanel rectangleArea = new JPanel()  {

            public void paintComponent(Graphics gs)   {

                super.paintComponent(gs);
                gs.setColor(Color.LIGHT_GRAY);


                for(int i = 0; i < rectangles; i++) {

                    int a= (int)Math.floor(randomRect.nextDouble()*getWidth());
                    int b=(int)Math.floor(randomRect.nextDouble()*getHeight());
                    int c = (int)Math.floor(randomRect.nextDouble()*(getWidth()-a));
                    int d = (int)Math.floor(randomRect.nextDouble()*(getHeight()-b));
                    gs.drawRect(a,b,c,d);

                }
            }

        };


        add(slider, BorderLayout.NORTH);
        add(rectangleArea, BorderLayout.CENTER);

    }

}