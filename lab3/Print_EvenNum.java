package lab3;

public class Print_EvenNum {

	public static void main(String[] args) {

		 int x=(int)(Math.random()*51);


		 for (int i=0;i<x;i++) {
			 if (i%2==0) {
			 System.out.println(i);
			 }
		 }
	}

}
