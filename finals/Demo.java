public class Demo {

    public static void main(String[] args) {
        int[] array1D = {1,2,3,4};
        System.out.println("\nAn original 1D array:");
        for (int i = 0; i < array1D.length; i++)
            System.out.print(array1D[i] + "\t");

        ArrayUtility.rotateLeft(array1D);

        System.out.println("\nRotated to the left:");
        for (int i = 0; i < array1D.length; i ++)
            System.out.print(array1D[i] + "\t");

        
        int[][] array2D = {
            {1,2,3},
            {4,5,6,7,8},
            {9,10,11,12}
        };

        System.out.println("\nAn original jagged 2D array:");
        for (int i = 0; i < array2D.length; i++) {
            for (int j = 0; j < array2D[i].length; j++)
                System.out.print(array2D[i][j] + "\t");
            
            System.out.println();
        }

        ArrayUtility.rotateLeft(array2D);

        System.out.println("\nRotated to the left:");
        for (int i = 0; i < array2D.length; i++) {
            for (int j = 0; j < array2D[i].length; j++)
                System.out.print(array2D[i][j] + "\t");
            
            System.out.println();
        }  
    }
}
