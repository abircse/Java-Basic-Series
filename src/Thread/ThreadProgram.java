package Thread;

public class ThreadProgram implements Runnable {

    public static void main(String[] args) {

        /*
         * Thread.ThreadProgram is implemented by 2step
         * 1. Thread.ThreadProgram Class
         * 2. Runnable interface
         */

//        ///------Step: 1-------///
//        Thread t = new Thread()
//        {
//            public void run(){
//
//                for (int i = 0; i <= 20; i++)
//                {
//                    System.out.println("Printing: "+i*5);
//                    try {
//                        sleep(1000);
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
//                }
//            }
//
//        };
//        t.start();

        //-----Step : 2: implement runnable interface----//
        Thread t = new Thread(new ThreadProgram());
        t.start();

    }

    @Override
    public void run() {
        for (int i = 0; i <= 20; i++)
        {
             System.out.println("Printing: "+i*5);

        }


    }
}