package Watki.Runable;

public class DoWork {
    int count=0;
    public static void main(String[] args) {
        DoWork doWork=new DoWork();
        Thread t1=new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i <1000 ; i++) {
                    doWork.count++;
                }
            }
        });
        Thread t2=new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i <1000 ; i++) {
                    doWork.count++;
                }
            }
        });
        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        }catch (Exception e){
            e.printStackTrace();
        }


        System.out.println(doWork.count);
    }
}
