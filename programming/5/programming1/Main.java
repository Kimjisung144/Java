import src.*;
public class Main
{
    public static void main(String[] args)
    {
        BankAccount ba1 = new BankAccount(10000);
        BankAccount ba2 = new BankAccount(0);
        ba1.transfer(1000,ba2);
    }
}
