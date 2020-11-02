package kl.example;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class LogbackExample extends LogExample {

    @Override
    protected void logMsg(int i) {
        log.info("This is the " + i + " time I have been run'.");
    }
}
