package com.example.fordlabs.unitTest;

public class EchoService {

    public String ping(String message) {

        String pingMessage = null;

        if (message != null && message.equals(message.toUpperCase())) {
            pingMessage = "WARNING:" + message;
        } else if (message != null && !message.equals(message.toUpperCase())) {
            pingMessage = "Echo:" + message;

        } else {
            pingMessage = "There is nothing to echo";
        }
        return pingMessage;
    }
}
