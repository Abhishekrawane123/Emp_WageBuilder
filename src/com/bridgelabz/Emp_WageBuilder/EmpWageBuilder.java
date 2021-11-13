package com.bridgelabz.Emp_WageBuilder;

public class EmpWageBuilder 
{
	private final String companyName;
	private final int wagePerHr;
	private final int maxWorkingDays;
	private final int maxWorkingHrs;
	private int totalWage;
    	
	
    
	 public EmpWageBuilder(String companyName, int wagePerHr, int maxWorkingDays, int maxWorkingHrs) 
	 {
		super();
		this.companyName = companyName;
		this.wagePerHr = wagePerHr;
		this.maxWorkingDays = maxWorkingDays;
		this.maxWorkingHrs = maxWorkingHrs;
	}
	 
	@Override
	public String toString() {
		return "EmpWageBuilder [companyName=" + companyName + ", wagePerHr=" + wagePerHr + ", maxWorkingDays="
				+ maxWorkingDays + ", maxWorkingHrs=" + maxWorkingHrs + ", totalWage=" + totalWage + "]";
	}

	public void calculateTotalWage()
	    {
		 
	        final int PART_TIME = 1;
	        final int FULL_TIME = 2;
	         int workingHrs = 0;

	        System.out.println("Details of " + companyName + " employee");
	        System.out.println("-----------------------------------------------------");
	        System.err.println("Wage per hour:" + wagePerHr);
	        System.out.println("Maximum working days:" + maxWorkingDays);
	        System.out.println("Maximum working hours:" + maxWorkingHrs);
	        System.out.printf("%5s     %5s     %5s     %5s\n", "Day", "Workinghrs", "Wage", "Total working hrs");

	        for (int day = 1, totalWorkingHrs = 0; day <= maxWorkingDays
	                && totalWorkingHrs <= maxWorkingHrs; day++, totalWorkingHrs += workingHrs)
	        {
	            int empType = (int) (Math.random() * 100) % 3;
	            switch (empType)
	            {
	                case FULL_TIME:
	                    workingHrs = 8;
	                    break;
	                case PART_TIME:
	                    workingHrs = 4;
	                    break;
	                default:
	                    workingHrs = 0;
	                    break;
	            }
	            int wage = workingHrs * wagePerHr;
	            totalWage += wage;
	            System.out.printf("%5d       %5d      %5d      %5d\n", day, workingHrs, wage, totalWorkingHrs + workingHrs);
	        }
	        System.out.println("Total wage for a month of " + companyName + " employee is " + totalWage + "\n");
	    }
	    public static void main(String args[])
	    {
	    	EmpWageBuilder jio = new EmpWageBuilder("jio" , 40 , 15 , 8 );
	    	EmpWageBuilder dmart = new EmpWageBuilder("dmart" , 70 , 25 , 8 );
	    	jio.calculateTotalWage();
	        dmart.calculateTotalWage();
	        
	        System.out.println(jio);
	        System.out.println(dmart);

	        
	    }
	    

}



