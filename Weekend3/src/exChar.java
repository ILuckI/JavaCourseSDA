public class exChar {
    public static void main(String[] args) {
        char info[] = {'i', 'n', 'f', 'o', 'r', 'm', 'a', 't', 'y', 'k', 'a'};

        for (int i = 0; i < info.length; i++) {
            System.out.println(info[i]);

        }
        System.out.printf("\n");
        for (int i = 0; i < info.length; i++) {
            System.out.printf("%c ", info[i]);

        }
        System.out.println("");
        for (int i = 0; i < info.length; i++) {
            System.out.printf("%c", Character.toUpperCase(info[i]));

        }
        System.out.printf("\n");
        for (int i = 0; i < info.length; i++) {
            System.out.printf("\n");
            if (i % 2 == 0) {
                System.out.printf("%c", Character.toUpperCase(info[i]));
            } else
                System.out.printf("%c",Character.toLowerCase(info[i]));
        }
        System.out.printf("\n\n");
        for (int i = info.length - 1; i >= 0; i--) {
            System.out.println(info[i]);

        }

    }

}
