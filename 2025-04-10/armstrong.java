public class armstrong {
    public static void main(String[] args) {
        int n = 200;
        for (int i = 0; i < n; i++) {
            int num = i;
            int sum = 0;
            int n2 = num;
            int len = ("" + num).length();
            while (n2 != 0) {
                int digit = n2 % 10;
                sum = sum + (int) Math.pow(digit, len);
                n2 = n2 / 10;
            }
            if (sum == num) {
                System.out.println(num + " is an armstrong number");
            } else {
                System.out.println(num + " is not an armstrong number");
            }

        }

    }
}
