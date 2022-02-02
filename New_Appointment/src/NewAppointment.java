import java.util.ArrayList;


public class NewAppointment {

    ArrayList <Appointment> appointments;

    public NewAppointment()  {

        appointments = new ArrayList<>();

    }


    public void makeAppointment(Appointment a)  {

        appointments.add(a);

    }


    public void checkAppointments()  {


        for (Appointment a : appointments)

            System.out.println(a.message());

    }


    public void show (int year, int month, int day)  {

        for(Appointment a : appointments)

            if(a.occursOn(year, month, day))

                System.out.println(a.message());
    }

}
