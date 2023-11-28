public class Main {
    public static void main(String[] args) {
        int sayi1 = 284;
        int sayi2 = 220;
        int toplam1=0,toplam2=0;

        for(int i =1;i<sayi1;i++)
            if(sayi1%i==0) toplam1+=i;
        for(int i =1;i<sayi2;i++)
            if(sayi2%i==0) toplam2+=i;

        if(sayi2==toplam1 && sayi1==toplam2) System.out.println("İki sayı arkadaştır.");
        else System.out.println("iki sayı arkdaş değildir.");

    }
}