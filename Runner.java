public class Runner{
	public static void main(String[]args){
		PerfectSquare psobj = (int x)->{return (((double)Math.sqrt((double)x) % 1.0) == 0.0);};

		if(psobj.perfectSquare(16))
			System.out.println("yes");
		else System.out.println("no");

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
//I learned the process of working with a repository in Git Kraken and how to merge file and work with others on Git processes