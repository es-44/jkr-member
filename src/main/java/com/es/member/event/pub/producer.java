package com.es.member.event.pub;

import lombok.RequiredArgsConstructor;
import org.springframework.cloud.stream.function.StreamBridge;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class producer {

    private final StreamBridge streamBridge;
    private final String outputChannel = "member-out-0";

    public void send() {
        streamBridge.send(outputChannel, "test");
    }
}
