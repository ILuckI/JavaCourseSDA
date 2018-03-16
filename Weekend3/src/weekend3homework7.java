//        Zadanie 7.
//        Napisz	program,	który	wypisze	na	konsoli	amerykańską	flagę,	na	wzór	tej,	znajdującej	się
//        poniżej:
//        * * * * * * ==================================
//         * * * * *  ==================================
//        * * * * * * ==================================
//         * * * * *  ==================================
//        * * * * * * ==================================
//         * * * * *  ==================================
//        * * * * * * ==================================
//         * * * * *  ==================================
//        * * * * * * ==================================
//        ==============================================
//        ==============================================
//        ==============================================
//        ==============================================
//        ==============================================
//        ==============================================
//        W	 swoim	 programie	musisz skorzystać	 z	 pętli,	a	 także	instrukcji	warunkowych.	Nie	możesz
//        „wypisać”	flagi	całymi	wierszami.

public class weekend3homework7 {
    public static void main(String[] args) {

        for (int i = 0; i < 15; i++) {
            System.out.println();
            for (int j = 0; j < 23; j++) {
                if (i < 9 && j < 6) {
                    if (i % 2 == 0)
                        System.out.print("* ");
                    else
                        System.out.print(" *");
                    System.out.print(" ");
                } else
                    for (int k = 0; k < 3 ; k++) {
                        System.out.print("=");
                    }
            }

        }
    }
}






