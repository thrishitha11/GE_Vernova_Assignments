import java.util.Random;

public class Employee {
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program on Master Branch");

        Employee company1 = new Employee();
        company1.computeWage("Company1", 20, 100, 20);

        Employee company2 = new Employee();
        company2.computeWage("Company2", 25, 120, 22);
    }

    public void computeWage(String company, int wagePerHour, int maxHours, int maxDays) {
        int totalWage = 0, totalHours = 0, totalDays = 0;
        Random rand = new Random();

        while (totalHours < maxHours && totalDays < maxDays) {
            totalDays++;
            int attCheck = rand.nextInt(3);

            switch (attCheck) {
                case 0:
                    break;
                case 1:
                    totalWage += 8 * wagePerHour;
                    totalHours += 8;
                    break;
                case 2:
                    totalWage += 4 * wagePerHour;
                    totalHours += 4;
                    break;
            }

            System.out.println("Day " + totalDays + " of " + company + ": Total Wage: " + totalWage + ", Total Hours: " + totalHours);
        }

        System.out.println("Total Wage for " + company + ": " + totalWage);
    }
}
