public class basicsswitch {
        public basicsswitch() {
        }
     
        public static void main(String[] var0) {
           byte var1 = 24;
           inc(var1);
           System.out.println("age 2 " + var1);
           String[] var2 = new String[]{"AI/DS", "IOT", "AI/ML"};
           changeDept(var2);
           System.out.println("first index in main " + var2[0]);
        }
     
        private static void changeDept(String[] var0) {
           var0[0] = "AI-DS";
           System.out.println("first index inside method " + var0[0]);
        }
     
        public static void inc(int var0) {
           ++var0;
           System.out.println("age 1 " + var0);
        }
}
