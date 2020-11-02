package kl.example;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class LogingExampleLogbackTest {
    @Test
    public void logExamplePositiveTest(){
        assertTrue(new LogbackExample().isFinished());
    }
}
