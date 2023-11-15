import java.util.*;
class Movie
{
    private String title;
    private String director;
    private int year;
    private String main_actor;
    private double score;

    public Movie()
    {

    }
    public Movie(String t,String d,int y, String m, double s)
    {
        this.title =t;
        this.director = d;
        this.year = y;
        this.main_actor = m;
        this.score = s;
    }
    public String toString()
    {
        return ("제목: "+this.title+"\n감독: "+this.director+"\n연도: "+this.year+"\n주연배우: "+this.main_actor+"\n평점: "+this.score);
    }
}
public class Main
{
    public static void main(String[] args)
    {
        Movie m = new Movie("티파니에서 아침을","블레이크 에드워즈",1962,"오드리 헵번",8.43);
        System.out.println(m);
    }
}
