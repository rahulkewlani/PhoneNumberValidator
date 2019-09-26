package com.validation;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidatePhoneNumber {
	public static String phoneNumberValidation(String phoneNumber) {

		String result="";
		if(phoneNumber==null)
		{
			result=Result.INVALID_PHONENUMBER;
			return result;
		}
		Pattern pattern = Pattern.compile("^\\+\\d{1,3}[- ][7-9][0-9]{9}$");
		Matcher matcher = pattern.matcher(phoneNumber);
	
		if (matcher.matches()) {
			result=Result.VALID_PHONENUMBER;
		}
		else
		{
			result=Result.INVALID_PHONENUMBER;
		}

		return result;
	}


}


