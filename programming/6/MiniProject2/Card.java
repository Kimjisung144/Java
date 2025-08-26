public class Card {
    private String shape;
    private String number;

    public Card()
    {
        this("0","0");
    }
    public Card(String s,String n)
    {
        this.shape = s;
        this.number = n;
    }
    public String toString()
    {
        return shape+number;
    }
}
