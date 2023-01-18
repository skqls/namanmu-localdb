//package com.example.namanmu.domain.chat;//package com.example.namanmu.domain.chat;
//
//import com.inspirit941.websocketexample.model.Message;
//import org.springframework.messaging.handler.annotation.MessageMapping;
//import org.springframework.messaging.handler.annotation.Payload;
//import org.springframework.messaging.handler.annotation.SendTo;
//import org.springframework.messaging.simp.SimpMessageHeaderAccessor;
//import org.springframework.stereotype.Controller;
//
//@Controller
//public class ChatController {
//
//    // add user to the chat / send message
//    // @Payload : WebSocket에서 전송하는 데이터를 받기 위한 어노테이션.
//    // capture the username (who will chat / currently in join state)
//    @MessageMapping("/chat.register")  // map the same url from client to server
//    @SendTo("/topic/public")
//    // specify queue. (request / response. based on url). 여기서는 config에서 enableSimpleBroker에서 등록한 거
//    public Message register(
//            @Payload Message msg,
//            SimpMessageHeaderAccessor headerAccessor
//    ) {
//        // 누가 보냈는지 정보 담기
//        headerAccessor.getSessionAttributes().put("username", msg.getSender());
//        return msg;
//    }
//
//    @MessageMapping("/chat.send")
//    @SendTo("/topic/public")
//    public Message sendMessage(@Payload Message msg) {
//        return msg;
//    }
//}