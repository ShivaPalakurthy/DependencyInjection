package com.dependencyInjection;

public class Employee {
		private int employeeid;
		private String employeeName;
		private String employeeAddress;
		@Override
		public String toString() {
			return "Employee [employeeid=" + employeeid + ", employeeName=" + employeeName + ", employeeAddress="
					+ employeeAddress + "]";
		}
		public Employee(int employeeid, String employeeName, String employeeAddress) {
			super();
			this.employeeid = employeeid;
			this.employeeName = employeeName;
			this.employeeAddress = employeeAddress;
		}
		public Employee() {
			super();
			// TODO Auto-generated constructor stub
		}
		public int getEmployeeid() {
			return employeeid;
		}
		public void setEmployeeid(int employeeid) {
			this.employeeid = employeeid;
		}
		public String getEmployeeName() {
			return employeeName;
		}
		public void setEmployeeName(String employeeName) {
			this.employeeName = employeeName;
		}
		public String getEmployeeAddress() {
			return employeeAddress;
		}
		public void setEmployeeAddress(String employeeAddress) {
			this.employeeAddress = employeeAddress;
		}
		
		public void show() {
			System.out.println("Employee id is "+employeeid +"\nEmployee name is "+employeeName+"\nEmployee Address is "+employeeAddress);
		}
}
