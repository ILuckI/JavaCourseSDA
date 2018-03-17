package Watki.SekcjaKrytyczna;


import java.util.ArrayList;
import java.util.Random;

public class ZarzadzanieLista {
    private ArrayList<Integer> stage1=new ArrayList();
    private ArrayList<Integer> stage2=new ArrayList();

    private Random random=new Random();
    private  final Object lockerSt1=new Object();
    private final Object lockerSt2=new Object();

    public void st1() throws InterruptedException {
        synchronized (lockerSt1){
        Thread.sleep(1);
        stage1.add(random.nextInt());
    }}
    public void st2() throws InterruptedException {
        synchronized (lockerSt2){
        Thread.sleep(1);
        stage2.add(random.nextInt());
    }}
    public void proccess() throws InterruptedException {
        for (int i = 0; i <1000 ; i++) {
            st1();
            st2();
        }
    }

}
