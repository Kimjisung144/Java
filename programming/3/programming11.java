//배열 출력
import java.util.Arrays;

public class Main {
    public static void main(String[] args)
    {
        String[] str = {"hello","java","world"}; //문자열 배열 생성하여 원하는내용으로 초기화
        for(String e:str)                        // 하나하나 가져와서 변수 e에 넣음으로써 사용
        {
            System.out.println(e); // 내용 출력
        }
    }
}
