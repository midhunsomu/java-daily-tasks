public class perfectno {
    public static void main(String[] args) {
        int n = 10;
        for (int i = 1; i < n; i++) {
            int s = 0;
            for (int j = 1; j < i; j++) {
                if (i % j == 0) {
                    s = s + j;
                }
            }
            if (s == i)
                System.out.println(i + " is perfect number");
            else
                System.out.println(i + " is not perfect number");
        }
    }
}
