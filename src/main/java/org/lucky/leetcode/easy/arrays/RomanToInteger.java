package org.lucky.leetcode.easy.arrays;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {

    /*private static Map<String, Integer> map = new HashMap<>();

    static {
        map.put("I", 1);
        map.put("V", 5);
        map.put("X", 10);
        map.put("L", 50);
        map.put("C", 100);
        map.put("D", 500);
        map.put("M", 1000);
    }*/

    public static int romanToInt(String s) {
        int number=0;
        char[] chars = s.toCharArray();
        int length = chars.length;
        for(int i=0;i<length;i++){
            if(i< length-1){
                if(chars[i]=='I' && (chars[i+1]=='V' || chars[i+1]=='X')){
                    number += (chars[i]+""+chars[i+1]).equals("IV") ? 4: 9;
                    i++;
                    continue;
                }
                if(chars[i]=='X' && (chars[i+1]=='L' || chars[i+1]=='C')){
                    number += (chars[i]+""+chars[i+1]).equals("XL") ? 40: 90;
                    i++;
                    continue;
                }
                if(chars[i]=='C' && (chars[i+1]=='D' || chars[i+1]=='M')){
                    number += (chars[i]+""+chars[i+1]).equals("CD") ? 400: 900;
                    i++;
                    continue;
                }
            }

            switch (chars[i]){
                case 'I' : number +=1;break;
                case 'V' : number +=5;break;
                case 'X' : number +=10;break;
                case 'L' : number +=50;break;
                case 'C' : number +=100;break;
                case 'D' : number +=500;break;
                case 'M' : number +=1000;break;
                default  : number +=0;
            }

           /* long p_end = System.nanoTime();
            System.out.println("program execution >> "+(p_end-p_start));
            long start = System.nanoTime();
            number +=map.get(""+chars[i]);
            long end = System.nanoTime();
            System.out.println("map get >> "+(end-start));*/
        }
        return number;
    }

    public static void print_token(String... args){
//        print_token(""+s.charAt(i)+""+s.charAt(i+1));
        for(String token : args)
            System.out.println(token);
    }
}
