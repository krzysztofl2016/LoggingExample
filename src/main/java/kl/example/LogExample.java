package kl.example;

public abstract class LogExample {
    public boolean isFinished()  {
        for (int i = 0; i < 20; i++) {
            logMsg(i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        return true;
    }

    protected abstract void logMsg(int i);
}
