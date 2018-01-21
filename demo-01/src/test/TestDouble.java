package test;

import java.math.BigDecimal;

public class TestDouble {
	
	public static void main(String[] args){
		double d1 = 434564321;
		double d2 = 0.06;
		BigDecimal b1 = BigDecimal.valueOf(d1);
		BigDecimal b2 = BigDecimal.valueOf(d2);
		double d3 = b1.multiply(b2).setScale(2,  BigDecimal.ROUND_HALF_UP).doubleValue();
		System.out.println(d3);
	}

}
