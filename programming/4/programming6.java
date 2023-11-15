import java.util.*;
class Date
{
    private int year;
    private int month;
    private int day;
    public Date()
    {

    }
    public Date(int y, int m, int d)
    {
        this.year = y;
        this.month = m;
        this.day = d;
    }
    public void print1()
    {
        System.out.printf("%d.%d.%d\n",this.year, this.month, this.day);
    }
    public String change_month(int n)
    {
        switch(n)
        {
            case 1:
                return "Jan";
            case 2:
                return "Feb";
            case 3:
                return "Mar";
            case 4:
                return "Apr";
            case 5:
                return "May";
            case 6:
                return "Jun";
            case 7:
                return "Jul";
            case 8:
                return "AUG";
            case 9:
                return "Sep";
            case 10:
                return "oct";
            case 11:
                return "nov";
            case 12:
                return "dec";
            default:
                return "몰라";
        }
    }
    public void print2()
    {
        System.out.printf("%s.%d.%d",change_month(this.month), this.day, this.year);
    }
}
public class Main
{
    public static void main(String[] args)
    {
        Date d = new Date(2022,9,5);
        d.print1();
        d.print2();
    }
}
