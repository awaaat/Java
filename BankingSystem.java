//Java Program to demonstrate the working of a banking-system  
//where we deposit and withdraw amount from our account.  
//Creating an Account class which has deposit() and withdraw() methods 
class Account{
    int accnt_no;
    String name;
    float amount;
    void insert(int ac, String n, float amt){
        accnt_no = ac;
        name = n;
        amount = amt;
    }
    //Deposit
    void deposit(float amt){
        amount = amount + amt;
        System.out.println("Deposited: " + amount);
    }
    //withdraw method
    void Widthdraw(float amt){
    if(amount < amt){
        System.out.println("You have insufficient balance to widthdraw");
    }else{
        amount = amount-amt;
        System.out.println("Widthdraw Successful. Amount widthdrawn: " + amt);
    }
    }
    //method to check the balance of the account 
    void Balance(){System.out.println("Your balance is: " + amount);}
    void Display(){System.out.println(accnt_no + " " + name + " " + amount);}
}
class BankingSystem{
    public static void main(String[] args) {
        Account ac1 = new Account();
        ac1.insert(901888863, "Allan Simiyu", 300000);
        ac1.deposit(30000);
        ac1.Widthdraw(2000);
        ac1.Balance();
        ac1.Display();
    }
}