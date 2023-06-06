import java.time.LocalDate;
import java.time.Period;

final class Manager extends Employee {
    private double bonus;

    public Manager(String firstName, String lastName, int birthdayYear, int hireYear, String companyName, double salary, double bonus) {
        super(firstName, lastName, birthdayYear, hireYear, companyName, salary);
        this.bonus = bonus;
    }

    @Override
    public double getSalary() {
        return super.getSalary() + bonus;
    }

    @Override
    public String toString() {
        return "Manager with lastName " + lastName + " and age " + getAge() + " has salary " + getSalary();
    }
}