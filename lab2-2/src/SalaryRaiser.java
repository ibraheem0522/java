
public class SalaryRaiser {

	public static void main(String[] args) {

		int salary = 5000 +(int)(Math.random()*1001);
		double updsalary;
		System.out.println("salary is :"+salary);
		
		if (salary *0.1+salary >6000) 
		{
			updsalary=salary*0.05+salary;
			System.out.println("rate of rise : 5%");
			System.out.println("updated salary is :"+updsalary);
		}
		else {
			updsalary=salary*0.10+salary;
			System.out.println("rate of rise : 10%");
			System.out.println("updated salary is :"+updsalary);
		}
			
		
	}

}
