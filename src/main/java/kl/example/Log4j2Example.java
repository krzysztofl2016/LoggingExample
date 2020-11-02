package kl.example;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class Log4j2Example extends LogExample {
    @Override
    protected void logMsg(int i) {
        log.info("This is the " + i + " time I have been run'.");
    }
}

