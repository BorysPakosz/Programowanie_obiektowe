import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        cw1();
        cw2();
        cw3();
        cw4();
        cw5();
        cw6();
        cw7();
        cw8();
        cw9();
        }
    public static void cw1(){
        Random random = new Random();
        int liczba = random.nextInt();
        System.out.println("cw1: "+liczba);
    }
    public static void cw2(){
        Random random = new Random();
        double liczba = random.nextDouble();
        System.out.println("cw2: "+liczba);
    }
    public static void cw3(){
        Random random = new Random();
        double liczba = random.nextGaussian();
        System.out.println("cw3: "+liczba);
    }
    public static void cw4(){
        Random random = new Random();
        boolean liczba = random.nextBoolean();
        System.out.println("cw4: "+liczba);
    }
    public static void cw5(){
        Random random = new Random();
        int[] tab=new int[10];
        for(int i =0;i<10;i++) {
            tab[i] = random.nextInt();
            System.out.println(tab[i]);
        }
        System.out.println("Odwrucona kolejnosc");
        for(int i=9;i>-1;i--){
            System.out.println(tab[i]);
        }
    }
    public static void cw6(){
        System.out.println("cw6");
        Random random = new Random();
        int[] tab=new int[20];
        float suma=0;
        for(int i =0;i<20;i++) {
            tab[i] = random.nextInt(1,101);
            suma+=tab[i];
        }

        System.out.println(suma);
        System.out.println(suma/20);
    }
    public static void cw7(){
        System.out.println("cw7");
        Random random = new Random();
        int[] tab=new int[15];
        for(int i =0;i<15;i++) {
            tab[i] = random.nextInt();
        }
        int min = Arrays.stream(tab).min().getAsInt();
        int max = Arrays.stream(tab).max().getAsInt();
        System.out.println("Min = " + min);
        System.out.println("Max = " + max);
    }
    public static void cw8(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj najperw wysokosc potem znak do piramidy: ");
        int n= scanner.nextInt();
        char a= scanner.next().charAt(0);
        StringBuilder piramida = new StringBuilder();
        for (int i =1;i<=n;i++){
            for (int j =1;j<=n-i;j++){
                piramida.append(" ");
            }
            for (int k=1;k<=2*i-1;k++){
                piramida.append(a);
            }
            piramida.append("\n");
        }
        System.out.println(piramida.toString());
    }
    public static void cw9(){
        Scanner scanner = new Scanner(System.in);
        String napis=scanner.next();
        StringBuilder bezpow = new StringBuilder();
        boolean[] wystepujace=new boolean[256];
        for(char c:napis.toCharArray()){
            if(!wystepujace[c]){
                bezpow.append(c);
                wystepujace[c]=true;
            }
        }
        System.out.println(bezpow.toString());

    }
}
