package me.devyonghee.eventpublisher;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

@Component
public class AppRunner implements ApplicationRunner {

    @Autowired
    ApplicationContext ctx;

    @Autowired
    ApplicationEventPublisher publisher;

    @Override
    public void run(ApplicationArguments args) throws Exception {
//        ctx.publishEvent(new MyEvent(100));
        publisher.publishEvent(new MyEvent(100));
    }
}
