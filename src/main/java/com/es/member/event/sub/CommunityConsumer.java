package com.es.member.event.sub;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.function.Consumer;

@Component
public class CommunityConsumer {

    @Bean
    public Consumer<String> joinCommunity() {
        return message -> System.out.println("메세지 수신 >>>> " + message);
    }
}
