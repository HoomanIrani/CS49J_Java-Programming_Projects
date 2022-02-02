public class Daily extends Appointment {

    public Daily(String desc, int y, int m, int d) {

        super(desc, y, m, d);

    }


    public boolean occursOn(int year, int month, int day) {


        if (getDay() == day & getMonth() == month)
            return true;


        else {

            return false;
        }

    }


    public String message() {


        return description + " Scheduled on " + getDay();

    }

}


