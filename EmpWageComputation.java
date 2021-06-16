public class EmpWageComputation
{
        //Constants
        public static final int IS_PART_TIME = 1;
        public static final int IS_FULL_TIME = 2;

        private final String company;
        private final int empRatePerHour;
        private final int numOfWorkingDays;
        private final int maxHoursPerMonth;
        private int totalEmpWage;

        public EmpWageComputation(String company, int empRatePerHour, int numOfWorkingDays, int maxHoursPerMonth) {

        	this.company = company;
        	this.empRatePerHour = empRatePerHour;
        	this.numOfWorkingDays = numOfWorkingDays;
        	this.maxHoursPerMonth = maxHoursPerMonth;
        }
        // Method for calculate EmployeeWage
        public void computeEmpWage()
        {
                // Variables
                int empHrs = 0, totalEmpHrs = 0, totalWorkingDays = 0;
                // Computation
                while(totalEmpHrs <= maxHoursPerMonth && totalWorkingDays < numOfWorkingDays)
                {
                        totalWorkingDays++;
                        int empCheck = (int) Math.floor(Math.random() * 10) % 3;
                        switch (empCheck)
                        {
                                case IS_PART_TIME:
                                        empHrs = 4;
                                        break;
                                case IS_FULL_TIME:
                                        empHrs = 8;
                                        break;
                                default:
                                        empHrs = 0;
                        }
                        totalEmpHrs += empHrs;
                        System.out.println("Day#:" +totalWorkingDays +" Emp Hour :" + empHrs);
                }
                totalEmpWage = totalEmpHrs * empRatePerHour;
        }

        @Override
        public String toString() {
        return "Total Employee Wage for compuny:" +company+ "is : "+ totalEmpWage;
        }

        // Main method here
        public static void main(String args[])
        {
              EmpWageComputation dMart = new  EmpWageComputation("DMart", 20, 2, 10);
              EmpWageComputation reliance = new EmpWageComputation("Reliance", 10, 4, 20);
              dMart.computeEmpWage();
              System.out.println(dMart);
              reliance.computeEmpWage();
              System.out.println(reliance);
        }
}
