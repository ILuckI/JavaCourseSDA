import java.util.Random;
public class weekend2Homework1 {
    public static void main(String[] args) {
        Random rnd = new Random();
        int urn[] = new int[10];
        for (int i = 0; i < 20; i++) {
            int balls = rnd.nextInt(10);
            switch (balls) {
                case 0:
                    urn[0] = urn[0] + 1;
                    break;
                case 1:
                    urn[1] = urn[1] + 1;
                    break;
                case 2:
                    urn[2] = urn[2] + 1;
                    break;
                case 3:
                    urn[3] = urn[3] + 1;
                    break;
                case 4:
                    urn[4] = urn[4] + 1;
                    break;
                case 5:
                    urn[5] = urn[5] + 1;
                    break;
                case 6:
                    urn[6] = urn[6] + 1;
                    break;
                case 7:
                    urn[7] = urn[7] + 1;
                    break;
                case 8:
                    urn[8] = urn[8] + 1;
                    break;
                case 9:
                    urn[9] = urn[9] + 1;
                    break;
                default:
                    break;
            }
        }
        int count = 0;
        for (int i = 0; i <urn.length ; i++) {
            count++;
            double procent = urn[i] * 100 / 20;
            System.out.printf("Ilosc kul w %d URNIE : %d\t\t\tDaje nam to %.2f procent wszystkich kul\n",count,urn[i],procent);
        }
    }
}

