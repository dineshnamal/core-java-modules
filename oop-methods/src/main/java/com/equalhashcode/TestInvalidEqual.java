package com.equalhashcode;

public class TestInvalidEqual {

	public static void main(String[] args) {
		Money cash = new Money(42, "USD");
		WrongVoucher voucher = new WrongVoucher(42, "USD", "Amazon");
		 
		//System.out.println(voucher.equals(cash));  // As expected.//false
		System.out.println(cash.equals(voucher)); // That's wrong. // true


	}

}
