import src.*;
import java.util.*;

public class Main
{
    public static void main(String[] args)
    {
        int control_swi=1;
        int index=0;
        String name;
        String phone;
        String email;

        Scanner sc = new Scanner(System.in);
        Contacts con[] = new Contacts[100];

        while(true)
        {

            System.out.println(index);
            System.out.println("이름 입력하시오:");
            name = sc.next();
            if(name == "-1")
            {
                break;
            }
            System.out.println("전화번호 입력하시오:");
            phone = sc.next();
            System.out.println("이메일 입력하시오:");
            email = sc.next();
            con[index] = new Contacts(name,phone,email);
            index++;
        }
        for(int i=0;i<con.length;i++)
        {
            System.out.println(con[i].toString());
        }
    }

}
