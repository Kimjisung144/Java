package good;

public class Word
{
    private String eng;
    private String kor;
    public Word()
    {
        this.eng = null;
        this.kor = null;
    }
    public Word(String n, String n1)
    {
        this.eng = n;
        this.kor = n1;
    }
    public String get_eng()
    {
        return this.eng;
    }

    public String get_kor()
    {
        return this.kor;
    }
}
