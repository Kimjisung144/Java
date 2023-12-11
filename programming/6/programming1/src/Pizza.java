package src;

public class Pizza extends circle{
    private String name;
    public Pizza()
    {
        super(0);
    }
    public Pizza(int r,String n)
    {
        super(r);
        this.name = n;
    }
    public String toString()
    {
        return "피자의 종류"+this.name+"\t피자의 크기:"+this.radius;
    }
}
