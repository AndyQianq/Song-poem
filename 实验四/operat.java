package สตั้หฤ;

import java.math.BigDecimal;

public class operat {
	 public static double divide(double divisor, double dividend){
	        return new BigDecimal(divisor).divide(new BigDecimal(dividend), 5, BigDecimal.ROUND_HALF_UP).doubleValue();
	    }
}
