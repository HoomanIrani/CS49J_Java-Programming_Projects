///////////////////////
// Houman Irani
// CS49J
// 09/29/2020
// This Application asks users heights and diameters of a can and calculate volume and area.
//////////////////////


import java.text.DecimalFormat;
import java.util.Scanner;

public class E4_23 {

    public static void main(String[] args) {

        double heights;
        double diameters;
        Scanner in = new Scanner(System.in);
        DecimalFormat id = new DecimalFormat("#.##");


        System.out.print("Please enter height of the Soda Can? ");
        heights = in.nextDouble();

        System.out.print("Please enter diameter of the Soda Can? ");
        diameters = in.nextDouble();

        SodaCan mySoda = new SodaCan(heights, diameters);

        System.out.println("Soda can volume: " + id.format(mySoda.getVolume()));
        System.out.println("Soda can area: " + id.format(mySoda.getSurfaceArea()));
        

    }
}


