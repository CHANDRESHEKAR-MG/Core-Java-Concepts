import java.util.concurrent.atomic.AtomicInteger;
// 1. What is a Race Condition?
// A race condition occurs when multiple threads access and modify shared data concurrently, and the program's result depends on the timing or order of their operations.
// In simple words, two or more threads compete to access or change the same data, and this can produce an incorrect result.


// In simple words, two or more threads compete to access or change the same data, and this can produce an incorrect result.

// Real-life example 🏦

// Imagine your bank account has ₹1,000.

// Two people try to withdraw money from the same account at nearly the same time:

// Thread 1 withdraws ₹500.
// Thread 2 withdraws ₹300.

// You might expect the remaining balance to be:

// ₹1,000 − ₹500 − ₹300 = ₹200

// But if both threads read the original balance before either updates it, they might overwrite each other's updates.

// The final balance could incorrectly become ₹700 or ₹500 instead of ₹200.

//This is an example of a race condition

class Counter {
    int count = 0;

    void increment() {
        count++;
    }
}
// Method 1: Using synchronized
// The synchronized keyword allows only one thread at a time to execute a synchronized instance method on the same object.
//How can we prevent a Race Condition?
// Java provides several ways to coordinate access to shared data.

// Let's learn the most important ones.
class Counter1 {
    int count1 = 0;

    synchronized void increment() {
        count1++;
//         How does synchronized work?

// Consider:
// synchronized void increment() {
//     count++;
// }
// When Thread 1 enters increment(), it acquires the lock associated with the Counter object.
// Thread 2 must wait to acquire that same lock before entering the method.
// Once Thread 1 finishes and releases the lock, Thread 2 can proceed.
    }
}
public class RaceConditions{
    public static void main(String[] args) throws InterruptedException  {
           Counter c = new Counter();

        Runnable task = () -> {
            for (int i = 0; i < 10000; i++) {
                c.increment();
            }
        };

        Thread t1 = new Thread(task);
        Thread t2 = new Thread(task);

        t1.start();
        t2.start();
        try {
             t1.join();
        } catch (InterruptedException e) {
              e.printStackTrace();
        }
         try {
             t2.join();
        } catch (InterruptedException e) {
              e.printStackTrace();
        }
        
       

        System.out.println("Final count: " + c.count);


        Counter1 c1= new Counter1();

        Runnable task1 = () -> {
            for (int i = 0; i < 100000; i++) {
                c1.increment();
            }
        };

        Thread t11 = new Thread(task1);
        Thread t21 = new Thread(task1);

        t11.start();
        t21.start();

        try {
             t11.join();
        } catch (InterruptedException e) {
              e.printStackTrace();
        }
         try {
             t21.join();
        } catch (InterruptedException e) {
              e.printStackTrace();
        }
        
       

        System.out.println("Final count: " + c1.count1);


         AtomicInteger count11 = new AtomicInteger(0);
// count.incrementAndGet();
// Atomically increments the value.
// And:
// count.get();
// Returns the current value.
// For a simple shared counter, AtomicInteger is often a good choice.
        Runnable task11= () -> {
            for (int i = 0; i < 100000; i++) {
                count11.incrementAndGet();
            }
        };

        Thread t12 = new Thread(task11);
        Thread t22= new Thread(task11);

        t12.start();
        t22.start();

        t12.join();
        t22.join();

        System.out.println("Final count: " + count11.get());
    }
}

// | Race condition                                                             | Synchronization                                                    |
// | -------------------------------------------------------------------------- | ------------------------------------------------------------------ |
// | An error-prone situation caused by unsafely coordinated concurrent access. | A technique for coordinating access to shared resources.           |
// | Can produce incorrect or unpredictable results.                            | Can prevent race conditions when applied correctly.                |
// | Often occurs when multiple threads modify shared mutable data.             | Can use locks to control which thread accesses a critical section. |

// Important distinction

// Multithreading itself is not a race condition.

// Multithreading allows multiple threads to make progress concurrently.

// A race condition arises when the correctness of the result depends on the timing or interleaving of operations.