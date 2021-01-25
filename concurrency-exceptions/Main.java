public class Main {
    public static void main(String[] args) {
        // Handling workers 

        // Thread thread = new Thread(new Runnable() {

        //     @Override
        //     public void run() {
        //         for (int i = 0; i < 5; i++) {
        //             System.out.println("Printing " + i + " in the worker thread");
        //             try {
        //                 Thread.sleep(1000);
        //             } catch (InterruptedException e) {
        //                 // TODO Auto-generated catch block
        //                 e.printStackTrace();
        //             }
        //         }
        //     }
            
        // });

        // thread.start();

        // for (int i = 0; i < 5; i++) {
        //     System.out.println("Printing " + i + " in the main thread");
        //     try {
        //         Thread.sleep(1000);
        //     } catch (InterruptedException e) {
        //         // TODO Auto-generated catch block
        //         e.printStackTrace();
        //     }
        // }

            // int a = 2;
            // int b = 0;
            String name = null;
            try{
                // System.out.println(a/b);
                name.equals("Ezreal");
            }
            catch(Exception e){
                // System.out.println("B was zero");
                System.out.println("Name was null");

                //Print where the erro occurs
                e.printStackTrace();
            }

    }
}