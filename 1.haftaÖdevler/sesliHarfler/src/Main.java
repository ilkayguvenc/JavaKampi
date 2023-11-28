public class Main {
    public static void main(String[] args) {
        char harf = 'E';

        switch (harf) {

            case 'A':
                System.out.println("Kalın sesli harf");
                break;
            case 'E':
                System.out.println("İnce sesli harf");
                break;
            case 'I':
                System.out.println("Kalın sesli harf");
                break;
            case 'İ':
                System.out.println("İnce sesli harf");
                break;
            case 'O':
                System.out.println("Kalın sesli harf");
                break;
            case 'Ö':
                System.out.println("İnce sesli harf");
                break;
            case 'U':
                System.out.println("Kalın sesli harf");
                break;
            case 'Ü':
                System.out.println("İnce sesli harf");
                break;
            default:
                System.out.println("Lütfen büyük sesli harf giriniz.");
        }
    }
}