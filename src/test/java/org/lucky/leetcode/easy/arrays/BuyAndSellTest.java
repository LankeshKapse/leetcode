package org.lucky.leetcode.easy.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BuyAndSellTest {

    @Test
    public void maxProfit_test(){
        assertEquals(5,BuyAndSell.maxProfit(new int[]{7,1,5,3,6,4}),"[7,1,5,3,6,4]");
        assertEquals(0,BuyAndSell.maxProfit(new int[]{7,6,4,3,1}),"[7,6,4,3,1]");
        assertEquals(2,BuyAndSell.maxProfit(new int[]{2,4,1}),"[2,4,1]");
        assertEquals(2,BuyAndSell.maxProfit(new int[]{2,1,2,1,0,1,2}),"[2,1,2,1,0,1,2]");
        assertEquals(4,BuyAndSell.maxProfit(new int[]{3,3,5,0,0,3,1,4}),"[3,3,5,0,0,3,1,4]");
    }

}