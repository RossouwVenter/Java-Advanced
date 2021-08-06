package Lesson15Concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


public class ExecutorExample {

    public static void main(String[] args) {
        ExecutorService es = Executors.newFixedThreadPool(8);
        es.execute(new ExampleRunnable("one"));
        es.execute(new ExampleRunnable("two"));        
        es.shutdown();
    }
}
