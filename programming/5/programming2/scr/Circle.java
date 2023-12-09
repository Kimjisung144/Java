package scr;

public class Circle {
    private int x;
    private int y;
    private int r;
    public Circle()
    {
        this.r=0;
        this.x=0;
        this.y=0;
    }
    public Circle(int x,int y,int radius)
    {
        this.x = x;
        this.y = y;
        this.r = radius;
    }
    public void setc(int x,int y,int radius)
    {
        this.x = x;
        this.y = y;
        this.r = radius;
    }
    public int get_x()
    {
        return this.x;
    }
    public int get_y()
    {
        return this.y;
    }
    public int get_r()
    {
        return this.r;
    }
    public void move(int xx,int yy)
    {
        this.x+=xx;
        this.y+=yy;
    }
}
