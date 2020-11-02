package kl.example;

import lombok.extern.log4j.Log4j;

@Log4j
public class Log4jExample extends LogExample {
   @Override
    protected void logMsg(int i) {
       log.info("This is the " + i + " time I have been run'.");
    }
}
