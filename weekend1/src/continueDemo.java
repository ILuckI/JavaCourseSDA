public class continueDemo {
    public static void main(String[] args) {

//       for (int i=1; i<=20; i++){
//           if (i%2==0){
//               continue;
//           }
//           System.out.println(i);
//       }

        int z=1;
        while (z<=10) {
            if (z % 2 == 0) {
                z++;
                continue;
            }
            System.out.println(z);
            z++;

        }



    }
}


