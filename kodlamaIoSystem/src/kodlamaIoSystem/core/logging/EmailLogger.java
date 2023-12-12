package kodlamaIoSystem.core.logging;

public class EmailLogger implements IBaseLogger{
    @Override
    public void log(String message) {
        System.out.println("Emaile loglandı: "+message);

    }
}
