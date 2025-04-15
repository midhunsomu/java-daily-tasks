public class duplicatedno {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 1, 2, 4};
        boolean[] visited = new boolean[arr1.length]; 

        System.out.println("Duplicate elements:");
        for (int i = 0; i < arr1.length; i++) {
            if (visited[i]) {
                continue;
            }

            for (int j = i + 1; j < arr1.length; j++) {
                if (arr1[i] == arr1[j]) {
                    System.out.println(arr1[i]);
                    visited[j] = true; 
                    break;
                }
            }
        }
    }
}

