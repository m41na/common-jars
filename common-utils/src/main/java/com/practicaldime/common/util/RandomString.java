package com.practicaldime.common.util;

import org.apache.commons.text.RandomStringGenerator;

import java.security.SecureRandom;
import java.util.Locale;
import java.util.Objects;
import java.util.Random;

public class RandomString {
    public static final String UPPER = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    public static final String LOWER = UPPER.toLowerCase(Locale.ROOT);
    public static final String DIGITS = "0123456789";
    public static final String ALPHA_NUM = UPPER + LOWER + DIGITS;
    private final Random random;
    private final char[] symbols;
    private final char[] buf;

    public RandomString(int length, Random random, String symbols) {
        if (length < 1) {
            throw new IllegalArgumentException();
        }
        if (symbols.length() < 2) {
            throw new IllegalArgumentException();
        }
        this.random = Objects.requireNonNull(random);
        this.symbols = symbols.toCharArray();
        this.buf = new char[length];
    }

    /**
     * Create an alphanumeric string generator.
     *
     * @param length
     * @param random
     */
    public RandomString(int length, Random random) {
        this(length, random, ALPHA_NUM);
    }

    /**
     * Create an alphanumeric strings from a secure generator.
     *
     * @param length
     */
    public RandomString(int length) {
        this(length, new SecureRandom());
    }

    /**
     * Create session identifiers.
     */
    public RandomString() {
        this(21);
    }

    public static String generateString(int len) {
        return new RandomString(len).nextString();
    }

    public static String generate() {
        RandomStringGenerator generator = new RandomStringGenerator.Builder()
                .withinRange('a', 'z').withinRange('A', 'Z').withinRange(0, 9).build();
        return generator.generate(20);
    }

    /**
     * Generate a random string.
     *
     * @return
     */
    public String nextString() {
        for (int idx = 0; idx < buf.length; ++idx) {
            buf[idx] = symbols[random.nextInt(symbols.length)];
        }
        return new String(buf);
    }
}
