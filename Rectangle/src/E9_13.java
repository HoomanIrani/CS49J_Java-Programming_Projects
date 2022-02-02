//////////////////////
// Houman Irani
// CS49J
// 10/05/2020
// This application calculate area and perimeter of a rectangle.
/////////////////////
import java.util.*;

public class E9_13 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int x,y;
        int width, length;

        System.out.print("Please enter location of X: ");
        x = in.nextInt();

        System.out.print("Please enter location of Y: ");
        y = in.nextInt();

        System.out.print("Please enter the Width: ");
        width = in.nextInt();


        System.out.print("Please enter the Length: ");
        length = in.nextInt();


        BetterRectangle rect = new BetterRectangle(x, y, width, length);

        System.out.println("Perimeter: " +rect.getPerimeter());
        System.out.println("Area: " +rect.getArea());


    }
}




