import good.*;
import java.util.*;

public class Main
{
    public static void main(String[] args)
    {
        String sk;
        Scanner sc = new Scanner(System.in);
        Word w[] = new Word[3];
        for(int n=0; n<3; n++)
        {
            System.out.println("영어단어를 입력해주세요:");
            String eng = sc.next();
            System.out.println("한국단어를 입력해주세요:");
            String kor = sc.next();
            w[n] = new Word(eng,kor);
        }
        sk = sc.next();
        for(int n=0; n<3; n++)
        {
            if(w[n].get_eng() == sk)
            {
                System.out.println(sk+"의 한국어 단어는"+w[n].get_kor());
                break;
            }else{
                System.out.println("문제생김");
            }
        }
    }
}
