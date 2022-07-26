package lab3;

public class Divided_Max {

	public static void main(String[] args) {

		 int max=(int)(Math.random()*51);
		 int den=(int)(Math.random()*5);
		 
		 System.out.println(max);
		 System.out.println(den);
		 System.out.println("***********");
		
		 if (max%den==0)
			 for (int i=0;i<=max;i++) 
				 {
				 if (i%den==0)

				
				 System.out.println(i);
			 }
		 
	}

}
