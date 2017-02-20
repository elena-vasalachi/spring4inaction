import java.io.PrintStream;

/**
 * Created by elenavasalachi on 20/02/17.
 */
public class SlayDragonQuest implements Quest{

    private PrintStream stream;

    public SlayDragonQuest(PrintStream stream) {
        this.stream = stream;
    }

    @Override
    public void embark() {
        stream.println(SlayDragonQuest.class);
    }
}
