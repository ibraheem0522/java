package lab3;

public class Print_BetweenNum {

	public static void main(String[] args) {

		 int x=(int)(Math.random()*51);
		 int y=(int)(Math.random()*51);
		 
		 System.out.println(x);
		 System.out.println(y);
		 System.out.println("***********");
		 
		 if (x>y) 
			 for (int i=y;i<=x;i++) 
				 System.out.println(i);
			 
			else 
				for (int i=x;i<=y;i++) 
					 System.out.println(i);
			
			
		 
	}

}
