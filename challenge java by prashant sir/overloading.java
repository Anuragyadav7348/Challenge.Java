public class overloading {

    public static void main(String[] args) {
        fun(67);
        fun("Anurag Yadav");
        
    }
    static void fun (int a ){
        System.err.println(a);
    }
    static void fun(String name){
        System.out.println(name);
    }
}
//in overloading we same  two or more function same name but difrent argument
