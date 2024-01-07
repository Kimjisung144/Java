package lamp;

public class Book {
    static int count; // 책 갯수 세는 목적 정적변수
    static{
        count=0;
    }
    private String title; // 책 제목
    private String author; //작가명
    private int score; //평점
    public Book()// 매개변수 없이 생성자 할시 사용
    {
        this.title = "미정";
        this.author = "미상";
        this.score = 0;
    }
    public Book(String t, String a,int s)
    {
        this.title = t;
        this.author = a;
        this.score = s;
    }
    public String t_getter()
    {
        return this.title;
    }
    public String a_getter()
    {
        return this.author;
    }
    public int s_getter()
    {
        return this.score;
    }
    public String toString()
    {
        return "제목: "+t_getter()+"\n작가: "+a_getter()+"\n평점: "+s_getter();
    }
}
