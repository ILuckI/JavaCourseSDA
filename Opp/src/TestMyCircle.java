public class TestMyCircle {
    public static void main(String[] args) {

        MyCircle testA = new MyCircle();
        MyCircle testB = new MyCircle(10,10, 10);
        MyCircle testC = new MyCircle(20,20,20);

        System.out.println("- test.print:");
        System.out.println(testA);
        System.out.println(testB);
        System.out.println(testC);

        System.out.println("\n- test.getArea :");
        System.out.println(testB.getArea());
        System.out.println(testC.getArea());

        System.out.println("\n- test.getCircumference:");
        System.out.println(testB.getCircumference());
        System.out.println(testC.getCircumference());

    }

}
