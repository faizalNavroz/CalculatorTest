package com.example.fordlabs.unitTest;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class EchoTest {

    EchoService echoService = new EchoService();


    //case 1
    @Test
    public void testPing() {
        String message = "starfish";
        assertEquals("Echo: starfish", echoService.ping(message));
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
        assertEquals("WARNING: SHARK", echoService.ping(message));
    }


    @Test
    public void testPingForVarargs(){
        assertEquals("Echo:lobster and fish.WARNING:SHARK AND SEASNAKE.",echoService.ping("lobster","SHARK","fish","SEASNAKE"));
    }


    @Test
    public void testPingForVarargsWithEcho(){
        assertEquals("Echo:lobster and fish.",echoService.ping("lobster","fish"));
    }

    @Test
    public void testPingForVarargsWithWarning(){
        assertEquals("WARNING:SHARK AND SEASNAKE.",echoService.ping("SHARK","SEASNAKE"));
    }


}
