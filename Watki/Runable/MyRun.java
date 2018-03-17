package Watki.Runable;

public class MyRun implements Runnable {
    private int id;

    public MyRun(int id) {
        this.id = id;
    }

    @Override
    public void run() {
//        while (true) {
//            System.out.println("Watek: " + id);
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }
        for (int i = 0; i < 10; i++) {
            System.out.println("Wita" + id);
            try {
                Thread.sleep(3000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        System.out.println(id+" :Bye...");
    }
}
