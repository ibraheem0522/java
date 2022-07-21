
public class bignumber {

	public static void main(String[] args) {

		int x = (int)(Math.random()*101);
		int y = (int)(Math.random()*101);
		int z = (int)(Math.random()*101);
		/*
		 * System.out.println(x); System.out.println(y); System.out.println(z);
		 */	
		
		if (x>y&&x>z)System.out.println(x);
    	else if  (y>x&&y>z)System.out.println(y);
		else System.out.println(z);
    	
	}

}
