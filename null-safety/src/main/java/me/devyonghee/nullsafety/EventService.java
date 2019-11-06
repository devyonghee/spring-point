package me.devyonghee.nullsafety;

import org.springframework.lang.NonNull;
import org.springframework.stereotype.Service;

@Service
public class EventService {
    @NonNull
    String createEvent(@NonNull String name) {
        return "hello" + name;
    }
}
