package org.lucky.leetcode.easy.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LengthOfLastWordTest {

    @Test
    public void lengthOfLastWord_test(){
        assertEquals(5,LengthOfLastWord.lengthOfLastWord("Hello World"),"Hello World");
        assertEquals(4,LengthOfLastWord.lengthOfLastWord("   fly me   to   the moon  "),"   fly me   to   the moon  ");
        assertEquals(6,LengthOfLastWord.lengthOfLastWord("luffy is still joyboy"),"luffy is still joyboy");
        assertEquals(3,LengthOfLastWord.lengthOfLastWord("    day"),"    day");

        assertEquals(5,LengthOfLastWord.lengthOfLastWordSplit("Hello World"),"Hello World");
        assertEquals(4,LengthOfLastWord.lengthOfLastWordSplit("   fly me   to   the moon  "),"   fly me   to   the moon  ");
        assertEquals(6,LengthOfLastWord.lengthOfLastWordSplit("luffy is still joyboy"),"luffy is still joyboy");
        assertEquals(3,LengthOfLastWord.lengthOfLastWordSplit("    day"),"    day");
    }
}