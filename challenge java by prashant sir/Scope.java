public class Scope {
    public static void main(String[] args) {
        int a = 10;
        int b= 20;
        String name ="Anurag";

        {
            a = 100;
            System.err.println(a);
            name =  "shiva";
            System.err.println(name);
            
            
        }
    {
        System.err.println(a);
        System.err.println(name);
    }

    }
    // static void random(int marks) {
    //     int num = 67;
    //     System.err.println(67);
    //     System.err.println(num);
    //     System.err.println(marks);
    }
    
    

