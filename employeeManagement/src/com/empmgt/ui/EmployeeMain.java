package com.empmgt.ui;

import com.empmgt.entities.*;

public class EmployeeMain {
	public static void main(String args[]) {
		EmployeeMain employeeMain = new EmployeeMain();
		employeeMain.run();
	}

	public void run() {
		Employee store[] = new Employee[4];
		Department department1 = new Department("D1", "Developer");
		Department department2 = new Department("T1", "Tester");
		Developer developer1 = new Developer(1, "Shayak", department1, "C ");
		Developer developer2 = new Developer(2, "Arpit", department1, "Java");
		Tester tester1 = new Tester(3, "Mayur", department2, "Selenium");
		Tester tester2 = new Tester(4, "Naman", department2, "Ranorex");
		store[0] = developer1;
		store[1] = developer2;
		store[2] = tester1;
		store[3] = tester2;
		for (int i = 0; i < store.length; i++) {
			if (store[i] instanceof Developer) {
				Developer developer = (Developer) store[i];
				display(developer);
			}
			if (store[i] instanceof Tester) {
				Tester tester = (Tester) store[i];
				display(tester);
			}
		}
	}

	public void displayCommon(Employee employee) {
		Department department = employee.getDepartment();
		System.out.println("Employee " + employee.getId() + ": " + employee.getName());
		System.out.println("Department: " + department.getDeptName() + " - " + department.getDeptId());
	}

	public void display(Developer developer) {
		displayCommon(developer);
		System.out.println("Language: " + developer.getLanguage());
		System.out.println();
	}

	public void display(Tester tester) {
		displayCommon(tester);
		System.out.println("Testing Tool: " + tester.getTools());
		System.out.println();
	}
}