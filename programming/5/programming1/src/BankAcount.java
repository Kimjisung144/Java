package src;
class BankAccount
{
    private int balance;
    public BankAccount()
    {
        this.balance = 0;
    }
    public BankAccount(int add)
    {
        this.balance = add;
    }
    public void setbalance(int add)
    {
        this.balance = add;
    }
    public int getbalance()
    {
        return this.balance;
    }
    public void transfer(int amount, BankAccount otherACCOUNT)
    {
        this.balance -= amount; // 계좌에서 돈 뺴기
        otherACCOUNT.setbalance(otherACCOUNT.getbalance()+amount);
        System.out.println("1금액"+this.balance+"2금액"+otherACCOUNT.getbalance());
    }
}
