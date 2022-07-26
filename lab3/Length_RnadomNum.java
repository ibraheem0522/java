package lab3;

public class Length_RnadomNum {

	public static void main(String[] args) {

		
		
		int x=(int)(Math.random()*10001);
		
		System.out.println(x);
		
		if (x<10)
			System.out.println("1");
		else if (x<100)
			System.out.println("2");
		else if (x<1000)
			System.out.println("3");
		else System.out.println("4");
	}

}
