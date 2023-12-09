import src.*;
import java.util.*;

public class Main
{
    public static void main(String[] args)
    {
        Circle[] c = new Circle[3];

        for(int i=0; i<3; i++)
        {
            c[i] = new Circle(0);
        }
        for(int i=0; i<3; i++)
        {
            c[i].set_radius(Math.random()*100);
            System.out.println(c[i]);
        }

    }
}
