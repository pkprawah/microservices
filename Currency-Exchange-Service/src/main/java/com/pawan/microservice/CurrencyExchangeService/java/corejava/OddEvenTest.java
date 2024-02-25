package corejava;

public class OddEvenTest {

    int counter=1;

    public void printOdd() {
        synchronized (this) {
            for (int i = 1; i <= 10; i++) {
                if (counter % 2 == 0) {
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println(Thread.currentThread().getName() + " : " + counter);
                counter++;
                notify();
            }
        }
    }

    public void printEven() {
        synchronized (this) {
            for (int i = 1; i <= 10; i++) {
                if (counter % 2 == 1) {
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println(Thread.currentThread().getName() + " : " + counter);
                counter++;
                notify();
            }
        }
    }

    public static void main(String[] args) {
        OddEvenTest OddEven = new OddEvenTest();
        // Create thread t1
        Thread eventhread = new Thread(new Runnable() {
            public void run()
            {
                OddEven.printEven();
            }
        },"Even thread");

        Thread oddThread = new Thread(new Runnable() {
            @Override
            public void run() {
                OddEven.printOdd();
            }
        },"odd Thread");

        eventhread.start();
        oddThread.start();
    }
}
