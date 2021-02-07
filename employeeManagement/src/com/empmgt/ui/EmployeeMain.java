package com.empmgt.ui;

import com.empmgt.entities.*;

public class EmployeeMain {
	public static void main() {
		EmployeeMain employeeMain = new EmployeeMain();
		employeeMain.run();
	}

	public void run() {
		Employee store[] = new Employee[4];
		Department department1 = new Department("001", "Automobile Engineering");
		Department department2 = new Department("002", "Mechanical Engineering");
		Department department3 = new Department("003", "Computer Science Engineering");
		Department department4 = new Department("004", "Electronics and Communication Engineering");
		Developer developer1 = new Developer(1, "Shayak", department1, "C ");
		Developer developer2 = new Developer(2, "Arpit", department2, "Java");
		Tester tester1 = new Tester(3, "Mayur", department3, "Selenium");
		Tester tester2 = new Tester(4, "Naman", department4, "Ranorex");
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
		Department department = new Department();
		System.out.println("Employee " + employee.getId() + ": " + employee.getName());
		System.out.println("Department: " + department.getDeptName() + " - " + department.getDeptId());
	}

	public void display(Developer developer) {
		displayCommon(developer);
		System.out.println("Language: " + developer.getLanguage());
	}

	public void display(Tester tester) {
		displayCommon(tester);
		System.out.println("Testing Tool: " + tester.getTools());
	}
}
