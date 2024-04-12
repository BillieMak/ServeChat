package com.chatserve.com.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class HelloMessage {

    private String msg;
    private String user;

    public String toString() {
        return "{user: '" + user + "' , msg: '" + msg + "'}";
    }
}
