import java.util.Scanner;
public class ScannerClass{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter your Name");
        String name = scn.nextLine();
        System.out.println("Enter your account number");
        long accnt_number = scn.nextLong();
        System.out.println("Specify your phone number");
        long phone_number = scn.nextLong();
        System.out.println("Enter amount to deposit");
        double amount = scn.nextInt();
        System.out.println(name);
        System.out.println(accnt_number);
        System.out.println(phone_number);
        System.out.println(amount);
    }
} 
//This program takes in and counts numbers, and finds its mean
public class ScannerClass{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sum = 0, count = 0;
        System.out.println("Enter a number here");
        while (scan.hasNextInt()) {
            int num = scan.nextInt();
            sum+=num;
            count++;  
        }
        if (count > 0) {
            int mean = (sum/count);
            System.out.println("The mean of the entered numbers is: " + mean);
        } else{
            System.out.println("Error");
        }
    }
}


