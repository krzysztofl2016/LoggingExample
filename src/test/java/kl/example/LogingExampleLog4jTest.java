package kl.example;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class LogingExampleLog4jTest {
    @Test
    public void logExamplePositiveTest(){
        assertTrue(new Log4jExample().isFinished());
    }
}
