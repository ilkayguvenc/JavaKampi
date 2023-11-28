public class Main {
    public static void main(String[] args) {
        int n = 5;
        //For döngüsü çalışması
        for(int i=0; i<n ;i++){
            System.out.println("i="+i+" için ");
            for(int j =0; j<n ;j++){
                System.out.print("j="+j+" için     ");
                for(int k =0; k<n ;k++) {
                    System.out.print(" k="+k+" için ");
                }
                System.out.println("");
            }
            System.out.println("");
        }

        //While döngüsü çalışması
        int i=1;
        while (i<=6){
            int j=1;
            while(j<=i){
                System.out.print("*");
                j++;
            }
            i++;
            System.out.println("");
        }
        while (1<=i) {
            int j = 1;
            while (j <= i) {
                System.out.print("*");
                j++;
            }
            i--;
            System.out.println("");
        }

        //Do-While döngüsü çalışması
        int a=18;
        do{
            System.out.println(a);
            a++;
        }while(a<10);

    }
}