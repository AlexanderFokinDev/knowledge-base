package pt.amn.knowledgebase.research

import kotlinx.coroutines.currentCoroutineContext
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.*
import kotlinx.coroutines.isActive
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.test.runBlockingTest
import org.junit.Assert.*
import org.junit.Test

class CoroutinesAndFlowTest {

    @Test
    fun testFlowWithDelay() = runBlockingTest {

        someFlow()
            .flatMapMerge {
                //.flatMapLatest {
                //.flatMapConcat {
                helperFlow(it)
            }
            .collect {
                println(it)
            }

        assertTrue(true)

    }

    private fun someFlow() = flow {
        emit("1")
        delay(3000)
        emit("2")
        delay(3000)
        emit("3")
    }

    fun helperFlow(s: String) = flow {
        while (currentCoroutineContext().isActive) {
            emit(s)
            delay(1000)
        }
    }


}