public class challenge24 {
    public static void main(String[] args) {
        int number = 5;       // Binary: 0101
        int shiftBy = 2;

        int result = number << shiftBy;

        System.out.println(number + " << " + shiftBy + " = " + result);
        System.out.println("Binary: " + Integer.toBinaryString(number) + " << " + shiftBy + " = " + Integer.toBinaryString(result));
    }
}
