package com.chatserve.com.demo.controller;


import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.util.HtmlUtils;

import com.chatserve.com.demo.entity.HelloMessage;

@Controller
public class GreetingController {

//    @MessageMapping("/hello")
//    @SendTo("/topic/greetings") // this is the topic that the client subscribes toasdasd
//    public Greeting greet (HelloMessage message) throws Exception {
//         Thread.sleep(800); // simulated delay
//        log.info("Received message: " + message.getName());
//        return new Greeting(HtmlUtils.htmlEscape(message.getName()));

    @MessageMapping("/hello")
    @SendTo("/topic/greetings") // this is the topic that the client subscribes toasdasd
    public HelloMessage greet (HelloMessage message) throws Exception {
         Thread.sleep(800); // simulated delay
        return new HelloMessage(HtmlUtils.htmlEscape(message.getMsg()), HtmlUtils.htmlEscape(message.getUser()));
    }
}
