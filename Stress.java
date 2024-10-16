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
    /**
     * Performs a stress test by creating a thread that runs a loop for a specified load.
     * The thread will sleep for a random duration between 250 and 750 milliseconds in each iteration.
     *
     * @param load the number of iterations the thread should run. Must be greater than 0.
     * @throws IllegalArgumentException if the load is less than 1.
     * @exception InterruptedException if the thread is interrupted while sleeping.
     * @return void
     * @example stressTest(5); // runs the thread for 5 iterations
     * @example stressTest(10); // runs the thread for 10 iterations
     * @example stressTest(0); // throws IllegalArgumentException
     */
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