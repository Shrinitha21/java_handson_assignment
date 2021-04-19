package testcase;

import java.util.Comparator;

class comparitor implements Comparator<Employee>{
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		if(o1.getSalary() != o2.getSalary()) {
			return o1.getSalary() - o2.getSalary();
		}
		return 0;
	}
}