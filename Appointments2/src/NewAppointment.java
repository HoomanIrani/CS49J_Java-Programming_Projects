import java.util.ArrayList;


public class NewAppointment {

    ArrayList <Appointment> appointments;

    public NewAppointment()   {

        appointments = new ArrayList<Appointment>();

    }


    public void makeAppointment(Appointment app)   {

        appointments.add(app);

    }


    public void checkAppointments()  {

        for(Appointment app : appointments)

            System.out.println(app.message());

    }


    public void show(int year, int month, int day)  {

        for(Appointment app : appointments)

            if(app.occursOn(year, month, day))

                System.out.println(app.message());
    }

}

