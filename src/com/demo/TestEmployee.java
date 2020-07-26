package com.demo;

public class TestEmployee {
	public static void salary(Object obj)
  	{
		if (obj instanceof Director) 			
			System.out.println	(" Director Salary 30000$");
					else if (obj instanceof Manager) 		
			System.out.println	 (" Manager Salary 20000$");
					else if (obj instanceof Employee) 		
			System.out.println	 (" Employee Salary 10000$");
					else  System.out.println(" INVALID");

  	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				/*System.out.println(" Employee object e is created  ");
				Employee e =  new Employee();
				System.out.println("  Manager object m is created  ");
				Manager m = new Manager();
				System.out.println("  Director object d is created  ");
				Director d = new Director();
				System.out.println("  salary(e) is called ; ");
				salary(e);
				System.out.println("  salary(m) is called ; ");
				salary(m);
				System.out.println("  salary(d) is called ; ");*/
		
				String inch = null;
		String nisu = null;
		//salary(d);
		salary(new Employee("inch", "nisu"));


		

	}

}
