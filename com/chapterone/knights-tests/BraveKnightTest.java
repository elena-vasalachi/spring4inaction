import org.junit.Test;
import static org.mockito.Mockito.*;

/**
 * Created by elenavasalachi on 20/02/17.
 */
public class BraveKnightTest {
    @Test
    public void knightShouldEmbarkOnQuest(){
        Quest mockQuest = mock(Quest.class);
        //Ministrel mockMinistrel = mock(Ministrel.class);
        BraveKnight knight = new BraveKnight(mockQuest);
        knight.embarkOnQuest();
        verify(mockQuest, times(1)).embark();
    }
}
