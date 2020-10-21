package com.lts.setter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Employee {


		// TODO Auto-generated method stub
		int empId;
		String empName;
		String empDept;
		@Autowired
		Address address;
		
		public Address getAddress() {
			return address;
		}
		public void setAddress(Address address) {
			this.address = address;
		}
		public int getEmpId() {
			return empId;
		}
		@Value("${employee.empId}")
		public void setEmpId(int empId) {
			this.empId = empId;
		}
		public String getEmpName() {
			return empName;
		}
		@Value("${employee.empName}")
		public void setEmpName(String empName) {
			this.empName = empName;
		}
		public String getEmpDept() {
			return empDept;
		}
		@Value("${employee.empDept}")
		public void setEmpDept(String empDept) {
			this.empDept = empDept;
		}
		@Override
		public String toString() {
			return "Employee [empId=" + empId + ", empName=" + empName + ", empDept=" + empDept + ", address=" + address
					+ "]";
		}
		
	

}
