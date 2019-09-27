package com.validation.test;

import static org.testng.Assert.assertEquals;
import org.testng.annotations.Test;

import com.validation.Result;
import com.validation.ValidatePhoneNumber;

public class TestClass {


	
    @Test
    public void testPhoneNumberValidationRandomString() {
        ValidatePhoneNumber tester = new ValidatePhoneNumber(); 
        assertEquals(Result.INVALID_PHONENUMBER, tester.phoneNumberValidation("8efnkfklhhefy9y3h"));
       
    }
   
    @Test
    public void testPhoneNumberValidationNull() {
        ValidatePhoneNumber tester = new ValidatePhoneNumber(); 
        assertEquals(Result.INVALID_PHONENUMBER, tester.phoneNumberValidation(null));
       
    }
    @Test
    public void testPhoneNumberValidationEmptyString() {
        ValidatePhoneNumber tester = new ValidatePhoneNumber(); 
        assertEquals(Result.INVALID_PHONENUMBER, tester.phoneNumberValidation(""));
       
    }
    
    @Test
    public void testPhoneNumberValidationEmptyCountry() {
        ValidatePhoneNumber tester = new ValidatePhoneNumber(); 
        assertEquals(Result.INVALID_PHONENUMBER, tester.phoneNumberValidation("9123456789"));
       
    }
    @Test
    public void testPhoneNumberValidationCountryCodeMoreThanThree() {
        ValidatePhoneNumber tester = new ValidatePhoneNumber(); 
        assertEquals(Result.INVALID_PHONENUMBER, tester.phoneNumberValidation("+9111 9123456789"));
       
    }
    @Test
    public void testPhoneNumberValidationWithoutCountryCode() {
        ValidatePhoneNumber tester = new ValidatePhoneNumber(); 
        assertEquals(Result.INVALID_PHONENUMBER, tester.phoneNumberValidation("+9123456789"));
       
    }
    
    @Test
    public void testPhoneNumberValidationPhoneDigitsMoreThanTen() {
        ValidatePhoneNumber tester = new ValidatePhoneNumber(); 
        assertEquals(Result.INVALID_PHONENUMBER, tester.phoneNumberValidation("+9111 99999999999"));
       
    }
    @Test
    public void testPhoneNumberValidationPhoneDigitsLesseThanTen() {
        ValidatePhoneNumber tester = new ValidatePhoneNumber(); 
        assertEquals(Result.INVALID_PHONENUMBER, tester.phoneNumberValidation("+9111 999999999"));
       
    }
    @Test
    public void testPhoneNumberValidationPhoneNumberStartingWithLessThanSeven() {
        ValidatePhoneNumber tester = new ValidatePhoneNumber(); 
        assertEquals(Result.INVALID_PHONENUMBER, tester.phoneNumberValidation("+9111 6999999999"));
       
    }
    @Test
    public void testPhoneNumberValidationPhoneNumberStartingWithoutHyphen() {
        ValidatePhoneNumber tester = new ValidatePhoneNumber(); 
        assertEquals(Result.INVALID_PHONENUMBER, tester.phoneNumberValidation("+91117999999999"));
       
    }
    @Test
    public void testPhoneNumberValidationPhoneNumberAndCountryCodeSeparatedWithoutSpace() {
        ValidatePhoneNumber tester = new ValidatePhoneNumber(); 
        assertEquals(Result.INVALID_PHONENUMBER, tester.phoneNumberValidation("+91117999999999"));
       
    }
    @Test
    public void testPhoneNumberValidationPhoneNumberInvalidCountryCodeSign() {
        ValidatePhoneNumber tester = new ValidatePhoneNumber(); 
        assertEquals(Result.INVALID_PHONENUMBER, tester.phoneNumberValidation("-9111 7999999999"));
       
    }
    
    @Test
    public void testPhoneNumberValidationPhoneNumberWithInvalidCountryCodePhoneNumberSeparator() {
        ValidatePhoneNumber tester = new ValidatePhoneNumber(); 
        assertEquals(Result.INVALID_PHONENUMBER, tester.phoneNumberValidation("+9111=7999999999"));
       
    }
    @Test
    public void testphoneNumberValidationPhoneNumberWithOneDigitCountryCodeWithSpaceSeparated() {
        ValidatePhoneNumber tester = new ValidatePhoneNumber(); 
        assertEquals(Result.VALID_PHONENUMBER, tester.phoneNumberValidation("+1 9123456789"));
       
    }
    @Test
    public void testphoneNumberValidationPhoneNumberWithTwoDigitCountryCodeWithSpaceSeparated() {
        ValidatePhoneNumber tester = new ValidatePhoneNumber(); 
        assertEquals(Result.VALID_PHONENUMBER, tester.phoneNumberValidation("+91 9123456789"));
       
    }
    @Test
    public void testphoneNumberValidationPhoneNumberWithThreeDigitCountryCodeWithSpaceSeparated() {
        ValidatePhoneNumber tester = new ValidatePhoneNumber(); 
        assertEquals(Result.VALID_PHONENUMBER, tester.phoneNumberValidation("+911 9123456789"));
       
    }
    @Test
    public void testphoneNumberValidationPhoneNumberWithOneDigitCountryCodeWithHyphenSeparated() {
        ValidatePhoneNumber tester = new ValidatePhoneNumber(); 
        assertEquals(Result.VALID_PHONENUMBER, tester.phoneNumberValidation("+1-9123456789"));
       
    }
    @Test
    public void testphoneNumberValidationPhoneNumberWithTwoDigitCountryCodeWithHyphenSeparated() {
        ValidatePhoneNumber tester = new ValidatePhoneNumber(); 
        assertEquals(Result.VALID_PHONENUMBER, tester.phoneNumberValidation("+91-9123456789"));
       
    }
    @Test
    public void testphoneNumberValidationPhoneNumberWithThreeDigitCountryCodeWithHyphenSeparated() {
        ValidatePhoneNumber tester = new ValidatePhoneNumber(); 
        assertEquals(Result.VALID_PHONENUMBER, tester.phoneNumberValidation("+911-9123456789"));
       
    }
}
