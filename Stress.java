/*
I want to create a Java Class that provides a method that simulates a stress test. 
Arguments:
- An integer 'load' that represents the number of iterations the thread will run.
Returns:
- void
Details:
Inside the method, create a new thread t1 using a lambda expression.
In the lambda expression:
Log a message to the console indicating the thread has started.
Loop from 0 to load:
Sleep the thread for a random time between 250 and 750 milliseconds in each iteration.
Log a message to the console indicating the thread has finished.
Start the thread t1.
Exceptions:
- If the load is less than 1, throw an IllegalArgumentException with the message: "Load must be greater than 0".
- If an InterruptedException occurs, log the exception message to the console.
 */

import java.util.Random;

public class Stress {
    public static void stressTest(int load) {
        if (load < 1) {
            throw new IllegalArgumentException("Load must be greater than 0");
        }

        Thread t1 = new Thread(() -> {
            System.out.println("Thread has started");
            for (int i = 0; i < load; i++) {
                try {
                    Thread.sleep(new Random().nextInt(501) + 250);
                } catch (InterruptedException e) {
                    System.out.println(e.getMessage());
                }
                System.out.println("Thread has finished");
            }
        });

        t1.start();
    }

    public static void main(String[] args) {
        stressTest(5);
    }
}