public class Onetime extends Appointment {

    public Onetime(String desc, int y, int m, int d) {


        super(desc, y, m, d);
    }


    public boolean occursOn(int y, int m, int d) {

        if (getDay() == d && getMonth() == m && getYear() == y) {

            return true;

        } else {

            return false;

        }

    }

}