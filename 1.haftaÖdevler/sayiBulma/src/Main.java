public class Main {
    public static void main(String[] args) {
        int[] sayilar = {2,7,5,3,78,0,1};
        int arananSayi=1;
        boolean varMi = false;

        for(int sayi:sayilar) {
            if (arananSayi==sayi){
                varMi=true;
                break;
            }else continue;
        }

        if (varMi) System.out.println("Aranılan sayı bulundu: "+arananSayi);
        else System.out.println("Aranan sayı mevcut değil: "+arananSayi);


    }
}