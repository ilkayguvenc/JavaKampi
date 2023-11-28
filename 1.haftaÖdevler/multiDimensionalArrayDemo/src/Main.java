public class Main {
    public static void main(String[] args) {
        String[][] sehirler= new String[3][4];
        sehirler[0][0]="Marmara Bölgesi";
        sehirler[0][1]="İstanbul";
        sehirler[0][2]="Tekirdağ";
        sehirler[0][3]="Çanakkale";

        sehirler[1][0]="Ege Bölgesi";
        sehirler[1][1]="İzmir";
        sehirler[1][2]="Muğla";
        sehirler[1][3]="Manisa";

        sehirler[2][0]="Akdeniz Bölgesi";
        sehirler[2][1]="Antalya";
        sehirler[2][2]="Adana";
        sehirler[2][3]="Mersin";

        for(int i=0 ; i< 3;i++ ){
            System.out.println(sehirler[i][0]+" Şehirleri:");
            for(int j=1;j< 4;j++)
                System.out.println(sehirler[i][j]);
        }
    }
}