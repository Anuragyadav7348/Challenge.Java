public class TwoimensionalArray {
    
    public static void main(String[] args) {
        int[] [] myArr = new int[2][3];
        myArr[0][0] = 9;
        
        int[] [] arr = {{1,2,3}, {4,5,6},{7,8,9,}};
        System.err.println("{{1,2,3,},{4,5,6},{7,8,9}}");
        System.err.println(arr[0].length);
        //Traversal
        int i = 0;
        while (i < arr.length){
            int j = 0;
            while (j < arr[i].length){
                System.err.println(arr[i][j] +"");
                j++;
            }
        }
        System.err.println();
        i++;
        
    }
}
