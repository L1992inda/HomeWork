package io.codelex.loops.practice;

public class VowelsHomework {
    public static void main(String[] args) {
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};

        for (int i = 0; i < vowels.length; i++) {
            System.out.println(vowels[i]);
        }
        for (char i : vowels) {
            System.out.println(i);
        }
    }
}
