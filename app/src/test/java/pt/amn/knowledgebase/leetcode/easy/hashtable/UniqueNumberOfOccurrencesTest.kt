    package pt.amn.knowledgebase.leetcode.easy.hashtable

    import org.junit.Assert.*
    import org.junit.Test

    class UniqueNumberOfOccurrencesTest {

        @Test
        fun uniqueNumberOfOccurrencesTest1() {
            assertEquals(
                true,
                UniqueNumberOfOccurrences(intArrayOf(1, 2, 2, 1, 1, 3)).getResult())
        }

        @Test
        fun uniqueNumberOfOccurrencesTest2() {
            assertEquals(false, UniqueNumberOfOccurrences(intArrayOf(1, 2)).getResult())
        }

        @Test
        fun uniqueNumberOfOccurrencesTest3() {
            assertEquals(
                true,
                UniqueNumberOfOccurrences(intArrayOf(-3, 0, 1, -3, 1, 1, 1, -3, 10, 0)).getResult()
            )
        }
    }