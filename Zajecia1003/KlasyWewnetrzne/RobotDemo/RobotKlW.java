package Zajecia1003.KlasyWewnetrzne.RobotDemo;


import Zajecia1003.KlasyWewnetrzne.Greetings;



public class RobotKlW {
    public static class Robot{
        private Greetings powitanie;
        public Robot(Greetings powitanie){
            this.powitanie=powitanie;
        }
        public void saySomething(){
            powitanie.sayHello();
        }


    }

    public static void main(String[] args) {
        Robot jan=new Robot(new Greetings() {
            @Override
            public void sayHello() {
                System.out.println("Witaj");
            }
        });
        Robot john=new Robot(new Greetings() {
            @Override
            public void sayHello() {
                System.out.println("Hello");
            }
        });
        jan.saySomething();
        john.saySomething();
    }
}
