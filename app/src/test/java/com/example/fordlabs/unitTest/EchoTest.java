package com.example.fordlabs.unitTest;

import org.junit.Test;

import static org.junit.Assert.*;


public class EchoTest {

    EchoService echoService = new EchoService();

    //case 1
    @Test
    public void testPing() {
        String message = "starfish";
        assertEquals("Echo:starfish", echoService.ping(message));
    }

    //case 2
    @Test
    public void testPingNotNull() {
        String message = null;
        assertEquals("There is nothing to echo", echoService.ping(message));
    }

    //case 3
    @Test
    public void testPingForUpperCase() {
        String message = "SHARK";
        assertEquals("WARNING:SHARK", echoService.ping(message));
    }



}
