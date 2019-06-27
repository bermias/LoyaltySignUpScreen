package com.ermias.loyaltysignupscreen;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternClass {
    private String validatorEmailaddress(String email) {
        Pattern pattern = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$",
                Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(email);
        System.out.println("Email");
        if (matcher.find()) {
            return "Correct Email Address";
        }
       return "Email address not provided or contains invalid characters";
    }
    private String validatorPhoneNumber(String phone) {
        Pattern pattern = Pattern.compile("\\d{10}|(?:\\d{3}-){2}\\d{4}|\\(\\d{3}\\)\\d{3}-?\\d{4}");
        Matcher matcher = pattern.matcher(phone);
        System.out.println("phone");
        if (matcher.find()) {
            return "Correct Phone";
        }

        return "Phone number if provided, contains non-numeric characters";
    }
    private String validatorFName(String name) {
        System.out.println("name");
        if (name.equals("") || name.length() < 2) {
            return "First name not provided or contains invalid characters.";
        }

        String regx = "[a-zA-Z]+\\.?";
        Pattern pattern = Pattern.compile("[a-zA-Z]+\\.?", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(name);
        if (matcher.find()) {
            return "Correct First Name";
        }

        return "First name not provided or contains invalid characters";
    }
    private String validatorLName(String name) {
        System.out.println("name");
        if (name.equals("") || name.length() < 2) {
            return "Last name not provided or contains invalid characters.";
        }

        String regx = "[a-zA-Z]+\\.?";
        Pattern pattern = Pattern.compile("[a-zA-Z]+\\.?", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(name);
        if (matcher.find()) {
            return "Correct Last Name";
        }

        return "Last name not provided or contains invalid characters";
    }

    String getPatternResult(String fName, String lName, String email,String phone){
        return validatorPhoneNumber(phone) +"\n"+ validatorEmailaddress(email) + "\n" +
                validatorFName(fName) +"\n" +validatorLName(lName);
    }
}
