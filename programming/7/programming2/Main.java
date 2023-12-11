import src.*;

public class Main
{
    public static void main(String[] args)
    {
        Bird b = new Bird("Bird");
        System.out.println(b.get_name()+"는");
        b.sing();
        b.walk();
        b.fly();
    }
}
