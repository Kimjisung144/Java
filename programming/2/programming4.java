import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Boolean P = true;
        Boolean Q = true;
        System.out.printf("P\t    Q\t    AND\t    OR\t    XOR\n");
        System.out.printf("%s\t%s\t%s\t%s\t%s\n",P,Q,P&Q,P|Q,P^Q);
        P =true;
        Q = false;
        System.out.printf("%s\t%s\t%s\t%s\t%s\n",P,Q,P&&Q,P||Q,P^Q);
        P =false;
        Q = true;
        System.out.printf("%s\t%s\t%s\t%s\t%s\n",P,Q,P&&Q,P||Q,P^Q);
        P = false;
        Q = false;
        System.out.printf("%s\t%s\t%s\t%s\t%s\n",P,Q,P&&Q,P||Q,P^Q);

    }
}
