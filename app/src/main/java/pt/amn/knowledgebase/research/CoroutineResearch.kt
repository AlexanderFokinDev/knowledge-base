package pt.amn.knowledgebase.research

import kotlinx.coroutines.*
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.flow.flatMapMerge
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.isActive

class CoroutineResearch() {

    private val scope = CoroutineScope(SupervisorJob())

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

    fun testFlowWithDelay() {

        scope.launch {
            someFlow()
                .flatMapMerge {
                    helperFlow(it)
                }
                .collect {
                    println(it)
                }
        }
    }

}