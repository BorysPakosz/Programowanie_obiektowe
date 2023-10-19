public class Licznik {
    public int liczba;
    public int zwieksz(int a){
        liczba+=a;
        return a;
    }
    public Licznik dodaj(Licznik nowylicznik){
        int a= nowylicznik.liczba+liczba;
        Licznik newlicznik=new Licznik();
        newlicznik.liczba=a;
        return newlicznik;
    }
}
