package com.cg.service;

public interface Validator {
	String aidpattern="[1-9][0-9]{2}";
	String mobilepattern="[1-9][0-9]{9}";
	String namepattern="[A-Z][A-Za-z\\s]+";
	String balancepatter="[1-9][0-9]{3}[0-9]*(\\.[0-9]{2})?";
	public static boolean validatedata(String data, String pattern) {
		return data.matches(pattern);
	}

}
