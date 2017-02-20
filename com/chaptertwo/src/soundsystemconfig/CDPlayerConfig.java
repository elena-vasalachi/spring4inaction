package soundsystemconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import soundsystem.CDPlayer;
import soundsystem.CompactDisc;
import soundsystem.SergentPeppers;

/**
 * Created by elenavasalachi on 20/02/17.
 */
@Configuration
//@ComponentScan(basePackageClasses = {CompactDisc.class})
public class CDPlayerConfig {

    @Bean
    public CompactDisc sgtPeppers(){
        return new SergentPeppers();
    }

    @Bean
    public CDPlayer cdPlayer(){
        return new CDPlayer(sgtPeppers());
    }
}
