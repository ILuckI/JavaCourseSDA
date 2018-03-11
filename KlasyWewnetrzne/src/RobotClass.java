public class RobotClass {
    public static class Robot {
        private Greetings powitanie;

        public Robot(Greetings powitanie) {
            this.powitanie = powitanie;
        }

        public void saySomething() {
            powitanie.sayHallo();
        }

    }

    public static void main(String[] args) {

        Robot jan = new Robot(new Greetings() {
            @Override
            public void sayHallo() {
                System.out.println("Witaj!");
            }
        });
        Robot john = new Robot(new Greetings() {
            @Override
            public void sayHallo() {
                System.out.println("Hello!");
            }
        });
        john.saySomething();
        jan.saySomething();
    }
}
