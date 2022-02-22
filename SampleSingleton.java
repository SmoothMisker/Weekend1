import java.sql.Connection;

public class SampleSingleton {

    private static Connection conn = null;

    private volatile static SampleSingleton instance = null;

    private SampleSingleton(){}

    public SampleSingleton getInstance() {
        if(instance == null) {
            synchronized(this) {
                instance = new SampleSingleton();
            }
        }
        return instance;
    }

}