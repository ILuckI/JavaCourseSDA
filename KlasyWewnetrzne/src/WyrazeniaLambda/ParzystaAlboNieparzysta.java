package WyrazeniaLambda;

public class ParzystaAlboNieparzysta {
    int x = 3;

    public boolean trueIf() {
        return x % 2 != 0;
    }

    public boolean falseIf() {
        return x % 2 == 0;
    }

}
