package main.java.patterns.creational.singleton;

public class SynchronizedBlockThread extends Thread{
    public void run() {
        SingletonWithSynchronizedBlock instance = SingletonWithSynchronizedBlock.getInstance();
        System.out.println(Thread.currentThread().getName()+": "+instance);
    }
}
