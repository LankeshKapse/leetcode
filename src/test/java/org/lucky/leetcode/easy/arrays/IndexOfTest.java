package org.lucky.leetcode.easy.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IndexOfTest {

    @Test
    void strStr() {
        assertEquals(-1,IndexOf.strStr("Hello World","Hello World Hello World"),"Hello World >> Hello World Hello World");
    }

    @Test
    void index() {
        assertEquals(-1,IndexOf.index("Hello World","Hello World Hello World"),"Hello World >> Hello World Hello World");
    }
}