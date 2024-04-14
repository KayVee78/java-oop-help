public class Analyst extends Employee {

    public Analyst(String name, double salary, int age) {
        super(name, salary, age); //accessing the employee's (superclass's) constructor using keyword super to get the common attributes
    }

    public double getAnnualBonus() {
        return super.salary * 0.05; //instead of using 'this' use 'super' to show that property comes from the superclass
    }
}