// What is a Thread in Java?
// A thread is a lightweight unit of execution within a program.
// In simple words, a thread allows a program to execute a task independently of other tasks.


// Imagine you are using YouTube on your laptop.
// At the same time:
// 🎥 One task plays the video.
// 🎵 Another task plays the audio.
// 📥 Another task downloads the video data.

// These tasks can make progress concurrently using different threads.
// Without multiple threads: A program may need to perform tasks one after another.
// With multiple threads: A program can manage multiple tasks concurrently.
// Note: Multithreading doesn't always mean tasks execute at precisely the same time. 
//They may run in parallel on multiple CPU cores or take turns on a single core.

// 2. What is Multithreading?

// Multithreading is the process of executing multiple threads within a single program.
// For example, suppose you want to perform two tasks:

// Print numbers from 1 to 5
// Print letters from A to E.

// Using one thread, you could complete the number-printing task first and then print the letters.
// Using multiple threads, both tasks can make progress concurrently.
// Why do we use multithreading?
// To perform multiple tasks concurrently.
// To improve application responsiveness.
// To use multiple CPU cores when possible.
// To handle background tasks without blocking the main task.
// Examples include web servers, games, downloading files, and background processing.


// 4. Creating a thread in Java
// Java provides two common ways to create a thread:
// Extending the Thread class.
// Implementing the Runnable interface.

// class MyThread{
//     public void show(){
//         System.out.println("in a show ");
//     }
// }

class MyThread extends Thread {//We create a class named MyThread that inherits from Java's Thread class.

    public void run() {//The run() method contains the task that the thread will perform.
       //Can you change run() to another name?
        //System.out.println("Thread is running in run method ");

        //or call the different method name iinside the run method name
        //like 
        display();//op is display method 

    }
    public void display() {
        System.out.println("Thread is running in display method not run");
    }
    

//  Output:Nothing is printed!
// Why?
// When you call:
// t1.start();
// Java starts a new thread, which executes the run() method.
// But you defined display() instead of overriding run(). Therefore, your display() method is not automatically executed.

}
class B extends Thread{
public void run() {

        for (int i = 1; i <= 50; i++) {
            System.out.println("Hii.....");
            //wait second
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            
        }
}
}
class A extends Thread{
public void run() {

        for (int i = 1; i <= 50; i++) {
            System.out.println("Hellooo.....");
              try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
}
}

//join()
class JoinDemo extends Thread {

    public void run() {
        System.out.println("Child thread finished its task");
    }
}

//Thread Priority
//1. What is Thread Priority?
// Thread priority is a value that indicates the relative importance of a thread to the thread scheduler.
// Imagine you have three workers performing different tasks:
// 🔴 Worker 1: High-priority task.
// 🟡 Worker 2: Medium-priority task.
// 🟢 Worker 3: Low-priority task.
// You can assign different priorities to threads in Java.
// Important: A higher-priority thread is not guaranteed to execute first. Thread scheduling depends on the JVM and operating system.

// 2. What is getPriority()?
// The getPriority() method returns the current priority of a thread.
// Syntax----threadObject.getPriority();

class ThreadPriorityDemo extends Thread {

    public void run() {
        System.out.println("Thread is running");
        //Output--5
//Why is the output 5?

//In Java, the default priority of a newly created thread is normally inherited from its parent thread. Since the main thread normally has priority 5,
// the new thread also gets priority 5 in this example.
    }
}


// 3. What is setPriority()?
// The setPriority() method changes a thread's priority.
// Syntax
// threadObject.setPriority(priority);
// The priority must be between 1 and 10.
// Java provides three commonly used priority constants:

// | Constant               | Value | Meaning          |
// | ---------------------- | ----: | ---------------- |
// | `Thread.MIN_PRIORITY`  |     1 | Minimum priority |
// | `Thread.NORM_PRIORITY` |     5 | Normal priority  |
// | `Thread.MAX_PRIORITY`  |    10 | Maximum priority |

class ThreadPriorityDemo1 extends Thread {

