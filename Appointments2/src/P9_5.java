////////////////////////////////
// Houman Irani
// CS49J
// 10/20/2020
// This App asks users to insert type of appointment, and date and it will save and load the results in a new file.
////////////////////////////////

/**
 * This is an appointment application.
 *
 * @author Houman Irani
 * @version 1.00
 * @since 2021-01-01
 *
 */



import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.PrintWriter;
import java.io.File;



public class P9_5 {



    public static void save(String types, String description, int year, int month, int day)
            throws FileNotFoundException {
        String myFile = "myFile.txt";
        PrintWriter outFile = new PrintWriter(myFile);
        outFile.println("Description  " + description);
        outFile.println("Type " +  types);
        outFile.println("Date " + month + "-" + day + "-" + year);
        outFile.close();


    }


    public static void load() throws FileNotFoundException {


        String my_File = "myFile.txt";
        File myFile = new File(my_File);
        Scanner inputFile = new Scanner(myFile);

        while (inputFile.hasNext())
        {
            System.out.println(inputFile.nextLine());
        }


        inputFile.close();

    }


    public static void main(String[] args) throws FileNotFoundException {

        String description;
        String types;
        int day;
        int month;
        int year;


        NewAppointment appointment = new NewAppointment();


        System.out.print("Enter type of your appointment, like monthly, daily, or one time: ");
        Scanner input = new Scanner(System.in);
        types = input.nextLine();

        if( !types.equals("monthly") && !types.equals("daily")   && !types.equals("one time"))
        {
            System.out.println("Invalid entry, try again.");
        }
        System.out.print("Please, Enter your appointment type: ");

        description= input.nextLine();


        System.out.print("Enter the Year: ");
        year = input.nextInt();
        System.out.print("Enter the Month: ");
        month = input.nextInt();
        System.out.print("Enter the Day: ");
        day = input.nextInt();

        if ( types.equals("monthly"))
        {

            Monthly monthly = new Monthly( description , year, month, day);
            appointment.makeAppointment(monthly);
            save(types, description, year, month, day);
            System.out.println("Your data is successfully added into the file.");
            load();


        }

        if ( types.equals("one time"))
        {

            Onetime onetime = new Onetime( description , year, month, day);
            appointment.makeAppointment(onetime);
            save(types, description, year, month, day);
            System.out.println("Your data is successfully added into the file.");
            load();

        }


        if ( types.equals("daily"))  {


            Daily daily = new Daily( description , year, month, day);
            appointment.makeAppointment(daily);
            save(types, description, year, month, day);
            System.out.println("Your data is successfully added into the file.");
            load();

        }

        appointment.show(year, month, day);

    }

}


