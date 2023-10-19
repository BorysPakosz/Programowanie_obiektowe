// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args){
        House domStefana = new House();
        domStefana.area = 150;
        domStefana.floors = 2;
        domStefana.garage= true;
        domStefana.garden = false;
        domStefana.rooms = 6;
        System.out.println(domStefana.getPrice());

        House domSylwii = new House();
        domSylwii.rooms = 4;
        domSylwii.area = 173;
        domSylwii.floors=1;
        domSylwii.garden=false;
        domSylwii.garage=false;
        System.out.println(domSylwii.getPrice());

        Dog piesSylwii= new Dog();
        piesSylwii.name = "Azor";
        piesSylwii.breed = "Ofczarek";
        piesSylwii.age = 3;
        piesSylwii.bark();

        BankAccount kontoSylwio = new BankAccount();
        kontoSylwio.balance = 50000.02;
        kontoSylwio.deposit(1000.23);
        kontoSylwio.withdraw(1023.21);
        System.out.println(kontoSylwio.balance);

        Time time = new Time();
        time.hours = 23;
        time.minutes = 23;
        Time time2= new Time();
        time2.hours = 14;
        time2.minutes = 43;
        Time time3= time.addTime(time2);
        System.out.println(time3.hours+" "+ time3.minutes);

        Car car = new Car();
        car.brand=null;
        car.ifNull();

        Osoba osoba=new Osoba();
        osoba.imie="Tomasz";
        osoba.ustawHaslo("12345");

        Rodzic rodzic = new Rodzic();
        rodzic.imie="Daniel";
        Dziecko dziecko = new Dziecko();
        dziecko.nadajImieRodzica(rodzic);
        System.out.println(dziecko.imieRodzica);

        Licznik licznik = new Licznik();
        licznik.liczba=100;
        System.out.println("Przed zwiekszeniem: "+licznik.liczba);
        licznik.zwieksz(11);
        System.out.println("Po zwiekszeniu: "+licznik.liczba);

        Licznik licznik1=new Licznik();
        licznik1.liczba=20;
        Licznik licznik2=new Licznik();
        licznik2.liczba=20;
        licznik1= licznik1.dodaj(licznik2);
        System.out.println(licznik1.liczba);


    }
}