public class TrailingZeroes {
    public static void main(String[] args) {
        int input = 100;
        int count = 0;
        while (input > 0) {
            count = count + (input / 5);
            input = input / 5;
        }
        System.out.println("zeroes: " + count);
    }
}

