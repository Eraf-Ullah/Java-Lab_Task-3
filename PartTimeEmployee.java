public class PartTimeEmployee extends Employee {
    private double paymentPerHour;
	private double dailyIncome;
	  

    public PartTimeEmployee() {
        // Default constructor
    }

    public PartTimeEmployee(int id, String name, double paymentPerHour,double dailyIncome) {
        super(id, name);  
        this.paymentPerHour = paymentPerHour;
		this.dailyIncome = dailyIncome;
    }

    public void setPaymentPerHour(double paymentPerHour) {
        this.paymentPerHour = paymentPerHour;
    }

    public double getPaymentPerHour() {
        return paymentPerHour;
    }
	
	  public void setDailyIncome(double dailyIncome ) {
        this.dailyIncome = dailyIncome;
    }
	
	  public double getDailyIncome() {
        return dailyIncome;
    }

    public void showPartTimeEmployeeInfo() {
        System.out.println("Employee Id : " + getEmployeeId());
        System.out.println("Employee Name: " + getEmployeeName());
        System.out.println("Employee Payement Per Hour: " + paymentPerHour);
		System.out.println("Employee Daily Income: " + getDailyIncome());
    }

    //public double dailyIncome(int hour) {
    //    return paymentPerHour * hour;
    //}
}
