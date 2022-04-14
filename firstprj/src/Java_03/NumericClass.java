package Java_03;

import java.math.BigDecimal;

public class NumericClass {

	public static void main(String[] args) {
		
		String text = "-31.41234123412341512341234";
		System.out.println(text);
		System.out.println(Float.parseFloat(text));
		System.out.println(Double.parseDouble(text));
		Double d = Double.parseDouble(text);
		System.out.println(d);
		System.out.println(d.intValue());
		BigDecimal bd = new BigDecimal(text);
		System.out.println(bd);
		System.out.println(Math.round(d));
		System.out.println(Math.floor(d));
		System.out.println(Math.ceil(d));
		float f = 3.26f;
		System.out.println(f);
		System.out.println((int)f);
		
	}


}
