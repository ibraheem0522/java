
public class leapyear {

	public static void main(String[] args) {
			
		int year =(int)(Math.random()*5000);        //2008; 
		
		
		System.out.println("The Year : "+year);
		
		if (year%4==0 && year%100!=0 || year%400==0 )
			System.out.print(" its leap year : ");
		else 			
			System.out.print(" its not leap year");


		
		
	}

}
