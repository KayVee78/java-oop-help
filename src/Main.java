public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee("John", 25, 100000, "Colombo");
        Employee employee2 = new Employee("Ann", 24, 120000, "Kandy");

        /**If we need to make the raising amount dynamic**/
//        employee1.raiseSalary(11000, employee1.salary);

        /**If the raising amount is constant**/
        employee2.raiseSalary();

        employee1.announceSalary();
        employee2.announceSalary();
    }
}