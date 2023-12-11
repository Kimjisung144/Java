package good;

public class VideoPlayer implements Controllable{
    public VideoPlayer()
    {

    }
    public void play()
    {
        System.out.println("실행시킴");
    }
    public void stop()
    {
        System.out.println("멈춤");
    }
}
