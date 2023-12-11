package src;

public class Bird implements Animal{
    private String s;
    public Bird()
    {
        this.s = null;
    }
    public Bird(String n)
    {
        this.s = n;
    }
    public void walk()
    {
        System.out.println("걸을수있음");
    }
    public void fly()
    {
        System.out.println("날수있음");
    }
    public void sing()
    {
        System.out.println("노래할수있음");
    }
    public String get_name()
    {
        return this.s;
    }
}
