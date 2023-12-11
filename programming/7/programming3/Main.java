import src.*;

public class Main
{
    public static void main(String[] args)
    {
        Duck d = new Duck("DUCK");
        System.out.printf(d.get_name());
        d.walk();
        d.fly();
        d.sing();
        d.draw();
    }
}
