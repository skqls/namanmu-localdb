package com.example.namanmu.domain.chat;

import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.simp.config.MessageBrokerRegistry;
import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker;
import org.springframework.web.socket.config.annotation.StompEndpointRegistry;
import org.springframework.web.socket.config.annotation.WebSocketMessageBrokerConfigurer;

@Configuration
@EnableWebSocketMessageBroker
public class WsConfig implements WebSocketMessageBrokerConfigurer {
    // 웹소켓 config. @Enable... 어노테이션 + WebSockekMsgBrokerConfigurer 구현체.
    // 메시지를 중개 / 라우팅하는 브로커 설정.
    // 아래 두 개의 메소드 오버라이딩이 필요함.

    @Override
    public void registerStompEndpoints(StompEndpointRegistry registry) {
        // stomp에서 prefix URL 적용하는 부분
        registry.addEndpoint("/testEndpoint").withSockJS();
        // withSockJS 사용시의 장점:
        // websocket 형태로 연결이 불가능한 경우 http를 사용해서 연결이 지속되도록 만든다는 듯.
    }

    @Override
    public void configureMessageBroker(MessageBrokerRegistry registry) {
        registry.enableSimpleBroker("/topic");
        registry.setApplicationDestinationPrefixes("/app");
    }
}