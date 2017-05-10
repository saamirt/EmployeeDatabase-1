
public class PartTimeEmployee extends EmployeeInfo {

    private double hourlyWage;
    private double hoursPerWeek;
    private double weeksPerYear;

    public PartTimeEmployee(int eN, String fN, String lN, String wL, double dR, double hW, double hPW, double wPY) {
        super(eN, fN, lN, wL, dR);
        hourlyWage = hW;
        hoursPerWeek = hPW;
        weeksPerYear = wPY;
    }

    public double getNetSalary(double dR) {
        return getAnnualSalary(hourlyWage, hoursPerWeek, weeksPerYear) * (1 - (dR / 100));
    }

    public double getAnnualSalary(double hW, double hPW, double wPY) {
        return hW * hPW * wPY;
    }

    public double getHourlyWage() {
        return hourlyWage;
    }

    public void setHourlyWage(double hourlyWage) {
        this.hourlyWage = hourlyWage;
    }

    public double getHoursPerWeek() {
        return hoursPerWeek;
    }

    public void setHoursPerWeek(double hoursPerWeek) {
        this.hoursPerWeek = hoursPerWeek;
    }

    public double getWeeksPerYear() {
        return weeksPerYear;
    }

    public void setWeeksPerYear(double weeksPerYear) {
        this.weeksPerYear = weeksPerYear;
    }

}
