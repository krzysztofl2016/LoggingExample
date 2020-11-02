package kl.example;

import org.junit.Test;

import static org.junit.Assert.assertTrue;


public class LogingExampleLog4j2Test {
    @Test
    public void logExamplePositiveTest(){
        assertTrue(new Log4j2Example().isFinished());
    }
}
