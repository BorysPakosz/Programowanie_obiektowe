public class Rodzic {
    protected String imie;
}
class Dziecko{
    public String imieRodzica;
    public void nadajImieRodzica(Rodzic rodzic){
        imieRodzica=rodzic.imie;
    }

}