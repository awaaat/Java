public class Tutorials {
    public static void main(String[] args) {
        byte a= 10;
        byte b  = 30;
        int result = (a*b);
        System.err.println(result);
    }
}

//Switch statements
public class Tutorials{
    public static void main(String[] args) {
        int n  = 8;
        switch (n) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursay");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
            System.out.println("Enter a valid input");
                break;
        }
    }
} 

//Loops 
//1 While Loops
//Do while loops
//for loops

//OOP
class Calculator{
    public int add(int num1, int num2){
        return num1 + num2;
    }

}
public class Tutorials {
public static void main(String[] args) {
    Calculator Obj = new Calculator();
    int num1 = 7;
    int num2  = 9;
    int result =Obj.add(num1, num2);
    System.out.println(result);
}
}



