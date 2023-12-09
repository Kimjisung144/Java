import scr.*;
import java.util.*;

public class Main
{
    public static void main(String[] args)
    {
        Circle c = new Circle(10, 10, 5);
        c.move(10,20);
        System.out.println("X:"+c.get_x()+"\ty:"+c.get_y());
    }
}
