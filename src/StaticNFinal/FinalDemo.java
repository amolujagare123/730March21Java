package StaticNFinal;

public class FinalDemo {

    final int speed = 100;

    void change()
    {
       // speed = 150;
    }

    public static void main(String[] args) {

        FinalDemo ob = new FinalDemo();

        ob.change();
        System.out.println(ob.speed); // 100
    }
}
