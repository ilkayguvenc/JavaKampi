public class Main {
    public static void main(String[] args) {
        String ogrenci1="Engin";
        String ogrenci2="Derin";
        String ogrenci3="Salih";
        String ogrenci4="Ahmet";

        System.out.println(ogrenci1);
        System.out.println(ogrenci2);
        System.out.println(ogrenci3);
        System.out.println(ogrenci4);


        String[] ogrenciler = new String[4];
            ogrenciler[0]="Engin";
            ogrenciler[1]="Derin";
            ogrenciler[2]="Salih";
            ogrenciler[3]="İlkay";

            int  j=1;
            for(String ogrenci:ogrenciler){

                System.out.println(j+". eleman: "+ogrenci);
                j++;
            }
    }
}