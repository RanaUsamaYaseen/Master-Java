class Employee {
    private double salary;
    private int hoursOfWork;

    public void getInfo(double salary, int hoursOfWork) {
        this.salary = salary;
        this.hoursOfWork = hoursOfWork;
    }

    public void addSal() {
        if (salary < 500) {
            salary += 10;
        }
    }

    public void addWork() {
        if (hoursOfWork > 6) {
            salary += 5;
        }
    }

    public void displaySalary() {
        System.out.println("Final Salary: $" + salary);
    }
}

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.getInfo(450, 8);
        employee.addSal();
        employee.addWork();
        employee.displaySalary();
    }
}
