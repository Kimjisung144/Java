import Bicycle.*;
public class lab7 {

    public static void main(String[] args)
    {
        String s[] = {"Cycle:","MountainBike: ","ElectricalBike: "}; // 각각 어떤 자전거 인지 확인
        Bicycle b[] = new Bicycle[3];

        b[0] = new Cycle(10.0, 2, true);// 속도, 기어,바구니 유무
        Cycle S = (Cycle)b[0];

        b[1] = new MountainBike(1, 20.0, 5); //안장 높이, 속도, 기어
        MountainBike m = (MountainBike)b[1];

        b[2] = new ElectricalBike(30.0,3,5);
        ElectricalBike e = (ElectricalBike)b[2];
        for(int i=0;i<3;i++)
        {
            b[i].set_speed_in(5);//속도 증가
        }
        for(int i=0;i<3;i++)
        {
            System.out.println(s[i]+b[i].getter_speed()+"\n"); // 각 속도 출력
        }
    }
}
