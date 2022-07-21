
public class Test {

	public static void main(String[] args) {

		int time =100 + ((int)(Math.random()*251));
		int hour=time/60;
		System.out.println("time in minutes : " + time+" m");
			//System.out.println("time in houre : " + ((double)time/60)+" h");
		System.out.println("time : " +'0' + hour+":" +(time-hour*60));
		
		

	}

}
