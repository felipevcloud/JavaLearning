public class SalaryCalculator {
    public double salaryMultiplier(int daysSkipped) {
        boolean multiplier = daysSkipped < 5;
        return multiplier ? 1.0 : 0.85;
    }

    public int bonusMultiplier(int productsSold) {
        boolean multiplier = productsSold < 20;
        return multiplier ? 10 : 13;
    }

    public double bonusForProductsSold(int productsSold) {
        return bonusMultiplier(productsSold) * productsSold;
    }

    public double finalSalary(int daysSkipped, int productsSold) {
        double salary = (1000.00 * salaryMultiplier(daysSkipped)) + bonusForProductsSold(productsSold);
        boolean result = salary < 2000.00;
        return result ? salary : 2000.00;
    } 
}
