package org.lucky.leetcode.easy.arrays;

import static org.lucky.leetcode.utils.Utility.get_used_memory;

public class LengthOfLastWord {

    private static final long MEGABYTE = 1024L * 1024L;

    public static long bytesToMegabytes(long bytes) {
        return bytes / MEGABYTE;
    }
    public static int lengthOfLastWord(String s) {
        long start = System.nanoTime();
        s = s.trim();
        int break_point=-1;
        for(int i = s.length()-1; i>0;i--){
            if(Character.isWhitespace(s.charAt(i))){
                break_point=i;
                break;
            }
        }
        long end = System.nanoTime();
        int length = s.substring(++break_point).length();
        System.out.println("Execution time for approach >>>"+(end-start));
        get_used_memory();
        return length;
    }

    public static int lengthOfLastWordSplit(String s) {
        long start = System.nanoTime();
        String[] split = s.split("\\s+");
        int length = split[split.length - 1].length();
        long end = System.nanoTime();
        System.out.println("Execution time split approach >>>"+(end-start));
        get_used_memory();
        return length;
    }
}
