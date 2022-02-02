//////////////////////
// Houman Irani
// CS49J
// 10/07/2020
// This application checks the dates you have specific appointment and and tells you the details.
/////////////////////

import java.util.ArrayList;
import java.util.Scanner;

public class P9_3 {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        int day;
        int year;
        int month;

        Appointment appointment = new Appointment("Visit the doctor", 2020, 10, 1);

        Onetime onetime = new Onetime("One Time", 2020 , 12, 1);

        Daily daily = new Daily("Daily", 2020, 4, 8);

        Monthly monthly = new Monthly("Monthly", 2022 , 3, 5);


        ArrayList<Appointment> appointments = new ArrayList<>();

        appointments.add(appointment);
        appointments.add(monthly);
        appointments.add(daily);
        appointments.add(onetime);

        System.out.println("Please enter the date of your appointment:");
        System.out.print("Enter the day: ");
        day = input.nextInt();
        System.out.print("Enter the month: ");
        month = input.nextInt();
        System.out.print("Enter the year: ");
        year=input.nextInt();

        for(int i = 0; i < appointments.size(); i++) {
            if (appointments.get(i).occursOn(year, month, day)) {

                System.out.println("You have an appointment " + appointments.get(i).getDescription());
            }

        }

    }

}




