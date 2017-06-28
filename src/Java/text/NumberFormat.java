package Java.text;
import Java.text.NumberFormat;

public class NumberFormat {

	public double price = 11.575;
	public double miles = 15324.253;
	public double majority = .505;
	NumberFormat currency = NumberFormat.getCurrencyInstance();

	String priceString = currency.format(price);

	private static NumberFormat getCurrencyInstance() {
		// TODO Auto-generated method stub
		return null;
	}

	private String format(double price2) {
		// TODO Auto-generated method stub
		return null;
	}

			NumberFormat percent = NumberFormat.getPercentInstance();

			String majorityString = percent.format(majority);

			private static NumberFormat getPercentInstance() {
				// TODO Auto-generated method stub
				return null;
			}
			
}
