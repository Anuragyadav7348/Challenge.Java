// import java.util.Arrays;

// public class passinginFunctions {
//     public static void main(String[] args) {
//         int[] nums = {3, 4, 24, 5};
//         System.out.println(Arrays.toString(nums));
//         change(nums);
//         System.out.println(Arrays.toString(nums));

//     }
// static void change (int[] arr) {
//     arr[0] = 99;
// }
// }
import java.util.Arrays;

public class passinginFunctions {
    public static void main(String[] args) {
        int[] nums = {3, 4, 24, 5};
        System.out.println(Arrays.toString(nums)); // before change
        change(nums);
        System.out.println(Arrays.toString(nums)); // after change
    }

    static void change(int[] arr) {
        arr[0] = 99;  // modifies original array
    }
}

