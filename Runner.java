public class Runner{
	public static void main(String[]args){
<<<<<<< HEAD
		PerfectSquare psobj = (int x)->{return (((double)Math.sqrt((double)x) % 1.0) == 0.0);};

		if(psobj.perfectSquare(16))
			System.out.println("yes");
		else System.out.println("no");
=======
			float x1f = 10;
			float x2f = 1;
			Quotient lobj = (float x1, float x2)->System.out.printf("%.3f",x1/x2);
			lobj.getQuotient(x1f,x2f);
		}
	}
	public interface Quotient{
					public void getQuotient(float x1, float x2);
>>>>>>> Print_Quotient
	}
}

interface PerfectSquare{
	boolean perfectSquare(int x);
}