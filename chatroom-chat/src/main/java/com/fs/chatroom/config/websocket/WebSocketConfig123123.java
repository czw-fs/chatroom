//package com.fs.chatroom.config.websocket;
//
//import org.springframework.context.annotation.Configuration;
//import org.springframework.messaging.simp.config.MessageBrokerRegistry;
//import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker;
//import org.springframework.web.socket.config.annotation.StompEndpointRegistry;
//import org.springframework.web.socket.config.annotation.WebSocketMessageBrokerConfigurer;
//
//@Configuration
//@EnableWebSocketMessageBroker
//public class WebSocketConfig123123 implements WebSocketMessageBrokerConfigurer {
//    /**
//     * 注册stomp站点
//     */
//    @Override
//    public void registerStompEndpoints(StompEndpointRegistry registry) {
//
//        registry.addEndpoint("/ws/ep").setAllowedOrigins("*").withSockJS();
//
//    }
//
//    /**
//     * 注册拦截"/topic","/queue"的消息
//     * 自定义包含 /topic 路径的为广播消息， 包含 /queue 为私法消息
//     */
//    @Override
//    public void configureMessageBroker(MessageBrokerRegistry registry) {
//        registry.enableSimpleBroker("/topic","/queue");
//
//    }
//}