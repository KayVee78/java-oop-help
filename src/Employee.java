public class Employee {
    String name;
    int age;
    double salary;
    String location;

    Employee(String name, int age, double salary, String location) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.location = location;
    }

    /**If we need to make the raising amount dynamic**/
//    void raiseSalary(double raise, double salary) {
//        this.salary += raise;
//    }

    /**If the raising amount is constant**/
    void raiseSalary() {
        this.salary = this.salary * 1.2;
    }

    void announceSalary() {
        System.out.println("Salary of " + name + " is " + salary);
    }
}