import java.util.ArrayList;
import java.util.Scanner;
import lamp.Book;

public class Main
{
    public static void menu()//메뉴 출력하기 위한 함수
    {
        System.out.println("=======================================================");
        System.out.println("1. 책 등록");
        System.out.println("2. 책 검색");
        System.out.println("3. 모든 책 출력");
        System.out.println("4. 종료");
        System.out.println("뛰어쓰기는 _ 쓰기");
        System.out.println("=======================================================");
    }
    public static void c1(ArrayList<Book> bk) // 객체배열 받아서 객체 생성(책 추가)
    {
        Scanner sc = new Scanner(System.in);
        String t; // 제목 저장변수
        String a; // 작가명 저장변수
        int s; // 평점 저장변수
        System.out.print("제목:");
        t = sc.next();
        System.out.print("작가:");
        a = sc.next();
        System.out.print("평점:");
        s = sc.nextInt();
        bk.add(new Book(t,a,s));
    }
    public static int c2(ArrayList<Book> bk)
    {
        Scanner sc = new Scanner(System.in);
        String t;
        int re=-1;
        System.out.print("찾으려는 책 제목을 입력해주세요:");
        t = sc.next();
        for(int i=0; i<bk.size(); i++)
        {
            if(bk.get(i).t_getter().equals(t)) // 수정 완료
            {
                re = i;
            }
        }
        return re;
    }

    public static void main(String[] args)
    {
        ArrayList<Book> bk = new ArrayList<Book>();
        Scanner sc = new Scanner(System.in);
        int swi=0;
        int index;
        while(swi >= 0)
        {
            menu();
            swi = sc.nextInt();
            switch (swi)
            {
                case 1:
                    c1(bk);
                    break;
                case 2:
                    index = c2(bk);
                    if(index >= 0)
                    {
                        System.out.println(bk.get(index).toString());
                    }
                    break;
                case 3:
                    for(int i=0; i<bk.size(); i++)
                    {
                        System.out.println("======================================");
                        System.out.println(bk.get(i).toString());
                        System.out.println("======================================");
                    }
                    break;
                case 4:
                    swi=-1;
                    break;
            }
        }
    }
}
