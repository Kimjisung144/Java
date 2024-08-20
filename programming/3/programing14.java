//래그드 배열 원리 출력
public class Main {

    public static void main(String[] args)
    {
        int [][] rag = {{1,2,3}, {1,2}, {1}, {1,2,3}}; // 래그드 배열 생성
        for(int i = 0; i < rag.length; i++)            // 1차원적 배열은 주소만 되어있고 리스트로만 되어있다.
        { 
            for(int j = 0; j < rag[i].length; j++)     // 1차원 안에 연결된 배열 전체 출력
            {
                System.out.print(rag[i][j]+" ");       // 배열 내용 하나씩 출력
            }
            System.out.println("");                    // 한출 넘기기
        }
    }
}
