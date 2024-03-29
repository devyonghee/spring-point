package me.devyonghee.eventpublisher;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class AnotherHandler {

    @EventListener
    // 우선 순위 제공
//    @Order(Ordered.HIGHEST_PRECEDENCE + 2)
    public void handle(MyEvent event) {
        System.out.println(Thread.currentThread().toString());
        System.out.println("Another" + event.getData());
    }
}
