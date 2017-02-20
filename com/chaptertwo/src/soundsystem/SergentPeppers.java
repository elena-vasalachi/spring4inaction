package soundsystem;

import org.springframework.stereotype.Component;

/**
 * Created by elenavasalachi on 20/02/17.
 */

@Component
public class SergentPeppers implements CompactDisc {

    private String tile = "Sgt. Pepper's Lonely Hearts Club Band";
    private String author = "The Beatles";

    @Override
    public void play() {
        System.out.println("Playing " + tile + " by " + author);
    }
}
