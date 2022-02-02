//////////////////////////
// Houman Irani
// CS 49J
// 11/25/2020
/////////////////////////



public class P18_1 {


    public static void main(String[] args) {


        Element[] myElement = new Element[5];
        myElement[0] = new Element<Integer>(3);
        myElement[1] = new Element<Double>(5.5);
        myElement[2] = new Element<Double>(99.0);
        myElement[3] = new Element<Integer>(1);



        PairUtil<Double, Double> pair = PairUtil.minmax(myElement);
        System.out.println("The min-max pair is: " + pair);


    }
}