import java.util.Scanner;

public class Car {
    public String brand;
    public void ifNull(){
        if(brand==null)
            System.out.println("Marka jest pusta");
        else
            System.out.println(brand);
    }
}
