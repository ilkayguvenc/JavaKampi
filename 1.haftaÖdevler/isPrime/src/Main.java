public class Main {
    public static void main(String[] args) {
        int isPrime=1;
        boolean sayac = true;

        if(isPrime<2) sayac=false;
        for(int i=2 ; i<isPrime;i++) {
            if (isPrime % i == 0) sayac = false;
        }
        if(sayac) System.out.println("Sayı asaldır.");
        else System.out.println("Sayı asal değildir.");
    }
}