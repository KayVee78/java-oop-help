public class Salesperson extends Employee {
    private double commissionPercentage;

    public Salesperson(String name, double salary, int age, double commissionPercentage) {
        super(name, salary, age); //accessing the employee's (superclass's) constructor using keyword super to get the common attributes
        this.commissionPercentage = commissionPercentage;
    }

    public double getCommissionPercentage() {
        return commissionPercentage;
    }

    public void raiseCommission() {
        if (this.commissionPercentage < .30) {
            this.commissionPercentage = this.commissionPercentage * 1.2;
        }
    }
}