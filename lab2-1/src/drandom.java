
public class drandom {

	public static void main(String[] args) {

		int x = (int)(Math.random()*101);
		System.out.println(x);

			
		if (x>50  && (x%2==0))
		
			System.out.println("Big! and Even");
		else if (x>50  && (x%2!=0))
			System.out.println("Big! and Odd");
		else if (x<50  && (x%2==0))
			
			System.out.println("Small! and Even");
		else System.out.println("Small! and Odd");
    	
	}

}
