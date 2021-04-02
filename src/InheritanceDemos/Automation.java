package InheritanceDemos;

public class Automation {

    int testcaseId =101;

}

class Selenium extends Automation
{
    int testcaseId = 202;

    void printTestCaseId()
    {
        System.out.println(testcaseId); // 202
        System.out.println(super.testcaseId); // 101
    }

    public static void main(String[] args) {

        Selenium ob = new Selenium();

        ob.printTestCaseId();



    }

}
