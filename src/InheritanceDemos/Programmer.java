package InheritanceDemos;

public class Programmer extends Employee {

    int bonus = 5000;

    void getProgrammerDetails()
    {
        System.out.println("getProgrammerDetails");
    }

    public static void main(String[] args) {

        Programmer ob = new Programmer();
        System.out.println(ob.bonus);
        System.out.println(ob.salary);
        ob.getProgrammerDetails();
        ob.getEmployeeInfo();
    }
}
