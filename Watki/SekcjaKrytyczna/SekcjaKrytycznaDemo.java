package Watki.SekcjaKrytyczna;

public class SekcjaKrytycznaDemo {
    public static void main(String[] args) throws InterruptedException {
        ZarzadzanieLista zarzadzanieLista=new ZarzadzanieLista();
        long czas=System.currentTimeMillis();
        zarzadzanieLista.proccess();
//        long czasPo=System.currentTimeMillis();
//        System.out.println(czasPo-czas);

        Thread t1=new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(1);

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                //dostepDoZasobow.increment();
            }
        });
        Thread t2=new Thread(new Runnable() {
            @Override
            public void run() {
                //dostepDoZasobow.increment();
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
        long czasPo=System.currentTimeMillis();
        System.out.println(czasPo-czas);


//        DostepDoZasobow dostepDoZasobow=new DostepDoZasobow();
//
//        Thread t1=new Thread(new Runnable() {
//            @Override
//            public void run() {
//                try {
//                    Thread.sleep(1);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//                dostepDoZasobow.increment();
//            }
//        });
//        Thread t2=new Thread(new Runnable() {
//            @Override
//            public void run() {
//                dostepDoZasobow.increment();
//            }
//        });
//        t1.start();
//        t2.start();
//        try {
//            t1.join();
//            t2.join();
//        }catch (Exception e){
//            e.printStackTrace();
//        }
//        dostepDoZasobow.print();
    }
}
