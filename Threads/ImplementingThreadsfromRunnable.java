package Threads;
// since class threads is implemented from class runnable we can eliminate directly from interface runnable
public class ImplementingThreadsfromRunnable {
    public static void main(String[] args) {
        Runnable helloRunnable = ()->{// we are also using lambdas
            // here we are going to use an anonymous class to implement the functional Interface{
                for (int i = 0; i<=5; i++){
                    System.out.println("we are hello runnable");
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        System.out.println("stop");
                    }
                }
        };
        // we can implement another interface
        Runnable HiRunnable = ()->{
            for (int m =0; m<=5;m++){
                System.out.println(" we are in hi runnable");
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };
        // we have to implement from the thread class and create an object from it
        Thread thread1 = new Thread(helloRunnable);// it has the parameter of the interface
        Thread thread2 = new Thread(HiRunnable);//
        // we can now start the threads
        thread1.start();
        thread2.start();
    }
}
