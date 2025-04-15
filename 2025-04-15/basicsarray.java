public class basicsarray {
    public basicsarray() {
    }
 
    public static void main(String[] var0) {
       int[] var1 = new int[]{1, 2, 3, 6, 5};
       boolean var2 = true;
 
       for(int var3 = 0; var3 < var1.length - 1; ++var3) {
          if (var1[var3] < var1[var3 + 1]) {
             var2 = true;
          } else {
             var2 = false;
          }
       }
 
       if (var2) {
          System.out.println("Increasing order");
       } else {
          System.out.println("not Increasing order");
       }
 
    }
 }
