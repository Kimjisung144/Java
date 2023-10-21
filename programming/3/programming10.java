import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        double max;

        double a[] = {1.0,2.0,3.0,4.0};
        double sum=0;
        max = a[0];
        for(double e :a)
        {
            sum+=e;
            if(e>max)
            {
                max = e;
            }
        }
        System.out.printf("합은:"+sum+"\n"+"최대값은"+max);
    }
}
