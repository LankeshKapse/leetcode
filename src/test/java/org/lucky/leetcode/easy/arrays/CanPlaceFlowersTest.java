package org.lucky.leetcode.easy.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CanPlaceFlowersTest {

    @Test
    void canPlaceFlowers() {
        assertEquals(false,CanPlaceFlowers.canPlaceFlowers(new int[]{1,0,0,0,0,1},2),"[1,0,0,0,0,1] n=2");
        assertEquals(false,CanPlaceFlowers.canPlaceFlowers(new int[]{1,0,0,0,1},2),"[1,0,0,0,0,1] n=2");
        assertEquals(true,CanPlaceFlowers.canPlaceFlowers(new int[]{1,0,0,0,0,0,1}, 2),"{1,0,0,0,0,0,1} n=2");
        assertEquals(true,CanPlaceFlowers.canPlaceFlowers(new int[]{0,0,1,0,1},1),"[0,0,1,0,1] n=1");
        assertEquals(true,CanPlaceFlowers.canPlaceFlowers(new int[]{0,0,1,0,1},1),"[1,0,1,0,0] n=1");
        assertEquals(true,CanPlaceFlowers.canPlaceFlowers(new int[]{1,0,0,0,1,0,0},2),"[1,0,0,0,1,0,0] n=2");
        assertEquals(true,CanPlaceFlowers.canPlaceFlowers(new int[]{1},0),"[1] n=0");
        assertEquals(true,CanPlaceFlowers.canPlaceFlowers(new int[]{0},1),"[1] n=0");
        assertEquals(false,CanPlaceFlowers.canPlaceFlowers(new int[]{1},1),"[1] n=1");
        assertEquals(false,CanPlaceFlowers.canPlaceFlowers(new int[]{0,1,0},1),"[0,1,0] n=1");
    }
}