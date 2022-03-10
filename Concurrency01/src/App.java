public class App {
    
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        //Testing Threading by implementing Runable class:
        // (new Thread(new HelloRunnable())).start();
        
        //HelloRunnable helloRunnable = new HelloRunnable();
       // (new Thread(new HelloRunnable())).start();

        //(new HelloThread()).start();
        //FIXME:  HOw?


    }

    public class HelloRunnable implements Runnable {

        public void run() {
            System.out.println("Hello from a thread!");
        } 
    }

    public class HelloThread extends Thread {

        public void run() {
            System.out.println("Hello from a thread!");
        }    
    }


}
