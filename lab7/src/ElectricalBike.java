package Bicycle;

public class ElectricalBike extends Bicycle{
    private int battery;
    public ElectricalBike()
    {
        super(0,0.0);
        this.battery = 0;
    }
    public ElectricalBike(double s,int g,int b) // 속도,기어,배터리
    {
        super(g,s);
        this.battery= b;
    }
    public void battery_setter(int b)
    {
        this.battery =b;
    }
    public void set_speed_de(int n)//속도 -=(배터리 /파라미터)
    {
        this.speed -= (battery / n);
    }

    public void set_speed_in(int n)// 속도 +=(배터리 /파라미터)
    {
        this.speed += (battery/n);
    }
    public double getter_speed() // speed 필드의  getter 메소트
    {
        return this.speed;
    }
}
