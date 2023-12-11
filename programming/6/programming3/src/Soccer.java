package good;

public class Soccer {
    private String name;
    private int players;
    public Soccer()
    {

    }
    public Soccer(String n,int p)
    {
        this.name = n;
        this.players = p;
    }
    public int getPlayers()
    {
        return this.players;
    }
    public String getName()
    {
        return this.name;
    }
    public String toString()
    {
        return "경기이름:"+this.name+"경기자수:"+this.players;
    }
}
