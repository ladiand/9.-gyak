package polinom;

import matematika.Polinom;

public class LinearisPolinom implements Polinom {

	private double a;
	private double b;
	
	public LinearisPolinom(double a, double b) {
		this.a = a;
		this.b = b;
	}

	@Override
	public double szamol(double x) {
		return a * x + b;
	}

	@Override
	public int getPolinomFoka() {
		if (a == 0) {
			return 0;
		} else {
			return 1;
		}
		
	}

	@Override
	public String toString() {
		// y=2x-3
		if (b <= 0){
			return "y= " + a + "x" + b + "";
		} else{
			return "y= " + a + "x+" + b + "";
		//return "y=" + a + "x" + (b < 0 ? "" : "+") + b;
		}
	}

}
