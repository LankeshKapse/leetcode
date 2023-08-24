package org.lucky.leetcode.easy.arrays;

public class CanPlaceFlowers {

    public static boolean canPlaceFlowers(int[] flowerbed, int n){
        int allowed =0;
        if(flowerbed.length==1){
            if(flowerbed[0]==1 && n<1)
                return true;
            if(flowerbed[0]==1 && n>=1)
                return false;
            if(flowerbed[0]==0 && n<=1)
                return true;
        }
        for(int i=0; i< flowerbed.length;i++){
            if(i==0){
                if(flowerbed[i+1]==0 && flowerbed[i]==0){
                    allowed++;
                    flowerbed[i]=1;
                    continue;
                }else{
                    continue;
                }

            }
            if(i==flowerbed.length-1 && flowerbed[i-1]==0 && flowerbed[i]==0){
                allowed++;
                break;
            }
            if(flowerbed[i]==0 && flowerbed[i-1]==0 && flowerbed[i+1]==0){
                allowed++;
                flowerbed[i]=1;
            }

        }
        return allowed>=n;
    }
}
