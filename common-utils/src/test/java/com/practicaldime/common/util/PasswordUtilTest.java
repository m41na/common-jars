package com.practicaldime.common.util;

import org.junit.Test;

import static org.junit.Assert.*;

public class PasswordUtilTest {

    String pwd = "jerry";

    @Test
    public void testGenerateString() {
        String generated = RandomString.generateString(10);
        assertEquals("Expecting length of 10", 10, generated.length());
        System.out.printf("generated value %s%n", generated);
    }

    @Test
    public void textTextEncryption() {
        String text = "MyTextToEncrypt";
        String encrypted = PasswordUtil.encryptText(text);
        assertNotEquals(encrypted, text);

        String decrypted = PasswordUtil.decryptText(encrypted);
        assertEquals(decrypted, text);
        System.out.printf("%s, %s, %s%n", text, encrypted, decrypted);
    }

    @Test
    public void textPasswordEncryption() {
        String text = "MyPassw0rdToEncrypt";
        String encrypted = PasswordUtil.hashPassword(text);
        assertNotEquals(encrypted, text);

        Boolean valid = PasswordUtil.verifyPassword(text, encrypted);
        assertTrue("Expecting a valid response", valid);
        System.out.printf("%s, %s, %s%n", text, encrypted, valid);
    }

    @Test
    public void testHashPassword() {
        String hash = PasswordUtil.hashPassword(pwd);
        System.out.println(hash);
        Boolean same = PasswordUtil.verifyPassword(pwd, hash);
        assertTrue(same);
    }

    @Test
    public void testGeneratePassword() {
        String generated = RandomString.generate();
        System.out.println(generated);
        assertNotNull(generated);
        assertEquals("Expecting 20 characters", 20, generated.length());
    }
}
