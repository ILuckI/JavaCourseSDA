public class exString {
    public static void main(String[] args) {
//        String name = "Lukasz";
//        for (int i = 0; i < name.length(); i++) {
//            System.out.printf("%c\n", name.charAt(i));
//        }
//        for (int i = 0; i < name.length(); i++) {
//            System.out.printf("%c ", name.charAt(i));
//        }
//        System.out.println();
//        System.out.println(name.toUpperCase());
//        System.out.println(name.toLowerCase());
//        String str1 = name.substring(0,1); //l
//        String str2 = name.substring(1); //ukasz
//        String together = str1.toLowerCase().concat(str2);
//        System.out.println(together);
//
//        for (int i = 0; i <= name.length() ; i++) {
//            String name1part = name.substring(0,i);
//            String name2part = name.substring(i);
//            String rezults = name1part.toUpperCase().concat(name2part);
//            System.out.println(rezults);
//
//        }
//
//        for (int i = 0; i <= name.length() ; i++) {
//
//            if (i % 2 ==0){
//                System.out.printf("%c",Character.toUpperCase(name.charAt(i)));
//            }
//            else
//                System.out.printf("%c",Character.toLowerCase(name.charAt(i)));
//        }

        String numbers = "";
        for (int i = 0; i <9 ; i++) {
            numbers += String.valueOf(i);

        }
        System.out.println(numbers);

    }
}
