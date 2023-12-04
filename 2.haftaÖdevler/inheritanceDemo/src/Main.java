public class Main {
    public static void main(String[] args) {
        BaseKrediManager baseKrediManager= new BaseKrediManager();
        AskerKrediManager askerKrediManager=new AskerKrediManager();
        KrediUI krediUI= new KrediUI();
        krediUI.krediHesapla(askerKrediManager);


    }
}