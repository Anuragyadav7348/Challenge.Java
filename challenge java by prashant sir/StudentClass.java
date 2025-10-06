public class StudentClass {
    

    public static  class Student{
        String name;
        int rno;
        double percent;

    }
    public static void main(String[] args) {
        Student x = new Student();
        x.name = "Raghav";
        x.rno = 76;
        x.percent = 92.5;
        System.err.println(x.name);

        Student s = new Student();
        s.name = "Anurag";
        s.rno = 34;
        s.percent = 3;
        System.err.println(s.percent);

        
    }
    
}
    

