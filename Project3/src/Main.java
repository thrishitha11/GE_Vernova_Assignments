import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program");

        Employee emp = new Employee("Ram", 123);
        Random random = new Random();
        int attendanceType = random.nextInt(3);

        switch (attendanceType) {
            case 1 -> emp.markAttendance(true);
            case 2 -> {
                emp.markAttendance(true);
                System.out.println("Part-time work today");
                emp.workHours = 4;
            }
            default -> emp.markAttendance(false);
        }

        emp.calculateWage();
    }
}
