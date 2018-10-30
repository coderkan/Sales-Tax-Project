package salestaxes.helpers;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;

public class MathHelper {

	private static final double ROUND_OFF = 0.05f;
	
	public static double roundOff(double val) {
		return (int)(val / ROUND_OFF + 0.5f) * 0.05f;
	}
	
	public static double truncate(double value){
		String result = new DecimalFormat("0.00").format(value);
		return Double.parseDouble(result);
	}
	
	static public double nearest5Percent(double amount) {

		return new BigDecimal(Math.ceil(amount * 20)/20).setScale(2,RoundingMode.HALF_UP).doubleValue();

	}

	public static double roundPrice(double amount) {

		return new BigDecimal(amount).setScale(2, RoundingMode.HALF_UP)
				.doubleValue();

	}
}
