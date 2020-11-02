# LoggingExample

In this project I present three ways for logging data in a java application.
- log4j (log4j.xml)
- log4j2 (log4j2.xml)
- logback (successor of log4j) (logback.xml)

I used a lombok annotations for shortener the code. Each file are configured for rotating and compress (in gz format ) logs every seconds. It is only for learning purposes. Of course, in a practical example we want rotate logs in longer period of time (usually 24h). To adopt example to a real live sutiation time can be changed by setting:

```
... %d{yyyy-MM-dd_HH_mm_ss}.log.gz
to
... %d{yyyy-MM-dd}.log.gz
```

in a xml configurations file 
 
I used the following tutorial:
https://www.baeldung.com/java-logging-intro
