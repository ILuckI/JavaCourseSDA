public class Number {

    private int[] _numbers = new int[10];
    private int _num;

    public Number(String numbers) {
        int num = Integer.parseInt(numbers);
        char number[] = numbers.toCharArray();
    }

    public int addition(int x) {
        _num += x;
        return _num;
    }


    public String toString() {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < _numbers.length; i++) {
            sb.append(_numbers[i]);
        }

        return sb.toString();
    }
}
