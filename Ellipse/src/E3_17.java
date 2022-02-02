
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import javax.swing.JFrame;
import javax.swing.JComponent;

public class E3_17 {

    static class Ellipse {

        public static void main(String[] args)  {

            JFrame frame = new JFrame();
            frame.setSize(250, 250);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            EllipseComponent component = new EllipseComponent();
            frame.add(component);
            frame.setVisible(true);
        }
    }


    static class EllipseComponent extends JComponent  {

        public void paintComponent(Graphics pc)  {

            Graphics2D g2 = (Graphics2D) pc;
            Graphics2D g1 = (Graphics2D) pc;
            Ellipse2D.Double ellipse = new Ellipse2D.Double(0,0, getWidth(), getHeight());
            g1.setColor(Color.BLACK);
            g1.draw(ellipse);
            g2.setColor(Color.YELLOW);
            g2.fill(ellipse);

        }
    }
}