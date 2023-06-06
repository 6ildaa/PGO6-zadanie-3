import java.time.LocalDate;
import java.time.Period;

class Employee extends Person {
    protected LocalDate hireDate;
    protected String companyName;
    protected double salary;

    public Employee(String firstName, String lastName, int birthdayYear, int hireYear, String companyName, double salary) {
        super(firstName, lastName, birthdayYear);
        this.hireDate = LocalDate.of(hireYear, 1, 1);
        this.companyName = companyName;
        this.salary = salary;
    }

    public int getJobSeniority() {
        LocalDate currentDate = LocalDate.now();
        Period period = Period.between(hireDate, currentDate);
        return period.getYears();
    }

    public double getSalary() {
        return salary;
    }
}