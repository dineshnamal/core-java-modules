package com.equalhashcode;

public class Money {
	 int amount;
	 String currencyCode;

	public Money(int amount, String currencyCode) {
		this.amount = amount;
		this.currencyCode = currencyCode;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + amount;
		result = prime * result + ((currencyCode == null) ? 0 : currencyCode.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object other) {
		if(other == this) {
			return true;
		}
		if(!(other instanceof Money)) {
			return false;
		}
		Money otherM = (Money)other;
		boolean currencyCodeEqual = (this.currencyCode == null && otherM.currencyCode == null ) || (this.currencyCode != null && this.currencyCode.equals(otherM.currencyCode));
		return this.amount == otherM.amount && currencyCodeEqual;
	}
	
	
	
}
