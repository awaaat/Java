//Using BufferedReader Class
 import java.util.*;
 import java.util.Scanner;
import java.io;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
class GetUserInput {
        public static void main(String[] args) throws IOException{
            BufferedReader bfn = new BufferedReader(new InputStreamReader(System.in));
            String str = bfn.readLine();
            int it = Integer.parseInt(bfn.readLine());
            System.out.println("Enterered String is:  " +  str);
            System.out.println("Entered Integer is: " + it);

}
}

class GetUserInput{
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name;
        String age;
        try {
            System.out.println("Enter your name here");
            name = reader.readLine();
            System.out.println("How old are you?");
            age = reader.readLine();
            System.out.println("Your name is " + name + " " + " and you are " + " " + age + " " + " years old");
        } catch (Exception e) {
            
        }
    }
}


//Using Scanner Class

 UserInput
 
class UserInput {
public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    String firstName = scn.next();
    System.out.println("You Entered your firstname as " + firstName);
    Scanner scn2 = new Scanner(System.in);
    String lastName = scn2.nextLine();
    System.out.println("You entered your last name as " + lastName);
    System.out.println("Your full name is " + firstName + " " + " " + lastName);
}
}

 //UserInput
 
class Input {
public static void main(String[] args) {
    Scanner object = new Scanner(System.in);
    String name;
    int rollno;
    float marks_scored;
    System.out.println("Enter your full name here");
    name = object.nextLine();
    System.out.println("Enter your roll numer here");
    rollno = object.nextInt();
    System.out.println("Enter your marks here");
    marks_scored = object.nextFloat();
    System.out.println("Thank you!");
}
} 
//More Examples 

class StudentInfo{
    public static void main(String[] args) {
        Scanner  stdnt = new Scanner(System.in);
        String firstname;
        String middleName;
        String lastName;
        int admission_number;
        int age;
        float marks_score;
        System.out.println("First Name");
        firstname = stdnt.nextLine();
        System.out.println("Middle Name");
        middleName = stdnt.nextLine();
        System.out.println("Last Name");
        lastName = stdnt.nextLine();
        System.out.println("Your Admission Number");
        admission_number = stdnt.nextInt();
        System.out.println("Your  Age");
        age = stdnt.nextInt();
        System.out.println("Marks Scored");
        marks_score = stdnt.nextFloat();
        System.out.println("Thank you for submitting your details");
    }
}
