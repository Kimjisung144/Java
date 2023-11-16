package Bicycle;

public class MountainBike extends Bicycle // Bicycle 라는 부모 클래스를 상속
{
    private int seatHeight; // 의자 높이 필드
    public MountainBike()
    {
        super(0,0); // 부모 클래스 생성자 불러오기
        seatHeight = 0;// 의자 높이 초기 설정
    }
    public MountainBike(int startHeight, double start_speed, int startGear)
    {
        super(startGear, start_speed); // 부모 클래스 생성자 불러오기
        seatHeight = startHeight;//의자 높이 매개변수 값으로 초기 설정
    }
    public void setter_seatHeight(int height_s) // 의자높이 setter 메소드
    {
        this.seatHeight = height_s; // 의자높이 매개변수 값으로 설정
    }
    public double getter_seatHeight()// seatHeight필드의 getter메소드
    {
        return this.seatHeight;
    }
    public void set_speed_de(int speed_s)//speed 감소 메소드
    {
        this.speed -= (speed/speed_s);
    }

    public void set_speed_in(int speed_s)// speed 증가 메소드
    {
        this.speed += (speed/speed_s);
    }
    public double getter_speed() // speed 필드의  getter 메소트
    {
        return this.speed;
    }
}

