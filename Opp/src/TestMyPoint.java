public class TestMyPoint {
    public static void main(String[] args) {

        MyPoint testA = new MyPoint();
        MyPoint testB = new MyPoint(10,10);
        MyPoint testC = new MyPoint(100,100);

        System.out.println("- test.distance (absolute value):");
        System.out.println(testA.distance(25,25));
        System.out.println(testB.distance(25,25));
        System.out.println(testC.distance(25,25));

        System.out.println("\n- test.distance.between.MyPoint (absolute value):");
        System.out.println(testA.anotherDistance(testB));
        System.out.println(testB.anotherDistance(testC));
        System.out.println(testA.anotherDistance(testC));

        System.out.println("\n- test.distance.from.MyPoint.to.0,0 (absolute value):");
        System.out.println(testA.to00());
        System.out.println(testB.to00());
        System.out.println(testC.to00());

    }
}
