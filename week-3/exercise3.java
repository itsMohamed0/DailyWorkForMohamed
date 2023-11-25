package mypackage;

import java.util.Arrays;

public class exercise3 {
    static boolean areAnagram(String str1, String str2) {
        if (str1.length() != str2.length())
            return false;

        char[] str1Array = str1.toCharArray();
        char[] str2Array = str2.toCharArray();

        Arrays.sort(str1Array);
        Arrays.sort(str2Array);

        for (int i = 0; i < str1Array.length; i++)
            if (str1Array[i] != str2Array[i])
                return false;

        return true;
    }

    public static void main(String args[]) {
        String str1 = "stones";
        String str2 = "tones";
        if (areAnagram(str1, str2))
            System.out.println("The two strings are anagram of each other");
        else
            System.out.println("The two strings are not anagram of each other");
    }
}

