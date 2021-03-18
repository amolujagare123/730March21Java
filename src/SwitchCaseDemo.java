public class SwitchCaseDemo {
    public static void main(String[] args) {
        int a = 10;
        int b = 2;
        int c = 0;

        String operation = "ffdf";

        switch (operation)
        {
            case "add" : c=a+b;
                System.out.println("Addition="+c);
                break;

            case "substract": c = a - b;
                System.out.println("Substraction="+c);
                break;

            case "multiplication" : c = a * b;
                System.out.println("Multiplication="+c);
                break;

            case "division" : c = a / b;
                System.out.println("Division="+c);
                break;

            default:
                System.out.println("wrong choice");
                break;
        }



    }
}
