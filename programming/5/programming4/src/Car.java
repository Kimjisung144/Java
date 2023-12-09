
package src;

public class Car {
    public String model;
    public String make;
    public static int number;
    public Car()
    {

    }
    public Car(String model,String make)
    {
        this.model = model;
        this.make = make;
        number +=1;
    }
    public static int getNumberOfCar()
    {
        return number;
    }
}
