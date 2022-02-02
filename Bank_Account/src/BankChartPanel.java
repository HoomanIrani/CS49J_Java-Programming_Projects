import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;
import javax.swing.JPanel;


public class BankChartPanel extends JPanel {

    private int valueSize;
    private double[] value;
    private static final int WIDTH1 = 400;
    private static final int HEIGHT1 = 400;

    public BankChartPanel() {

        setPreferredSize(new Dimension(WIDTH, HEIGHT));

    }


    public void setCount(int count) {

        value = new double[count];
        valueSize = 0;
        repaint();
    }


    public void addValue(double v) {

        if (valueSize == value.length) {
            return;
        }

        value[valueSize] = v;
        valueSize++;
        repaint();
    }

    public void paintComponent(Graphics g) {

        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;

        if (valueSize == 0) {

            return;
        }


        double max = value[0];
        for (int i = 0; i < valueSize; i++) {

            if (value[i] > max) {

                max = value[i];
            }
        }


        for (int j = 0; j < valueSize; j++) {

            double width = getWidth() / value.length;
            double height = value[j] * getHeight() / max;

            Rectangle2D.Double bar = new Rectangle2D.Double(j * getWidth() / value.length, getHeight() - height, width, height);
            g2.draw(bar);


        }
    }
}