public class Shadowing {
        static int x= 90;
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
