package kodlamaIoSystem.core.logging;

public class DatabaseLogger implements IBaseLogger{
    @Override
    public void log(String message) {
        System.out.println("Veritabanına loglandı: "+message);
    }
}
