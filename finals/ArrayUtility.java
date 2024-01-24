public class ArrayUtility {
    public static void rotateLeft(int[] a) {
        int firstElement = a[0];

        for (int i = 0; i < a.length - 1; i++) {
            a[i] = a[i+1];
        }
        a[a.length-1] = firstElement;
    }
    
    public static void rotateLeft(int[][] a) {
        for (int i = 0; i < a.length; i++) {
            int firstElement = a[i][0];

            for (int j = 0; j < a[i].length - 1; j++) {
                a[i][j] = a[i][j+1];
            }
            
            a[i][a[i].length-1] = firstElement;
        }
    }
}
