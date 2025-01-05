import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main
{
    public static void main(String[] args)
    {
        int[] a = new int[5]; // 1차 배열 선언
        int[] b = {1,2,3,4,5}; //1차 배열 초기화

        int[][] c = new int[2][5]; // 2차배열 선언
        int[][] d = {{1,2,3,4,5},
                    {6,7,8,9,10}}; //2차배열 초기화

        int[][] e = new int[2][];//래그드 배열 선언
        e[0] = new int[3];
        e[1] = new int[4];

        int[][] f = new int[2][]; //래그드 배열 초기화
        f[0] = new int[] {1,2,3};
        f[1] = new int[] {4,5,6};

        ArrayList<Integer> g = new ArrayList<>();//arraylist 배열 선언
        g.add(1);//추가
    }
}
