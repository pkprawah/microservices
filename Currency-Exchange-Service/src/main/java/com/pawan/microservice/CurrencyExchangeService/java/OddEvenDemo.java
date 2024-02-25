//public class OddEvenDemo {
//
//    private  int number;
//    public OddEvenDemo(int number) {
//        this.number=number;
//    }
//    public void printOddNumber() {
//        synchronized (this) {
//            for (int i = 1; i <= number; i++) {
//                if (i % 2 == 0) {
//                    try{
//                        wait();
//                    }
//                 catch (Exception e){
//
//                 }
//                }
//                System.out.println("Even : " + i);
//            }
//            notify();
//        }
//    }
//
//
//    public void printEvenNumber() {
//        synchronized (this) {
//            for (int i = 1; i <= number; i++) {
//                if (i % 2 == 1) {
//                    try{
//                        wait();
//                    }
//                    catch (Exception e){
//
//                    }
//                }
//                System.out.println("Odd : " + i);
//            }
//            notify();
//        }
//    }
//
//    public static void main(String[] args) {
//
//        OddEvenDemo OddEvenDemo = new OddEvenDemo(10);
//
//        Thread t1 = new Thread(new Runnable() {
//            public void run()
//            {
//                OddEvenDemo.printEvenNumber();
//            }
//        });
//
//        // Create thread t2
//        Thread t2 = new Thread(new Runnable() {
//            public void run()
//            {
//                OddEvenDemo.printOddNumber();
//            }
//        });
//
//        // Start both threads
//        t1.start();
//        t2.start();
//    }
//
//}
