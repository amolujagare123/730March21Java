package InheritanceDemos;

public class InheritanceDemoSuper {
    String  str1 = "Sonali";
    int a=50;
    char ch ='s';

    public InheritanceDemoSuper(String str1, int a, char ch) {
        this.str1 = str1;
        this.a = a;
        this.ch = ch;
    }
}
class  Superdemo extends InheritanceDemoSuper
{
    String  str1;
    int a;

    public Superdemo(String str1, int a, char ch,String str2,int b) {
        super(str1, a, ch);
        str1 = str2;
        a=b;


    }
    void  display()
    {
        System.out.println(str1);
        System.out.println(a);
        System.out.println(super.str1);
        System.out.println(super.a);
        System.out.println(super.ch);
    }

    public static void main(String[] args) {

        Superdemo sd = new Superdemo("amol",10,'g',"amol2",10);
        sd.display();
    }
}
