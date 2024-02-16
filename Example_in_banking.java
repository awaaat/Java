
//Java Program to demonstrate the working of a banking-system  
//where we deposit and withdraw amount from our account.  
//Creating an Account class which has deposit() and withdraw() methods 
class Customer{
    String customer_name;
    int account_number;
    float amount;
    void display(String cn, int ac,  float a){
        cn = customer_name;
        ac = account_number;
        a = amount;
    }
    void showDetails(){System.out.println("Name: " + customer_name + " " + "Account_number: " + account_number + " " + "Available balance: " + amount);}
}
public class Example_in_banking{
    public static void main(String[] args){
        Customer c1 = new Customer();
        Customer c2 = new Customer();
        c1.display("Allan Simiyu", 8000028, 20000002);
        c2.display("Sherry Kones", 900011198, 2019993900);
        c1.showDetails();
        c2.showDetails();
    }
}