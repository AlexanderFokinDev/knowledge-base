package pt.amn.knowledgebase.research

import org.junit.Test
import org.junit.Assert.*

class ThreadsResearchTest {

    @Test
    fun threadTest1() {

        val state = State()

        val t1 = Thread {
            state.x = 1
            println(state.y)
        }

        val t2 = Thread {
            state.y = 1
            println(state.x)
        }

        // Может быть любой результат, из-за кэшей
        // Используем volatile
        t1.start()
        t2.start()
        t1.join()
        t2.join()

        assertTrue(true)
    }

    class State(
        var x: Int = 0,
        var y: Int = 0
    )
}