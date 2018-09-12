package us.rlit.concurrency;

import us.rlit.ConsoleColors;

import static us.rlit.ConsoleColors.ANSI_RESET;

public class AnotherThread extends Thread {

    @Override
    public void run() {
        System.out.println(ConsoleColors.ANSI_CYAN+"Hi from my " + currentThread().getName() + ANSI_RESET);
    }
}
