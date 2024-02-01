package com.amazon.ata.interfaces;

/**
 * Reverse a String and act like a <code>CharSequence</code>.
 * <p>
 * Change this class definition to implement CharSequence.
 */
public class ReversedString implements CharSequence {

    /**
     * Implement this constructor during the interfaces prework.
     *
     * @param chars The String of chars to be reversed
     */
    public ReversedString(final String chars) {
        if (chars == null || chars.isEmpty()) {
            throw new IllegalArgumentException("Input cannot be null or empty");
        }

        //String reversed = new StringBuilder(chars).reverse().toString();

        String reversed = "";

        for (int i = reversed.length() - 1; i >= 0; i--) {
            reversed = reversed + chars.charAt(i);
        }
    }

    @Override
    public int length() {
        String chars = "";
        int count = 0;
        for (char c : chars.toCharArray()) {
            count++;
        }
        return count;
    }

    @Override
    public char charAt(int index) {
        String input = "";
        if (index < 0 || index >= input.length()) {
            throw new IllegalArgumentException("Index out of bounds");
        }
        char[] chars = input.toCharArray();
        return chars[index];
        //return -1;  // return -1 if the character was not found

    }

    @Override
    public CharSequence subSequence(int start, int end) {
        String input = "";
        if (start < 0 || end > input.length() || start > end) {
            throw new IllegalArgumentException("Invalid start or end index");
        }
        char[] chars = input.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (int i = start; i < end; i++) {
            sb.append(chars[i]);
        }
        return sb.toString();
    }

    @Override
    public String toString() {
        String chars = "";
        return chars;
    }
}
