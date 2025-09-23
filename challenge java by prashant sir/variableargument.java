import java .util .Arrays;
public class variableargument {

    public static void main(String[] args) {
        fun(2, 3, 4, 4, 5, 5, 5);
        
        
    }

   
    
    static void fun(int  ...v){
        System.out.println(Arrays.toString(v));
    }
}
