//3x5 배열에 행에 랜덤으로 하나 1로 저장
public class Main {

    public static void main(String[] args)
    {
        int [][] rag = new int[3][5]; // 2차 배열 생성 (3x5)
        int temp=0;                   // 1이 저장될 인덱스저장
        for(int i = 0; i < rag.length; i++) //행길이 만큼 반복
        {
            temp=(int)(Math.random()*5); // 랜덤값 생성하고 temp 임시 변수에 저장
            rag[i][temp] = 1;            // temp인덱스 위치에 1 저장 (5개중 1개에 1저장)
        }
        for(int i=0;i<rag.length;i++)         // 2차원 배열 출력 (행 길이 만큼 반복)
        {
            for(int j=0;j<rag[i].length;j++)  // 열길이 만큼 반복
            {
                System.out.print(rag[i][j]); // 값 출력
            }
            System.out.println("");          // 한줄 띄우기
        }
    }
}
