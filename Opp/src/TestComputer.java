public class TestComputer {
    public static void main(String[] args) {
        Computer computer1 = new Computer("CD7633","PC","i7","GigaByte 7f-22");
        Computer computer2 = new Computer("CD7633","PC","i7","GigaByte 7f-22", 4, true,true);

        System.out.println(computer1);
        System.out.println(computer2);

        computer2.uninstallWindows();
        System.out.println(computer2);
    }
}
