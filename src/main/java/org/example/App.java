package org.example;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        System.out.println(reserve("Rahim"));
    }

    public static String reserve(String name) {
        char[] chars = name.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            chars[chars.length - 1 - i] = name.charAt(i);

        }
        return new String(chars);
    }
}
