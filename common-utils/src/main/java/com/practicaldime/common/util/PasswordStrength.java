package com.practicaldime.common.util;

public class PasswordStrength implements PasswordCheck {

    private final String okSpecials = "~`!@#$%^&*()-_=+\\|[{]};:'\",<.>/?";
    private final int minLength = 8;
    private final int minSpecial = 1;
    private final int minDigits = 1;
    CheckPoint<String> okSpecialsCheck = new CheckPoint<String>(minSpecial, okSpecials) {

        @Override
        public boolean evaluate(char ch) {
            return okSpecialsCheck.value.indexOf(ch) > -1;
        }
    };
    CheckPoint<Integer> minDigitsCheck = new CheckPoint<Integer>(minDigits) {

        @Override
        public boolean evaluate(char ch) {
            return Character.isDigit(ch);
        }
    };

    @Override
    public String isCompliant(char[] password) {
        // evaluate all characters in password
        if (password.length >= minLength) {
            for (int i = 0; i < password.length; i++) {
                char ch = password[i];
                if (minDigitsCheck.evaluate(ch)) {
                    minDigitsCheck.increment();
                    continue;
                }
                if (okSpecialsCheck.evaluate(ch)) {
                    okSpecialsCheck.increment();
                    continue;
                }
                if (Character.isWhitespace(ch)) {
                    return "White space character not permissible";
                }
            }

            // check compliance
            if (minDigitsCheck.count < minDigitsCheck.limit) {
                return String.format("Password must have at least %d digits", minDigitsCheck.limit);
            }

            if (okSpecialsCheck.count < okSpecialsCheck.limit) {
                return String.format("Password must have at least %d special characters", okSpecialsCheck.limit);
            }

            // return null if all is well
            return null;
        } else {
            return String.format("Password must be at least %d characters long", minLength);
        }
    }

    abstract class CheckPoint<T> {

        final T value;
        final int limit;
        int count;
        String message;

        public CheckPoint(int limit) {
            this(limit, null);
        }

        public CheckPoint(int limit, T value) {
            super();
            this.limit = limit;
            this.value = value;
        }

        public abstract boolean evaluate(char ch);

        public void increment() {
            this.count++;
        }
    }
}