    public void run() {
        System.out.println(
            Thread.currentThread().getName()
            + " Priority: "
            + Thread.currentThread().getPriority()
        );
    }
}
//RUNNABLE 
// 1. What is Runnable in Java?

// Runnable is an interface in Java that represents a task to be executed by a thread.

// In simple words:

// Thread represents the thread that executes the task.
// Runnable represents the task that needs to be executed.
// run() contains the code for the task.
// start() starts a new thread.

// Think of it like this:

// Runnable = Work to do
// Thread = Worker who performs the work
// class AA implements Runnable{
//     public void run() {

//         for (int i = 1; i <= 50; i++) {
//             System.out.println("Hellooo.....");
//               try {
//                 Thread.sleep(10);
//             } catch (InterruptedException e) {
//                 e.printStackTrace();
//             }
//         }
// }
// }
// class BB implements Runnable{
//     public void run() {

//         for (int i = 1; i <= 50; i++) {
//             System.out.println("Hiiii.....");
//               try {
//                 Thread.sleep(10);
//             } catch (InterruptedException e) {
//                 e.printStackTrace();
//             }
//         }
// }
// }

public class ThreadsInJava{
    public static void main (String[] args){
        System.out.println("Hello");
        System.out.println("Java");
        System.out.println("World");
        //op
        // Hello
        // Java
        // World
//  When a Java program starts, the JVM creates the main thread, which executes the main() method.
// The statements in this example execute sequentially on that thread.
// Now, let's create another thread.

MyThread t1 = new MyThread();//We create an object of MyThread.
B t2 = new B();
A t3 = new A();

//At this point, we have created a thread object, but we haven't started a new thread.
      //  t1.start();//it can start new thread and auto matically executes the run method 
        //t2.start();
          try {
                Thread.sleep(2);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        //t3.start();
        JoinDemo t11 = new JoinDemo();

        t11.start();

         try {
                t11.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        System.out.println("Main thread continues");

         ThreadPriorityDemo t12 = new ThreadPriorityDemo();

        System.out.println(t12.getPriority());
                //t3.setPriority(Thread.MAX_PRIORITY);//
        //Calling start() asks the JVM to start a new thread. That thread then executes the run() method.

       // t1.display();

       ThreadPriorityDemo1 t111 = new ThreadPriorityDemo1();
        ThreadPriorityDemo1 t222 = new ThreadPriorityDemo1();
        ThreadPriorityDemo1 t333 = new ThreadPriorityDemo1();

        t111.setPriority(Thread.MIN_PRIORITY);
        t222.setPriority(Thread.NORM_PRIORITY);
        t333.setPriority(Thread.MAX_PRIORITY);

        //0r

t111.setPriority(1);
t222.setPriority(5);
t333.setPriority(10);

// What happens if you use an invalid priority?
// t1.setPriority(15);

// Output/error: Java throws an IllegalArgumentException because 15 is outside the valid range.

// Valid priorities are from 1 to 10.

// Priority 10 always executes first.
// Priority 10 executes ten times faster.
// Priority 1 cannot execute until priority 10 finishes.

        t111.start();
        t222.start();
        t333.start();

        //runnable
    //  Runnable a1 = new AA();   
    //using lambda expression 
    Runnable a1 =() ->
    {
       // public void run() {

        for (int i = 1; i <= 50; i++) {
            System.out.println("Hellooo.....");
              
                try{
                    Thread.sleep(10);
                }
                catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    };
    // to run this uncomment the above AA and BB class to reduce lines of code lambda expression in anonyous class can be used
    
      //Runnable b1 = new BB(); 

      Runnable b1 = () ->{
        for (int i = 1; i <= 50; i++) {
            System.out.println("Hii.....");
              
                try{
                    Thread.sleep(10);
                }
                catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
      };
        Thread t = new Thread(a1);
        Thread t0 = new Thread(b1);
        t.start();
        t0.start();

//   obj.start()
//      |
//      v
// A new thread starts
//      |
//      v
// The new thread executes run()
//      |
//      v
// Code inside run() executes
// One important point ⚠️

// You don't need to call run() yourself when you use start().

// obj.start();  // Starts a new thread
// obj.run();    // Direct method call; does not start a new thread
    }
}


// Important difference: start() vs run()
// start()	                                                  run()
// Starts a new thread.	                     Executes the method like a normal method call if called directly.
// The JVM schedules the new thread.     	A direct call does not start a new thread.
// The new thread executes run().	         The current thread executes the method.

// Remember: To start a new thread, call start(), not run() directly.