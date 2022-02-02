///////////////////////////
//Houman Irani
//CS 49J
//11/03/2020
//////////////////////////

import java.util.*;

public class P15_2  {

    public static void main (String[] args) {

        Scanner input = new Scanner(System.in);

        int choice = 0;

        Map<Integer, Student> students = new TreeMap <Integer, Student>();

        Map<Student, String> grades = new TreeMap <Student, String>();

        Set<Student> sort = new HashSet <Student>();



        while (choice != 5) {

            choice = menu();


            switch (choice) {

                case 1:


                    add(students, grades);
                    break;

                case 2:

                    remove(students, grades);
                    break;



                case 3: {


                    changeGrade(students, grades);
                    break;

                }

                case 4:

                    print(grades);
                    break;



                case 5:

                    System.out.println("Done");
                    break;

                default:
                    System.out.println("try again");

            }

        }

    }

    public static int menu() {
        int choice;

        Scanner in = new Scanner(System.in);
        System.out.println("Choose from the following:");

        System.out.println("1: Adding ");

        System.out.println("2: Removing");

        System.out.println("3: Changing a grade");

        System.out.println("4: Display info");

        System.out.println("5: Exit");

        choice = in.nextInt();
        return choice;

    }

    public static void add(Map<Integer, Student> StudentMap, Map<Student, String> GradeMap) {
        int idNum;
        String first, last, grade;

        Scanner in = new Scanner(System.in);

        System.out.println("First name: ");

        first = in.next();

        System.out.println("Last name: ");

        last = in.next();

        System.out.println("ID number: ");

        idNum = in.nextInt();

        System.out.println("Grade: ");

        grade = in.next();

        System.out.println(last + " " + idNum + "  Added");

        if (StudentMap.containsKey(idNum)) {

            System.out.println("This id already exists");

            System.out.println("Please Try Again!");


        }

        Student stud = new Student(first, last, idNum);

        StudentMap.put(stud.getID(), stud);

        GradeMap.put(stud, grade);

    }


    public static void remove(Map<Integer, Student> studentMap, Map<Student, String> GradeMap) {

        Scanner in = new Scanner(System.in);

        System.out.println("Enter ID");

        int id2 = in.nextInt();

        GradeMap.remove(studentMap.get(id2));

        studentMap.remove(id2);

    }


    public static void changeGrade(Map<Integer, Student> StudentMap, Map<Student, String> GradeMap) {

        Scanner in = new Scanner(System.in);

        System.out.println("Enter the ID ");


        int id4 = in.nextInt();


        if (!StudentMap.containsKey(id4)) {

            System.out.println("Try again");

        }

        System.out.println("What is the new grade?");

        String grade2 = in.next();


        GradeMap.put(StudentMap.get(id4), grade2);



    }





    public static void print(Map<Student, String> GradeM) {

        Set<Student> list = GradeM.keySet();

        for (Student stu : list) {

            System.out.println(stu.toString() + " " + GradeM.get(stu));

        }

    }
}