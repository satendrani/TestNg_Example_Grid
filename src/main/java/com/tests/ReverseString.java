package com.tests;

public class ReverseString {

    static String original = "Satendra is good man";
    String reverse = "";

    public static void main(String[] args) {
        ReverseString rs = new ReverseString();
        rs.reverse_string(original);
        rs.reverse_string_inbuild_methods(original);
    }

    public void reverse_string(String text_for_reverse) {
        for (int i = text_for_reverse.length() - 1; i >= 0; i--) {
            reverse = reverse + text_for_reverse.charAt(i);
        }
        System.out.println("Original String is : " + text_for_reverse);
        System.out.println("Reversal String is : " + reverse);
    }

    public void reverse_string_inbuild_methods(String text_for_reverse) {
        StringBuffer sb = new StringBuffer().append(text_for_reverse);
        String b = sb.reverse().toString();

        System.out.println("Original String is : " + text_for_reverse);
        System.out.println("Reversal String is : " + b);
    }

}
