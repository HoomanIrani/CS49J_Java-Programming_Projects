public class Appointment {

    String description;

    private int day;
    private int month;
    private  int year;

    public Appointment(String desc, int y, int m, int d) {
        description = desc;
        day = d;
        month = m;
        year = y;

    }

    public  boolean occursOn (int year2, int month2, int day2)
    {
        if (getDay() == day2 && getMonth() == month2 && getYear() == year2)
        {

            return true;
        }

        else {


            return false;
        }

    }



    public String getDescription()  {

        return description;
    }


    public void setDescription(String description)   {

        this.description = description;

    }



    public int getDay()  {

        return day;

    }


    public void setDay(int day)   {

        this.day = day;

    }



    public int getMonth()   {

        return month;


    }



    public void setMonth(int month) {

        this.month = month;

    }


    public int getYear()  {

        return year;

    }


    public void setYear(int year)  {

        this.year = year;

    }



    public String message()  {

        return description + " you're all set on "+ month +"/"+ day+"/" +year ;

    }

}






