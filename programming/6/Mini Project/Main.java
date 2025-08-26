import java.util.Scanner;

public class Main {
    // 맵 출력
    public static void Map(String m[][])
    {
        for(int i=0;i<10;i++)
        {
            for(int j=0;j<10;j++)
            {
                System.out.print(m[i][j]);
            }
            System.out.print("\n");
        }
    }
    // 이동 메소드
    public static void move(SwordMan s)
    {
        Scanner sc = new Scanner(System.in);
        char c;
        System.out.println("이동하시오: a=왼쪽, s=아래, d=오른쪽, w=위");
        c = sc.next().charAt(0);
        switch (c)
        {
            case 'w':
                s.y--;
                break;
            case 'a':
                s.x--;
                break;
            case 's':
                s.y++;
                break;
            case 'd':
                s.x++;
                break;

            default:
                System.out.println("문제 생김");
        }
    }
    // 변경 메소드
    public static void Mapchange(Monster m,Gold g, SwordMan s,String map[][])
    {
        for(int i=0;i<10;i++)
        {
            for(int j=0;j<10;j++)
            {
                if(map[i][j] == "S")
                {
                    map[i][j] = " ";
                }
            }
        }
        map[m.y][m.x] = "M";
        map[g.y][m.x] = "G";
        map[s.y][s.x] = "S";
    }
    public static void main(String[] args) {
        int sw = 0;
        String[][] map = {{"#","#","#","#","#","#","#","#","#","#"},
                {"#"," "," "," "," "," "," "," "," ","#"},
                {"#"," "," "," "," "," "," "," "," ","#"},
                {"#"," "," "," "," "," "," "," "," ","#"},
                {"#"," "," "," "," "," "," "," "," ","#"},
                {"#"," "," "," "," "," "," "," "," ","#"},
                {"#"," "," "," "," "," "," "," "," ","#"},
                {"#"," "," "," "," "," "," "," "," ","#"},
                {"#"," "," "," "," "," "," "," "," ","#"},
                {"#","#","#","#","#","#","#","#","#","#"}};
        Monster m = new Monster();
        Gold g = new Gold();
        SwordMan s = new SwordMan();
        do {
            Mapchange(m,g,s,map);
            Map(map);
            move(s);
        }while(true);
    }
}
