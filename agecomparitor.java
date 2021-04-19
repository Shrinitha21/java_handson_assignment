package testcase;

import java.util.Comparator;

class agecomparitor implements Comparator<Employee>{

	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		if(o1.getAge() != o2.getAge()) {
			return o1.getAge() + o2.getAge();
		}
		else {
			return o1.getSalary() + o2.getSalary();
		}
	}
}