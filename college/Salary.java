public class Salary {
    // Salary with basic pay only
    static double calculateSalary(double basic) {
        return basic;
    }

    // Salary with basic pay + bonus
    static double calculateSalary(double basic, double bonus) {
        return basic + bonus;
    }

    // Salary with basic pay + bonus - tax
    static double calculateSalary(double basic, double bonus, double tax) {
        return basic + bonus - tax;
    }

    public static void main(String[] args) {

        double s1 = calculateSalary(20000);
        double s2 = calculateSalary(20000, 3000);
        double s3 = calculateSalary(20000, 3000, 2000);

        System.out.println("Salary with Basic Pay = " + s1);
        System.out.println("Salary with Basic + Bonus = " + s2);
        System.out.println("Salary with Basic + Bonus - Tax = " + s3);
    }
}
