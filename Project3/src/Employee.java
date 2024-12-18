public class Employee {
    String name;
    int id;
    boolean attendance = false;
    int workHours = 8;
    int wagePerHour = 20;
    double dailyWage = 0;

    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public void markAttendance(boolean isPresent) {
        if (isPresent) {
            attendance = true;
            System.out.println("Employee is present");
        } else {
            attendance = false;
            System.out.println("Employee is absent");
        }
    }

    public void calculateWage() {
        if (attendance) {
            dailyWage = workHours * wagePerHour;
            System.out.println("Daily Wage: " + dailyWage);
        } else {
            dailyWage = 0;
            System.out.println("Daily Wage: " + dailyWage);
        }
    }
}