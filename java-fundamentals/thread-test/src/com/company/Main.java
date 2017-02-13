package com.company;

public class Main {

    public static void main(String[] args) {
        RunnableDemo r1 = new RunnableDemo("Thread - 1");
        r1.start();

        RunnableDemo r2 = new RunnableDemo("Thread - 2");
        r2.start();
    }

    static class RunnableDemo implements Runnable {

        private Thread thread;
        private String threadName;

        RunnableDemo(String threadName) {
            this.threadName = threadName;
            System.out.println("Creating " + threadName);
        }

        @Override
        public void run() {
            System.out.println("Running " + threadName);
            try {
                for (int i = 4; i > 0; i--) {
                    System.out.println("Thread: " + threadName + ", " + i);
                    // Let the thread sleep for a while.
                    Thread.sleep(50);
                }
            } catch (InterruptedException e) {
                System.out.println("Thread " + threadName + " interrupted.");
            }
            System.out.println("Thread " + threadName + " exiting.");
        }

        public void start () {
            System.out.println("Starting " +  threadName );
            if (thread == null) {
                thread = new Thread (this, threadName);
                thread.start ();
            }
        }
    }

}
