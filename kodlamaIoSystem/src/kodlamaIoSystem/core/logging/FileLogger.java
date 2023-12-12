package kodlamaIoSystem.core.logging;

import kodlamaIoSystem.dataAccess.IDataAccess;

public class FileLogger implements IBaseLogger {
    @Override
    public void log(String message) {
        System.out.println("Dosyaya loglandı: "+message);
    }
}
