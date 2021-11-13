package com.bridgelabz.Emp_WageBuilder;

public class CompanyEmpWage {

	private final String company;
	private final int empRatePerHour;
	private final int numOfWorkingDays;
	private final int maxHoursPerMonth;
	private int totalEmpWage;

	public CompanyEmpWage(String company, int empRatePerHour, int numOfWorkingDays, int maxHoursPerMonth) {
		this.company = company;
		this.empRatePerHour = empRatePerHour;
		this.numOfWorkingDays = numOfWorkingDays;
		this.maxHoursPerMonth = maxHoursPerMonth;
	}

	public String getCompany() {
		return company;
	}

	public int getTotalEmpWage() {
		return totalEmpWage;
	}

	public void setTotalEmpWage(int totalEmpWage) {
		this.totalEmpWage = totalEmpWage;
	}

	public int getEmpRatePerHour() {
		return empRatePerHour;
	}

	public int getNumOfWorkingDays() {
		return numOfWorkingDays;
	}

	public int getMaxHoursPerMonth() {
		return maxHoursPerMonth;
	}

	@Override
	public String toString() {
		return "CompanyEmployeeWage [company=" + company + ", empRatePerHour=" + empRatePerHour + ", numOfWorkingDays="
				+ numOfWorkingDays + ", maxHoursPerMonth=" + maxHoursPerMonth + ", totalEmpWage=" + totalEmpWage + "]";
	}
}
