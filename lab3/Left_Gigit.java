package lab3;

public class Left_Gigit {

	public static void main(String[] args) {

			int x=(int)(Math.random()*10001);
				System.out.println(x);
		
		
	       while (x >= 10) 
	            x %= 10;
	       
	       System.out.println(x);
	}

}
