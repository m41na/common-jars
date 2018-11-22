package com.jarredweb.common.util;

import org.jasypt.util.password.StrongPasswordEncryptor;
import org.jasypt.util.text.StrongTextEncryptor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PasswordUtil {

    private static final Logger LOG = LoggerFactory.getLogger(PasswordUtil.class);
    private static final StrongTextEncryptor TEXT_ENCR;
    private static final StrongPasswordEncryptor PASS_ENCR;

    static {
        TEXT_ENCR = new StrongTextEncryptor();
        TEXT_ENCR.setPassword(PasswordUtil.class.getName());
        PASS_ENCR = new StrongPasswordEncryptor();
    }

    public static String hashPassword(String pwd) {
        String encryptedPassword = PASS_ENCR.encryptPassword(pwd);
        return encryptedPassword;
    }
    
    public static char[] hashPassword(char[] pwd) {
        String hashed = PASS_ENCR.encryptPassword(new String(pwd));
        return hashed.toCharArray();
    }

    public static boolean verifyPassword(String pwd, String hash) {
        try {
            return PASS_ENCR.checkPassword(pwd, hash);
        } catch (Exception e) {
            LOG.error(e.getMessage());
            return false;
        }
    }

    public static boolean verifyPassword(String pwd, char[] hash) {
        boolean b = PASS_ENCR.checkPassword(pwd, new String(hash));
        return b;
    }

    public static String encryptText(String text) {
        return TEXT_ENCR.encrypt(text);
    }

    public static String decryptText(String text) {
        return TEXT_ENCR.decrypt(text);
    }
    
    public static void main(String...args){
        String word = args.length > 0? args[0] : "0Hh4pPyDaY";
        System.out.printf("password for '%s' is '%s'%n", word, PasswordUtil.hashPassword(word));
        System.out.println("Verify is " + verifyPassword("admin", "rK2EQkfNaQTf6yDKeDQ3ZXhCZWRSaAOmOjkOcHzWvvRt89GHADaFMeptBHXnVbBa"));
    }
}
