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
        for (int r=0; r<=10; r++){
            System.out.println("Ruto must Go");
        }
    }

    public void start() {
    }
}
// we can create another class
class fucked  extends Thread{
    public void run(){
        for (int r=0 r<=10;r++){
            System.out.println("Ruto is a nuisance");
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
    }
}
