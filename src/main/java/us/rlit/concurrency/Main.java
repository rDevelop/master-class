package us.rlit.concurrency;


import static us.rlit.ConsoleColors.*;

public class Main {

    public static void main(String[] args) {


        System.out.println("in main thread");

        Runnable runnable = () -> {
            System.out.println(ANSI_RED+"Holla"+ANSI_RESET);
        };

        Thread t = new Thread(() -> {
            System.out.println(ANSI_BLUE+"Hear ya too"+ANSI_RESET);

        });

        runnable.run();
        t.start();

        new Thread(() ->
                System.out.println(ANSI_PURPLE+"OMG I STILL HEAR YA"+ANSI_RESET)
        ).start();

        AnotherThread anotherThread = new AnotherThread();
        anotherThread.start();
        anotherThread.run();


        Thread thread = new Thread();
        thread.start();

        Thread myRunnable = new Thread(new MyRunnable());
        myRunnable.start();

        Thread myRun = new Thread(new MyRunnable() {
            @Override
            public void run() {
                System.out.println(ANSI_PURPLE+"In the anymous class for my runnable"+ANSI_RESET);
            }
        });
        myRun.setName("JACK");
        myRun.run();

    }


}
