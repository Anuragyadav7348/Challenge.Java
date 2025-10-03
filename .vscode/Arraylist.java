import java.util.ArrayList;
public class Arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(10);
        
        list.add(76);
        list.add(78);

        list.add(68);

        list.add(96);

        list.add(46);
        
System.err.println(list);
System.err.println(list.contains(46));// that contain element

    }



    
}
