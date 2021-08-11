package main.java.patterns.creational.singleton;

/**
 * Demo class to check all types of singleton class creation
 * <p>
 * 1.   SingletonEager: instantiates SingletonEager when class loads and returns the same everytime.
 * 2.   SingletonLazy: instantiates SingletonLazy for the first time and returns the same for everytime.
 * 3.   SingletonWithSynchronizedMethod: instantiates the class in lazy mechanism, if 2 threads try to create an instance at same time it will synchronize the threads and avoid duplicate instance creation. instance creation and read is synchronized here.
 * 4.   SingletonWithSynchronizedBlock: instantiates the class in lazy mechanism, only creation of instance is synchronized here.
 *
 * @author sreehari.pullasetty@gmail.com
 * @since 10/08/2021
 */
public class SingletonDemo {
    public static void main(String[] args) throws InterruptedException, ClassNotFoundException {
        SingletonEager singletonEager1 = SingletonEager.getInstance();
        System.out.println(singletonEager1);
        SingletonEager singletonEager2 = SingletonEager.getInstance();
        System.out.println(singletonEager2);

        SingletonLazy singletonLazy1 = SingletonLazy.getInstance();
        System.out.println(singletonLazy1);
        SingletonLazy singletonLazy2 = SingletonLazy.getInstance();
        System.out.println(singletonLazy2);

        SynchronizedMethodThread sm1 = new SynchronizedMethodThread();
        SynchronizedMethodThread sm2 = new SynchronizedMethodThread();
        sm1.start();
        sm2.start();

        SynchronizedBlockThread sb1 = new SynchronizedBlockThread();
        SynchronizedBlockThread sb2 = new SynchronizedBlockThread();
        sb1.start();
        sb2.start();

        Class singletonLazy3 = Class.forName("main.java.patterns.creational.singleton.SingletonLazy");
        Class singletonLazy4 = Class.forName("main.java.patterns.creational.singleton.SingletonLazy");

        System.out.println(singletonLazy3.equals(singletonLazy4));

    }
}
