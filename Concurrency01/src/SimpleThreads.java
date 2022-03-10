public class SimpleThreads {

    public static void main(String args[]) throws InterruptedException {

        //Delay (in ms) before we interrupt our MessageLoop thread.  (default is five minutes)
        long patience = 1000 * 60 * 10;

        //If command line arugment is present, gives patience in seconds
        if (args.length > 0) {
            try {
                patience = Long.parseLong(args[0]) * 1000;

            } catch (NumberFormatException e) {
                System.err.println("Argument must be an integer for this app to work!");
                System.exit(1);
            }
        }

        threadMessage("Starting MessageLoop thread...");
        long startTime = System.currentTimeMillis();
        Thread t = new Thread(new MessageLoop());
        t.start();

    }

    private static class MessageLoop implements Runnable
    
}
