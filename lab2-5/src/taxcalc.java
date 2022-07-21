import java.util.Scanner;

public class taxcalc {

	public static void main(String[] args) {

			int salary=1;
			double nsalary=1;	
		Scanner input=new Scanner(System.in);
		System.out.println("Enter Your Salary to Calculate the Tax Rate : ");
		salary=input.nextInt();
		System.out.println("Your Salary is : "+salary);
			if (salary<=23000) {
				nsalary=salary-salary*0.10;
				System.out.println("Tax Rate is : 10% ");
				System.out.println("The the Salary after the Tax is : "+nsalary);	
			}
			else if (salary<=50000){
				nsalary=salary-salary*0.20;
				System.out.println("Tax Rate is : 20% ");
				System.out.println("The the Salary after the Tax is : "+nsalary);	
			}
			else if (salary<=100000){
				nsalary=salary-salary*0.30;
				System.out.println("Tax Rate is : 30% ");
				System.out.println("The the Salary after the Tax is : "+nsalary);	
			}
			else {
				nsalary=salary-salary*0.40;
				System.out.println("Tax Rate is : 40% ");
				System.out.println("The the Salary after the Tax is : "+nsalary);	
			}
			
			
		
		
	}

}
