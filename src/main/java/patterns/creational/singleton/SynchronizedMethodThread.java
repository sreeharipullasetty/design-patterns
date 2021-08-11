package main.java.patterns.creational.singleton;

public class SynchronizedMethodThread extends Thread {

    public void run() {
        try {
            SingletonWithSynchronizedMethod instance = SingletonWithSynchronizedMethod.getInstance();
            System.out.println(Thread.currentThread().getName()+": "+instance);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
