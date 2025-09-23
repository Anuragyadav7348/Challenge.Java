public class Shadowing {
        static int x= 90;// this will be shadowed at line 8
        public static void main(String[] args) {
            System.err.println(x);
            int x= 40;
            System.err.println(x);
            fun();
        }
        static void fun(){
            System.err.println(x);

        }

    
}
//shadowing 