package Bicycle;

public class Bicycle {
    protected int Gear;//기어 속도 필드
    protected double speed;//속도

    public Bicycle()// 매개 변수 없는 생성자
    {
        this.Gear = 0; // 기어 속도 설정
        this.speed = 0; // 속도 설정
    }

    public Bicycle(int Gear_s, double speed_s)//매개변수 있는 생성자
    {
        this.Gear = Gear_s;
        this.speed = speed_s;
    }

    public void set_speed_de(double speed_s)//speed 감소 메소드
    {
        this.speed -= speed_s;
    }

    public void set_speed_in(double speed_s)// speed 증가 메소드
    {
        this.speed += speed_s;
    }

    public void setter_speed(double speed_s) // speed setter 메소드
    {
        this.speed = speed_s;
    }

    public void set_Gear_in(int Gear_s)//Gear 증가 메소드
    {
        this.Gear += Gear_s;
    }

    public void set_Gear_de(int Gear_s) //Gear 감소 메소드
    {
        this.Gear -= Gear_s;
    }

    public int getter_Gear() // Gear 필드의 getter메소드
    {
        return this.Gear;
    }

    public double getter_speed() // speed 필드의  getter 메소트
    {
        return this.speed;
    }
}
