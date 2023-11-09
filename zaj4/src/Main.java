// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
       /* Animal animal = new Animal("krowa");
        Animal animal1 = new Animal("krowa");
        System.out.println(animal.equals(animal1));
        animal.animal_sound();
        Cat kot = new Cat("Bonifacy");
        kot.animal_sound();
*/
        //Person.Employee employee=new Person.Employee("John");
        //employee.displayData();
       /* Hammer hammer= new Hammer("Hammer");
        System.out.println("Tool name:"+hammer.toolName);*/
        Kalkulator kalkulator= new Kalkulator();
        int suma=kalkulator.dodaj(2,4);
        System.out.println("suma:"+suma);
        KalkulatorRozszerzony kalkulatorRozszerzony=new KalkulatorRozszerzony();
        int suma2=kalkulatorRozszerzony.dodaj(2,3,4);
        System.out.println(suma2);

        Komputer komputer=new Komputer();
        komputer.uruchom();
        Laptop laptop= new Laptop();
        laptop.uruchom();
        Programista programista=new Programista();
    }
    }
