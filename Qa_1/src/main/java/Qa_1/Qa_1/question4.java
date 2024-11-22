package Qa_1.Qa_1;

public class question4 {
	/**
	 * shaden serhan 212019624
	 * shada nawatha 208049585
	 */
	public static String calculate(double a, double b,String mod) {
		switch(mod) {
		
		case "regular":
			if(a<b)
				return "B";
			else
				return "A";
		case "negative":
			if(-a>=-b)
				return "A";
			else
				return "B";
			
		case "reciprocals":
			if((1/a)>=(1/b))
				return "A";
			else
				return "B";
		default:
		return "error";

	}
}

}


