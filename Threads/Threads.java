package Threads;
/*this involves when a certain program can execute multiple tasks at the same time
* to use the thread keyword you have to extend from the thread class
*
* */
// lets create a random class that prints several greetings
// we have to extend thread for it to work
// remember its thread not threads
class Kenya extends Thread {
    // a methods that prints the statements and it should always be run
    public void  run(){
        for (int r=0; r<=100; r++){
            System.out.println("Ruto must Go");
            // we can try to print them in a sequence
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

}
// we can create another class
class fucked  extends Thread{
    public void run(){
        for (int r=0; r<=100;r++){
            System.out.println("Ruto is a nuisance");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
public class Threads {
    public static void main(String[] args) {
        // now well come and create an object from the classes
        Kenya fKenya = new Kenya();
        fucked f = new fucked();/// we can now access the inside properties
        // inorder to start the thread you have to use thread.start
        fKenya.start();
        f.start();

        // we can also set the priority in which a a certain thread can run
        // the default priority is usually 5
        System.out.println(fKenya.getPriority());// default is five
        // 5-10 is usually high priority and 5-0 is usually low priority
        fKenya.setPriority(9);// here we have set it to high priority
        System.out.println(fKenya.getPriority());
        // we can now set it to low priority
        fKenya.setPriority(1);
        System.out.println(fKenya.getPriority());
    }
}
