package com.fs.chatroom.config.websocket;

import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.simp.config.MessageBrokerRegistry;
import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker;
import org.springframework.web.socket.config.annotation.StompEndpointRegistry;
import org.springframework.web.socket.config.annotation.WebSocketMessageBrokerConfigurer;

@Configuration
@EnableWebSocketMessageBroker
public class WebSocketConfig implements WebSocketMessageBrokerConfigurer {
 
    @Override
    public void configureMessageBroker(MessageBrokerRegistry config) {
        //topic用来广播，user用来实现点对点
        config.enableSimpleBroker("/topic", "/user");
    }
 
    /**
     * 开放节点
     * @param registry
     */
    @Override
    public void registerStompEndpoints(StompEndpointRegistry registry) {
        //注册两个STOMP的endpoint，分别用于广播和点对点
 
 
        //广播
        registry.addEndpoint("/server").setAllowedOrigins("*").withSockJS();
 
//        //点对点
//        registry.addEndpoint("/privateServer").setAllowedOrigins("*").withSockJS();
    }
 
 
}