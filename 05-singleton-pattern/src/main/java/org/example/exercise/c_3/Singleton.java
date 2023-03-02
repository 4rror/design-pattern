package org.example.exercise.c_3;

public class Singleton {
    private static Singleton singleton = null;

    private Singleton() {
        System.out.println("生成了一个实例");
    }

    public synchronized static Singleton getInstance() {
        if (singleton == null) {
            singleton = new Singleton();
        }
        return singleton;
    }
}
