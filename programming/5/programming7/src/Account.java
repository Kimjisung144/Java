package src;
public class Account
{
    private int balance;
    private int pin;
    public Account()
    {
        this.balance = 0;
        this.pin = 1234;
    }
    public Account(int add)
    {
        this.balance = add;
        this.pin = 1234;
    }
    public int get_pin()
    {
        return this.pin;
    }
