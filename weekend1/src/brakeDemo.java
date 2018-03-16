public class brakeDemo {
    public static void main(String[] args) {

        for (int i=0; i < 15; i++){
            System.out.println(i);
            if(i==10){
                break;
            }
        }

        for(int z = 0; z < 3; z++){
            for (int x = 0; x < 3; x++)
                System.out.println("1 petla : " + z + " 2 petla : " + x);
        }
    }
}
