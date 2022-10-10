package pt.amn.knowledgebase.leetcode.easy.hashtable

import org.junit.Assert.*
import org.junit.Test
import pt.amn.knowledgebase.leetcode.easy.hashtable.LongestPalindrome

class LongestPalindromeTest {

    @Test
    fun `longestPalindromeTest abccccdd`() {
        assertEquals(7, LongestPalindrome("abccccdd").getResult())
    }

    @Test
    fun `longestPalindromeTest a`() {
        assertEquals(1, LongestPalindrome("a").getResult())
    }

    @Test
    fun `longestPalindromeTest aabb`() {
        assertEquals(4, LongestPalindrome("aabb").getResult())
    }

    @Test
    fun `longestPalindromeTest ccc`() {
        assertEquals(3, LongestPalindrome("ccc").getResult())
    }

    @Test
    fun `longestPalindromeTest bananas`() {
        assertEquals(5, LongestPalindrome("bananas").getResult())
    }

    @Test
    fun `longestPalindromeTest abcbe`() {
        assertEquals(3, LongestPalindrome("abcbe").getResult())
    }

    @Test
    fun `longestPalindromeTest abcabcabc`() {
        assertEquals(9, LongestPalindrome("abcabcabc").getResult())
    }

    @Test
    fun `longestPalindromeTest very long string`() {
        assertEquals(983, LongestPalindrome("civilwartestingwhetherthatnaptionoranynartionsoconceivedandsodedicatedcanlongendureWeareqmetonagreatbattlefiemldoftzhatwarWehavecometodedicpateaportionofthatfieldasafinalrestingplaceforthosewhoheregavetheirlivesthatthatnationmightliveItisaltogetherfangandproperthatweshoulddothisButinalargersensewecannotdedicatewecannotconsecratewecannothallowthisgroundThebravelmenlivinganddeadwhostruggledherehaveconsecrateditfaraboveourpoorponwertoaddordetractTgheworldadswfilllittlenotlenorlongrememberwhatwesayherebutitcanneverforgetwhattheydidhereItisforusthelivingrathertobededicatedheretotheulnfinishedworkwhichtheywhofoughtherehavethusfarsonoblyadvancedItisratherforustobeherededicatedtothegreattdafskremainingbeforeusthatfromthesehonoreddeadwetakeincreaseddevotiontothatcauseforwhichtheygavethelastpfullmeasureofdevotionthatweherehighlyresolvethatthesedeadshallnothavediedinvainthatthisnationunsderGodshallhaveanewbirthoffreedomandthatgovernmentofthepeoplebythepeopleforthepeopleshallnotperishfromtheearth").getResult())
    }
}