package org.lucky.leetcode.easy.arrays;

public class IndexOf {

    public static int strStr(String haystack, String needle) {
        return haystack.indexOf(needle);
    }

    public static int index(String haystack, String needle) {
        int haystack_length = haystack.length();
        int needle_length = needle.length();

        if(needle_length>haystack_length)
            return -1;

        for(int i=0;i<=haystack.length()-needle.length();i++){
            int j=0;
            while(j<needle_length && haystack.charAt(i+j) == needle.charAt(j)){
                j++;
                if(j==needle.length())
                    return i;
            }
        }
        return -1;
    }
}
