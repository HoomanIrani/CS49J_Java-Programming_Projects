/////////////////////////
// Houman Irani
// CS 49J
// 11/28/2020
////////////////////////



import java.util.ArrayList;
import java.util.Arrays;



public class P18_4 {


    public static <T extends Measurable> T max(ArrayList<T> arrayList) {
        if (arrayList == null || arrayList.isEmpty())

            return null;

        T largestElement = arrayList.get(0);

        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i).getMeasure() > largestElement.getMeasure()) {

                largestElement = arrayList.get(i);
            }

        }

        return largestElement;
    }



    public static void main(String[] args) {


        Measurable[] arr = {

                new Measurable() {
                    @Override
                    public double getMeasure() {
                        return 9;
                    }
                },

                new Measurable() {
                    @Override
                    public double getMeasure() {
                        return 6;
                    }
                },

                new Measurable() {
                    @Override
                    public double getMeasure() {
                        return 3;
                    }
                },
        };


        System.out.println("The Largest Element: " + max(new ArrayList<>(Arrays.asList(arr))).getMeasure());

    }
}
