package com.practicaldime.common.util;

import org.jasypt.util.text.BasicTextEncryptor;

import java.util.Calendar;
import java.util.Date;

public class UserTokenGen {

    private static final UserTokenGen INSTANCE = new UserTokenGen();
    private final BasicTextEncryptor textEncryptor = new BasicTextEncryptor();
    private final int VALID_LENGTH_IN_MIN = 10;

    private UserTokenGen() {
        super();
        textEncryptor.setPassword(UserTokenGen.class.getName());
    }

    public static UserTokenGen getInstance() {
        return INSTANCE;
    }

    public String encrypt(String value) {
        Calendar date = Calendar.getInstance();
        date.add(Calendar.MINUTE, VALID_LENGTH_IN_MIN);
        String encryptedUsername = textEncryptor.encrypt(value);
        String encryptedTime = textEncryptor.encrypt(String.valueOf(date.getTimeInMillis()));
        return String.format("%s&&%s", encryptedUsername, encryptedTime);
    }

    public String[] decrypt(String token) {
        String[] items = token.split("&&");
        String before = textEncryptor.decrypt(items[0]);
        String after = textEncryptor.decrypt(items[1]);
        return new String[]{before, after};
    }

    public boolean expired(String token) {
        String[] parts = decrypt(token);
        long time = Long.valueOf(parts[1]);
        Calendar now = Calendar.getInstance();
        Calendar tokenExpiry = Calendar.getInstance();
        tokenExpiry.setTime(new Date(time));
        tokenExpiry.add(Calendar.MINUTE, VALID_LENGTH_IN_MIN);
        return tokenExpiry.after(now);
    }
}
