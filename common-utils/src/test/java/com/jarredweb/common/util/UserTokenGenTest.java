package com.jarredweb.common.util;

import static org.junit.Assert.assertEquals;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Date;

import org.junit.Test;

public class UserTokenGenTest {
    
    private final UserTokenGen gen = UserTokenGen.getInstance();

    @Test
    public void testEncrypt() throws UnsupportedEncodingException {
        String mediaPAth = "1/sudent/faveone.jpeg";
        System.out.println(URLEncoder.encode(gen.encrypt(mediaPAth), "utf-8"));
    }

    @Test
    public void testDecrypt() {
        String token = "SOmeS3cr3tC0d3";
        String encrypted = gen.encrypt(token);
        System.out.format("Source '%s' encrypted is '%s'%n", token, encrypted);
        
        String decrypted = gen.decrypt(encrypted)[0];
        assertEquals("Expected same value", token, decrypted);
    }

    @Test
    public void testExpired() {
        String token = "SOmeS3cr3tC0d3";
        String encrypted = gen.encrypt(token);
        System.out.format("Source '%s' encrypted is '%s'%n", token, encrypted);
        
        String decrypted = gen.decrypt(encrypted)[1];
        System.out.println(new Date(Long.valueOf(decrypted)));
    }
}
