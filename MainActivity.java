public class MainActivity {
    public static void main(String[] args) {
        FullTimeEmployee F1 = new FullTimeEmployee(123, "Peter", 20000);
        F1.showFullTimeEmployeeInfo();
        F1.yearlySalary();

        PartTimeEmployee P1 = new PartTimeEmployee(456,"John",50,40);
      //  P1.setEmployeeId(456);
       // P1.setEmployeeName("John");
       // P1.setPaymentPerHour(50);
        P1.showPartTimeEmployeeInfo();
       // P1.setDailyIncome(40);

        Employee E1 = new Employee(124, "Eraf"); 
        E1.showEmployeeInfo();
    }
}
