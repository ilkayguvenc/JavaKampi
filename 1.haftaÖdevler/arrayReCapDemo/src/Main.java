import java.io.FilterOutputStream;

public class Main {
    public static void main(String[] args) {
        double[] mylist = {3.4,21.8,152.3,11.7};
        double toplam=0;
        double enBuyuk=mylist[0];
        for(double sayi:mylist){
            System.out.println(sayi);
            toplam=toplam+sayi;
            if(enBuyuk<sayi) enBuyuk=sayi;
        }
        System.out.println("Dizinin elemanları toplamı: "+toplam);
        System.out.println("Dizinin en büyük elemanı: "+enBuyuk);
    }
}