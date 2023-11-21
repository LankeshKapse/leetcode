package org.lucky.leetcode.easy.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RomanToIntegerTest {

    @Test
    public void romanToInt(){
        assertEquals(3,RomanToInteger.romanToInt("III"),"[III]");
        assertEquals(58,RomanToInteger.romanToInt("LVIII"),"[LVIII]");
        assertEquals(1994,RomanToInteger.romanToInt("MCMXCIV"),"[MCMXCIV]");
        assertEquals(3045,RomanToInteger.romanToInt("MMMXLV"),"[MMMXLV]");
    }

}