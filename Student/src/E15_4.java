/////////////////////////////
// Houman Irani
// CS 49J
// 11/04/2020
////////////////////////////


import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;


public class E15_4 {

    public static void main(String[] args) {

        Map<String, String> students = new TreeMap<>();

        String name, grade;

        Scanner input = new Scanner(System.in);

        students.put("Carl", "B+");
        students.put("Joe", "C");
        students.put("Sarah", "A");
        System.out.println("These are in the map " + students);


        System.out.println("Add students, Enter Yes/No");
        String answer;
        answer = input.nextLine();

        while(answer.equals("Yes")) {

            System.out.println("These are in the map " + students);

            System.out.println("Enter the name and grade of the students");
            System.out.println("Name: ");
            name = input.nextLine();

            System.out.println("Grade ");
            grade = input.nextLine();

            students.put(name, grade);

            System.out.println("Add students, enter yes/no");
            answer = input.nextLine();

        }
        if( answer.equals("No"))
        {
            System.out.println("Nothing added");
        }

        System.out.println("Remove students enter yes/no");
        String answer2;
        answer2 = input.nextLine();
        while(answer2.equals("Yes"))
        {
            System.out.println("Name: ");
            name = input.nextLine();
            students.remove(name);
            System.out.println("Remove students enter yes/no");
            answer2 = input.nextLine();
        }
        if(answer2.equals("No"))
        {
            System.out.println("No one removed");
        }

        System.out.println("Modify student's grade enter yes/no");
        String answer3;
        answer3 = input.nextLine();
        String grade3;
        while(answer3.equals("Yes"))
        {
            System.out.println("Name: ");
            name = input.nextLine();

            System.out.println("What is the new grade?");
            grade3=input.nextLine();

            students.put(name, grade3);
            System.out.println("Modify again? enter yes/no");
            answer3 = input.nextLine();
        }
        if(answer3.equals("No"))
        {
            System.out.println("Nothing modified");
        }



        Set<String> mySet = students.keySet();
        for (String str : mySet){
            String value = students.get(str);
            System.out.println(str + ":" + value);
        }


    }
}