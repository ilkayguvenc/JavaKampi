import java.awt.*;

public class Main {
    public static void main(String[] args) {
        String mesaj = "  Bugün hava çok güzel.  ";
        System.out.println(mesaj);

        System.out.println("Eleman sayısı: "+mesaj.length());
        System.out.println("5. eleman : "+mesaj.charAt(4));
        System.out.println(mesaj.concat(" Yaşasın!"));
        System.out.println(mesaj.startsWith("B"));
        System.out.println(!mesaj.isEmpty());
        char[] karakterler = new char[8];
        mesaj.getChars(0,8,karakterler,0);
        System.out.println(karakterler);
        System.out.println(mesaj.indexOf("a"));
        System.out.println(mesaj.lastIndexOf("a"));


        String yeniMesaj = mesaj.replace(' ','-');
        System.out.println(yeniMesaj);
        System.out.println(mesaj.substring(2,8));

        for(String kelimeler: mesaj.split(" ")){
            System.out.println(kelimeler);
        }

        System.out.println(mesaj.toLowerCase());
        System.out.println(mesaj.toUpperCase());
        System.out.println(mesaj.trim());
    }
}