public class Runner{
	public static void main(String[]args){
		PerfectSquare psobj = (int x)->{return (((double)Math.sqrt((double)x) % 1.0) == 0.0);};

		if(psobj.perfectSquare(16))
			System.out.println("yes");
		else System.out.println("no");

		//I learned how to make a lamda function in java and have it return a value. I also learned how to correctly stage changes and push and pull in gitkraken. Also, I learned how to use branches and merge them in gitkraken.

			float x1f = 10;
			float x2f = 1;
			Quotient lobj = (float x1, float x2)->System.out.printf("%.3f",x1/x2);
			lobj.getQuotient(x1f,x2f);
		}
	public interface Quotient{
		public void getQuotient(float x1, float x2);
	}
	interface PerfectSquare{
		boolean perfectSquare(int x);
	}
}