package by.mnk.htp.glotovs;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainLoader {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans-spring.xml");
                SenderService senderService = (SenderService) context.getBean("senderService");
        senderService.sendMessage();
    }
}
