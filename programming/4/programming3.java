import java.util.*;
class Song {
    private String title;
    private String artist;
    private int length;
    public Song(String t,String a,int l)
    {
        this.title = t;
        this.artist = a;
        this.length = l;
    }
}

public class Main
{
    public static void main(String[] args)
    {
        Song c[] = new Song[4];
        c[0] = new Song("outward bound","nana",180);
        c[1] = new Song("outward bound","nana",180);
        c[2] = new Song("outward bound","nana",180);
        c[3] = new Song("outward bound","nana",180);

    }
}
