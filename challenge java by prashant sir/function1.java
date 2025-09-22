import java.util.Arrays;
// in this we change value using in given array/


public class function1 {
    public static void main(String[] args) {
        int[] arr = {1, 23, 4, 5, 34};
        change(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void change(int[] nums) {
        nums[0] = 99;
    }
}
