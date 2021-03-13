import Builder.DemoBuilder;
import Singleton.DemoSingleThread;

public class Main {
    public static void main(String[] args) {
        DemoSingleThread.main();
        
        DemoBuilder.main();

        DemoBuilder.main();
    }
}