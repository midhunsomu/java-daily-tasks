public class pattern {
    public static void main(String[] args) {
        int n=10;
        int a=1;
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < i-1; j++){
                System.out.print(a);
                a+=1;
            }
            System.out.println("\n");
        }
    }
}