package us.rlit.concurrency;

import static java.lang.Thread.currentThread;
import static us.rlit.ConsoleColors.ANSI_GREEN;
import static us.rlit.ConsoleColors.ANSI_RESET;

public class MyRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println(ANSI_GREEN+"Hi from my " + currentThread().getName() + ANSI_RESET);
    }
}
