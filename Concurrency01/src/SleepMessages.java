
/* Thread.sleep causes the current thread to suspend execution for a specified period. This is an efficient means of making 
   processor time available to the other threads of an application or other applications that might be running on a computer system. 
   The sleep method can also be used for pacing, as shown in the example that follows, and waiting for another thread with duties 
   that are understood to have time requirements, as with the SimpleThreads example in a later section.

   Two overloaded versions of sleep are provided: one that specifies the sleep time to the millisecond and one that specifies
   the sleep time to the nanosecond. However, these sleep times are not guaranteed to be precise, because they are limited
   by the facilities provided by the underlying OS. Also, the sleep period can be terminated by interrupts.
   In any case, you cannot assume that invoking sleep will suspend the thread for precisely the time period specified.
*/
public class SleepMessages {
    

    public static void main(String args[]) throws InterruptedException {

        /* Notice that main declares that it throws InterruptedException. This is an exception that sleep throws when another thread 
           interrupts the current thread while sleep is active. Since this application has not defined another thread to cause the interrupt
           (only the initial thread is ever created), there isn't a need to catch InterruptedException.
        */

        String poemStanza[] = {
            "\nTwo roads diverged in a yellow wood,", "And sorry I could not travel both",
            "And be one traveler, long I stood", "And looked down one as far as I could",
            "To where it bent in the undergrowth;"
        };

        String poemStanza2[] = {
            "\nThen took the other, as just as fair,", "And having perhaps the better claim,",
            "Because it was grassy and wanted wear;", "Though as for that the passing there",
            "Had worn them really about the same,"
        };        

        for (int i = 0; i < poemStanza.length; i++) {
            //Sleep for 3 seconds
            Thread.sleep(3000);
            //Print a message
            System.out.println(poemStanza[i]);
        }

        /* An interrupt is an indication to a thread that it should stop what it is doing and do something else. 
           It's up to the programmer to decide exactly how a thread responds to an interrupt, but it is very common 
           for the thread to terminate.  Here is an example of one way to do that
        */
        for (int i = 0; i < poemStanza2.length; i++) {
            // Pause for 2 seconds
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                // We've been interrupted: no more messages.
                return;
            }
            // Print a message
            System.out.println(poemStanza2[i]);
        }
    }
}
