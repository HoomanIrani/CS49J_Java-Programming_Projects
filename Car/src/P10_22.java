//////////////////////////////
// Houman Irani
// CS 49J
// 11/12/2020
/////////////////////////////


import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.Timer;


class MovingCar extends JPanel {

    List<Car> mycar;


    public MovingCar() {

        mycar = new ArrayList<>();
        mycar.add(new Car(200, 250));
        Timer timer1 = new Timer(80, new ActionListener()  {

            public void actionPerformed(ActionEvent e) {

                for (Car car : mycar) {
                    car.moveCar1();
                    repaint();
                }
            }
        });

        timer1.start();
    }


    protected void paintComponent(Graphics pc) {


        super.paintComponent(pc);
        for (Car car : mycar) {
            car.drawCarFirst(pc);

        }
    }


    public Dimension getPreferredSize() {


        return new Dimension(500,400);
    }


    public class Car {
        int x, y;

        public Car(int x, int y) {
            this.x = 20;
            this.y = 20;
        }


        public void drawCarFirst(Graphics g1) {
            g1.setColor(Color.RED);
            g1.fillRect(x, y, 100, 30);
            g1.setColor(Color.BLACK);
            g1.fillOval(x + 10, y + 20, 15, 15);
            g1.fillOval(x + 65, y + 20, 15, 15);
            g1.fillRect(x + 15, y - 20, 60, 20);
        }


        public void moveCar1() {
            if (x == 500) {
                x = -50;
            } else {
                x += 5;
            }
        }
    }

    public static void main(String[] args) {


        SwingUtilities.invokeLater(new Runnable() {


            public void run() {


                JFrame frame = new JFrame();
                frame.add(new MovingCar());
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.pack();
                frame.setLocationRelativeTo(null);
                frame.setVisible(true);

            }
        });
    }
}