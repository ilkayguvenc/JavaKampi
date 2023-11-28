public class Main {
    public static void main(String[] args) {
        int sayi = 59;
        int toplam=0;
        for(int i=1;i<sayi;i++){
            if(sayi%i==0) {
                toplam+=i;
                System.out.println("Bölenleri: " + i);
            }

        }
        if(toplam==sayi) System.out.println(sayi+" sayısı mükemmel sayıdır.");
        else System.out.println(sayi+" sayısı mükemmel değildir.");


    }
}
