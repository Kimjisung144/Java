package src;

public class Contacts {
    public String name;
    public String tel;
    public String email;

    public Contacts(String n,String t,String e)
    {
        this.name = n;
        this.tel = t;
        this.email = e;
    }
    public String toString()
    {
        return "이름: "+name+"\t전화번호: "+tel+"\t이메일: "+email;
    }
}
