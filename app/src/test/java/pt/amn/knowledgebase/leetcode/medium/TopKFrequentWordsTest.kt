package pt.amn.knowledgebase.leetcode.medium

import org.junit.Assert.*
import org.junit.Test

class TopKFrequentWordsTest {

    @Test
    fun topKFrequentWordsTest1() {
        assertArrayEquals(
            listOf("i", "love").toTypedArray(),
            TopKFrequentWords(
                arrayOf("i", "love", "leetcode", "i", "love", "coding"),
                2
            ).getResult().toTypedArray()
        )
    }

    @Test
    fun topKFrequentWordsTest2() {
        assertArrayEquals(
            listOf("the","is","sunny","day").toTypedArray(),
            TopKFrequentWords(
                arrayOf("the","day","is","sunny","the","the","the","sunny","is","is"),
                4
            ).getResult().toTypedArray()
        )
    }

    @Test
    fun topKFrequentWordsTest3() {
        assertArrayEquals(
            listOf("is","the","sunny","day").toTypedArray(),
            TopKFrequentWords(
                arrayOf("the","day","is","is","sunny","the","the","the","sunny","is","is"),
                4
            ).getResult().toTypedArray()
        )
    }
}