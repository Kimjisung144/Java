package Bicycle;

public class Cycle extends Bicycle {
    private boolean isbasket;
    public Cycle()
    {
        super(0,0.0);
        this.isbasket = false;
    }
    public Cycle(double s, int g, boolean basket)
    {
        super(g, s);
        this.isbasket = basket;
    }
    public void set_speed_de(int speed_s)//speed 감소 메소드
    {
        this.speed -= (this.speed/speed_s)+10;
    }

    public void set_speed_in(int speed_s)// speed 증가 메소드
    {
        this.speed += (this.speed/speed_s)+10;
    }
    public double getter_speed() // speed 필드의  getter 메소트
    {
        return this.speed;
    }
}
