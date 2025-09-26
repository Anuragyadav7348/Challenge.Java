// import java .util.Arrays;
// public class multidimension {
//     public static void main(String[] args) {
//         int[][] arr = new int[4][];
//         int[][] arr2D = {
//             {1, 2, 3 },
//             {4, 5 },
        
//             {6, 7, 8, 9},

//         };
//          System.out.println(Arrays.deepToString(arr2D));
//     }



// }
// import java.util.Arrays;

// public class multidimension {
//     public static void main(String[] args) {
//         int[][] arr = new int[4][];
//         int[][] arr2D = {
//             {1, 2, 3},
//             {4, 5},
//             {6, 7, 8, 9},
//         };

//         // Print the 2D array
//         System.out.println(Arrays.deepToString(arr2D));
//     }
// }
public class multidimension {
    public static void main(String[] args) {
        int[][] arr2D = {
            {1, 2, 3},
            {4, 5},
            {6, 7, 8, 9}, 
        };

        // Print using nested loops
        for (int i = 0; i < arr2D.length; i++) {
            for (int j = 0; j < arr2D[i].length; j++) {
                System.out.print(arr2D[i][j] + " ");
            }
            System.out.println(); // move to next line after each row
        }
    }
}

