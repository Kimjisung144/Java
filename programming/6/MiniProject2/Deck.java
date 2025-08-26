import java.util.ArrayList;

public class Deck {
    // arraylist형 Card클래스 변수 생성
    ArrayList<Card> c = new ArrayList<>();
    // 모양
    String[] shape = {"스페이스","하트","다이아몬드","클럽"};
    //숫자
    String[] name ={"Ace","1","2","3","4","5","6","7","8","9","10","Jack","Queen","King"};
    // 생성자
    public Deck()
    {
        set();
    }
    //덱 생성
    public void set() {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 13; j++) {
                c.add(new Card(shape[i], name[j]));
            }
        }
    }
    //main에 출력할 덱 내용물
    public String toString()
    {
        return c.toString();
    }
}
