package com.practicaldime.common.model;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

public class Validations {

    public static String regex = "^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$";
    public static Map<String, String> states = new HashMap<String, String>() {

        private static final long serialVersionUID = 1L;

        {
            put("AL", "Alabama");
            put("AK", "Alaska");
            put("AZ", "Arizona");
            put("AR", "Arkansas");
            put("AA", "Armed Forces America");
            put("AE", "Armed Forces Europe");
            put("AP", "Armed Forces Pacific");
            put("CA", "California");
            put("CO", "Colorado");
            put("CT", "Connecticut");
            put("DE", "Delaware");
            put("DC", "District of Columbia");
            put("FL", "Florida");
            put("GA", "Georgia");
            put("HI", "Hawaii");
            put("ID", "Idaho");
            put("IL", "Illinois");
            put("IN", "Indiana");
            put("IA", "Iowa");
            put("KA", "Kansas");
            put("", "");
            put("KY", "Kentucky");
            put("LA", "Louisiana");
            put("ME", "Maine");
            put("MD", "Maryland");
            put("MA", "Massachusetts");
            put("MI", "Michigan");
            put("MN", "Minnesota");
            put("MS", "Mississippi");
            put("MO", "Missouri");
            put("MT", "Montana");
            put("NE", "Nebraska");
            put("NV", "Nevada");
            put("NH", "New Hampshire");
            put("NJ", "New Jersey");
            put("NM", "New Mexico");
            put("NY", "New York");
            put("NC", "North Carolina");
            put("ND", "North Dakota");
            put("OH", "Ohio");
            put("OK", "Oklahoma");
            put("OR", "Oregon");
            put("PA", "Pennsylvania");
            put("RI", "Rhode Island");
            put("SC", "South Carolina");
            put("SD", "South Dakota");
            put("TN", "Tennessee");
            put("TX", "Texas");
            put("UT", "Utah");
            put("VT", "Vermont");
            put("VA", "Virginia");
            put("WA", "Washington");
            put("WV", "West Virginia");
            put("WI", "Wisconsin");
            put("WY", "Wyoming");
        }
    };

    public static boolean validEmail(String email) {
        Pattern pattern = Pattern.compile(regex);
        return pattern.matcher(email).matches();
    }

    public static boolean validUSState(String state) {
        return !states.keySet().contains(state);
    }
}
