package creational_patterns.singleton;

public class DemoSingleThread {

    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance("FOO");
        Singleton anotherSingleton = Singleton.getInstance("BAR");
        System.out.println(singleton.value);
        System.out.println(anotherSingleton.value);

        treadTest();
    }

    private static void treadTest() {
        Thread t1 = new Thread(() -> {
            Singleton singleton1 = Singleton.getInstance("test");
            System.out.println(singleton1.value);
        });
        Thread t2 = new Thread(() -> {
            Singleton singleton1 = Singleton.getInstance("abc");
            System.out.println(singleton1.value);
        });

        t1.start();
        t2.start();
    }

}
