package StaticNFinal;

public class StudentDemo {

    int rno;
    String name ;
    static String college;

    void display()
    {
        System.out.println("rno="+rno);
        System.out.println("name="+name);
        System.out.println("college="+college);
    }

    public static void main(String[] args) {

        StudentDemo s1 = new StudentDemo();
        StudentDemo s2 = new StudentDemo();
        StudentDemo s3 = new StudentDemo();

        s1.rno = 1;
        s1.name ="amol";
        s1.college = "ITC";

        s2.rno = 2;
        s2.name ="Sonali";
       s2.college = "XYZ"; // null

        s3.rno = 3;
        s3.name ="Sunny";
        s3.college = "abc"; // null

        StudentDemo.college = "PICT" ;



        s1.display();
        s2.display();
        s3.display();

    }
}
