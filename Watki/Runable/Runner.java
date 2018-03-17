package Watki.Runable;

public class Runner {
    public static void main(String[] args) {
        Runnable[] watki=new Runnable[10];
            Thread[] threads=new Thread[10];

        for (int i = 0; i <watki.length ; i++) {
            watki[i]=new MyRun(i+1);
        }
        for (int i = 0; i <threads.length ; i++) {
            threads[i]=new Thread(watki[i]);
        }
        for (int i = 0; i <threads.length ; i++) {
            threads[i].start();
        }
//        for (int i = 0; i <watki.length ; i++) {
//            watki[i].run();
//        }
    }
}
