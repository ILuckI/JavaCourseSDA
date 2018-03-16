package EnumDemo;

public enum Operation {
    PLUS() {
        public int calculate(int a, int b) {
            return a + b;
        }
    },
    MINUS() {
        public int calculate(int a, int b) {
            return a - b;
        }
    },
    MULT() {
        public int calculate(int a, int b) {
            return a * b;
        }
    },
    DIV() {
        public int calculate(int a, int b) {
            return a / b;
        }
    },
    MOD() {
        public int calculate(int a, int b) {
            return a % b;
        }
    };
    public abstract int calculate (int a, int b);
}