//package corejava;
//
//
//
//class OddEven implements Runnable{
//    static int counter=1;
//    int remainder;
//    Object lock = new Object();
//    OddEven(int remainder ){
//        this.remainder=remainder;
//    }
//    public  void print(){
//        System.out.println(Thread.currentThread().getName() + " " + counter++);
//    }
//    @Override
//    public void run() {
//        for (int i=1;i<=10;i++){
//            while (counter %2 != remainder){
//                try{
//                    lock.wait();
//                }catch (Exception e){
//                    e.printStackTrace();
//                }
//                print();
//                lock.notifyAll();
//            }
//
//        }
//    }
//}
//
//public class OddEvenDemo{
//
//    public static void main(String[] args) {
//        OddEven even =new OddEven(0);
//        OddEven odd = new OddEven(1);
//
//        Thread evenThread = new Thread(even,"Even-Thread");
//        Thread oddThread = new Thread(odd , "Odd-Thread");
//
//        evenThread.start();
//        oddThread.start();
//    }
//
//
//}
//
