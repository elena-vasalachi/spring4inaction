import java.io.PrintStream;

/**
 * Created by elenavasalachi on 20/02/17.
 */
public class Ministrel {

    private PrintStream stream;

    public Ministrel(PrintStream stream) {
        this.stream = stream;
    }

    public void logBeforeQuest() {
        stream.println("Logging before quest!");
    }

    public void logAfterQuest() {
        stream.println("Logging after quest!");
    }
}
