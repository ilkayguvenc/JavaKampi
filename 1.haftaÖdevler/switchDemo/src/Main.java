public class Main {
    public static void main(String[] args) {
        char ogrenciNotu = 'C';

        switch (ogrenciNotu) {
            case 'A':
                System.out.println("Geçtiniz, Not Durumu: Mükemmel");
                break;
            case 'B':
                System.out.println("Geçtiniz, Not Durumu: İyi");
                break;
            case 'C':
                System.out.println("Geçtiniz, Not Durumu: Orta");
                break;
            case 'D':
                System.out.println("Koşullu Geçtiniz, Not Durumu: Kötü");
                break;
            case 'F':
                System.out.println("Kaldınız, Not Durumu: Berbat");
                break;
            default:
                System.out.println("Geçersiz bir not girdiniz!");


        }


    }
}