package com.amazon.ata.interfaces;

/**
 * Reverse a String and act like a <code>CharSequence</code>.
 * <p>
 * Change this class definition to implement CharSequence.
 */
public class ReversedString implements CharSequence {

    private String chars;

    /**
     * Implement this constructor during the interfaces prework.
     *
     * @param chars The String of chars to be reversed
     */
    public ReversedString(final String chars) {
        if (chars == null || chars.isEmpty()) {
            throw new IllegalArgumentException("Input cannot be null or empty");
        }

        // String reversed = new StringBuilder(chars).reverse().toString();

        this.chars = chars;

        // String reversed = "nozama";

        String reversed = "";

        for (int i = chars.length() - 1; i >= 0; i--) {
            reversed = reversed + chars.charAt(i);
        }
    }

    @Override
    public int length() {
        //String chars = "nozama";
        int count = 0;
        for (char c : chars.toCharArray()) {
            count++;
        }
        return count;
    }

    @Override
    public char charAt(int index) {
        // String input = "nozama";
        if (index < 0 || index >= chars.length()) {
            throw new IllegalArgumentException("Index out of bounds");
        }
        char[] charsReversed = chars.toCharArray();
        return charsReversed[index];
        //return -1;  // return -1 if the character was not found

    }

    @Override
    public CharSequence subSequence(int start, int end) {
        //String input = "nozama";
        if (start < 0 || end > chars.length() || start > end) {
            throw new IllegalArgumentException("Invalid start or end index");
        }

        char[] charsReversed = chars.toCharArray();

        StringBuilder sb = new StringBuilder();
        for (int i = start; i < end; i++) {
            sb.append(charsReversed[i]);
        }
        return sb.toString();
    }

    @Override
    public String toString() {
        //String chars = "nozama";
        return chars;
    }
}
