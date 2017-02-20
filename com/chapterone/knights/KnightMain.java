/**
 * Created by elenavasalachi on 20/02/17.
 */

import org.springframework.context.support.ClassPathXmlApplicationContext;
public class KnightMain {

    public static void main(String[] args) throws Exception{
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("knights.xml");
        Knight knight = context.getBean(Knight.class);
        knight.embarkOnQuest();
        context.close();
    }
}
