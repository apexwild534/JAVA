THREAD METHODS


In Java, the java.lang.Thread class provides various methods to manage and control threads. These methods allow you to perform operations such as starting and stopping threads, controlling thread priority, and handling thread interruptions. Here are some of the most commonly used methods of the Thread class:

start():

The start() method is used to start the execution of a thread. When this method is called, the thread transitions from the "New" state to the "Runnable" state, and its run() method is executed concurrently.


Thread myThread = new Thread(myRunnable);
myThread.start();



run():

The run() method is where the actual code of the thread's task is placed. You should override this method when creating a custom thread by extending the Thread class or by implementing the Runnable interface.



public void run() {
    // Thread's task goes here
}



currentThread():

The currentThread() method returns a reference to the currently executing thread. This is a static method of the Thread class.


Thread current = Thread.currentThread();



getName() and setName(String name):

getName() returns the name of the thread, while setName(String name) sets the name of the thread. Names can help identify threads in a multithreaded application.



Thread myThread = new Thread(myRunnable);
myThread.setName("WorkerThread");
String threadName = myThread.getName();



sleep(long milliseconds):

The sleep() method causes the current thread to pause its execution for the specified number of milliseconds. It is often used for introducing delays in a thread's execution.


try {
    Thread.sleep(1000); // Sleep for 1 second
} catch (InterruptedException e) {
    // Handle interruptions
}



yield():

The yield() method suggests to the thread scheduler that the current thread is willing to yield its current CPU time to other threads. It is used for giving other threads a chance to run.


Thread.yield();


join():

The join() method allows one thread to wait for the completion of another thread. It can be used to ensure that a thread has finished its work before continuing execution.


Thread otherThread = new Thread(otherRunnable);
otherThread.start();
try {
    otherThread.join(); // Wait for otherThread to complete
} catch (InterruptedException e) {
    // Handle interruptions
}



interrupt():

The interrupt() method is used to interrupt a thread that is currently executing. It sets the interrupted flag of the thread, which can be checked using isInterrupted() or handled through exception handling.


myThread.interrupt();



isAlive():

The isAlive() method checks whether a thread is still alive (i.e., it has been started and not terminated).


boolean alive = myThread.isAlive();


setPriority(int priority) and getPriority():

These methods allow you to set and get the priority of a thread. Thread priorities range from Thread.MIN_PRIORITY to Thread.MAX_PRIORITY (1 to 10 by default).


myThread.setPriority(Thread.MAX_PRIORITY);
int priority = myThread.getPriority();


These are some of the key methods provided by the Thread class for working with threads in Java. Properly managing threads and using these methods appropriately is essential for effective multithreaded programming.