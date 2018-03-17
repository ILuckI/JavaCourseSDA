package Zajecia1003.KlasyWewnetrzne;

public class Demo {
    public static void main(String[] args) {
        OuterClass oc = new OuterClass();
        OuterClass.InnerClass ic1 = oc.instantiate();
        OuterClass.InnerClass ic2=oc.new InnerClass();

    }
    public static void AnonInterfTest(){
        Greetings pl=new Greetings() {
            @Override
            public void sayHello() {
                System.out.println("Witaj");
            }
        };
        pl.sayHello();
    }
}
