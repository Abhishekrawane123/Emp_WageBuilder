package com.bridgelabz.Emp_WageBuilder;

public class EmpWageBuilder implements EmployeeService
 {
		public static final int IS_PART_TIME = 1;
		public static final int IS_FULL_TIME = 2;

		private int numOfCompany = 0;
		private CompanyEmpWage[] companyEmpWageArray;

		public EmpWageBuilder() {
			companyEmpWageArray = new CompanyEmpWage[5];
		}

		public void addCompanyEmpWage(String company, int empRatePerHour, int numOfWorkingDays, int maxHoursPerMonth) {
			companyEmpWageArray[numOfCompany] = new CompanyEmpWage(company, empRatePerHour, numOfWorkingDays,
					maxHoursPerMonth);
			numOfCompany++;
		}

		public void computeEmpWage() {
			for (int i = 0; i < numOfCompany; i++) {
				companyEmpWageArray[i].setTotalEmpWage(this.computeEmpWage(companyEmpWageArray[i]));
				System.out.println(companyEmpWageArray[i]);
			}
		}

		private int computeEmpWage(CompanyEmpWage companyEmpWage) {
			// variables
			int empHrs = 0, totalEmpHrs = 0, totalWorkingDays = 0;
			// Computation
			while (totalEmpHrs <= companyEmpWage.getMaxHoursPerMonth()
					&& totalWorkingDays < companyEmpWage.getNumOfWorkingDays()) {
				totalWorkingDays++;
				int empCheck = (int) Math.floor(Math.random() * 10) % 3;

				switch (empCheck) {
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
				System.out.println("Day#: " + totalWorkingDays + " Emp Hr: " + empHrs);
			}
			return totalEmpHrs * companyEmpWage.getEmpRatePerHour();
		}

		public static void main(String[] args) 
		{
			EmpWageBuilder employeeWage = new EmpWageBuilder();
			employeeWage.addCompanyEmpWage("DMart", 20, 2, 10);
			employeeWage.addCompanyEmpWage("jio", 10, 4, 20);
			employeeWage.computeEmpWage();
		}
	}

	




