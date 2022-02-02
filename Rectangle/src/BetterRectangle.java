import java.awt.Rectangle;

public class BetterRectangle extends Rectangle {


    public BetterRectangle(int x, int y, int width, int height) {

        super();
        setSize(width, height);
        setLocation(x, y);
    }



    public double getPerimeter() {

        return (2 * getWidth() * getHeight());
    }



    public double getArea() {

        return getWidth() * getHeight();
    }

}
