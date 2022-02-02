public class Appointment {

    String description;

    private int day;
    private int month;
    private int year;

    /**
     * This constructs the Appointment class.
     * @param desc is the descreption.
     * @param year is the year of appointment.
     * @param month is the month of appointment.
     * @param day is the day of appointment.
     */


    public Appointment(String desc, int year, int month, int day) {
        description = desc;
        this.day = day;
        this.month = month;
        this.year = year;

    }

    public boolean occursOn(int year2, int month2, int day2) {


        if (getDay() == day2 && getMonth() == month2 && getYear() == year2) {

            return true;

        }

        else {

            return false;
        }


    }


    public String getDescription() {

        return description;

    }


    public void setDescription(String description) {

        this.description = description;

    }


    public int getDay() {

        return day;

    }


    public void setDay(int day) {

        this.day = day;

    }


    public int getMonth() {

        return month;

    }


    public void setMonth(int month) {

        this.month = month;

    }


    public int getYear() {

        return year;

    }


    public void setYear(int year) {

        this.year = year;

    }


    public String message() {

        return description + " scheduled " + " on " + month + "/" + day + "/" + year;

    }

}


