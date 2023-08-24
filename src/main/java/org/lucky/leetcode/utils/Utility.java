package org.lucky.leetcode.utils;

public class Utility {

    private static final long MEGABYTE = 1024L * 1024L;

    public static long bytesToMegabytes(long bytes) {
        return bytes / MEGABYTE;
    }

    public static int[] sort_insertion(int[] nums){
        for(int i=0; i < nums.length; i++){

        }
        return nums;
    }

    public static void get_used_memory(){
        Runtime runtime = Runtime.getRuntime();
        runtime.gc();
        // Calculate the used memory
        long memory = runtime.totalMemory() - runtime.freeMemory();
        System.out.println("Used memory is megabytes: "+ bytesToMegabytes(memory)+" total memory "+bytesToMegabytes(runtime.totalMemory())
                +" total free memory "+bytesToMegabytes(runtime.freeMemory())
        );
    }
}
