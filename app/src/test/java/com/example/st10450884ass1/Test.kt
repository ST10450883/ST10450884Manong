package com.example.st10450884ass1

import org.junit.Assert.*
import org.junit.Test

class MyUnitTest {

    @Test
    fun testWhenStatement() {
        val result = when (25) {
            96 -> "Queen Elizabeth II was famous because of the reigning British monarch; she has been the longest-reigning monarch since " +
                    "ascended to the throne in 1952 surpassing Queen Victoria's record in 2015."

            78 -> "Mahatma Gandi was famous for his nonviolent resistance. He is renowned influential leader known for his philosophy of nonviolent " +
                    "resistance played a pivotal role in India's independence movement against British rule."

            32 -> "Alexander the Great was famous for his military tactics and strategy. He was a brilliant military strategist, he utilized innovative tactics" +
                    " and combined arms warfare including infantry, cavalry, and siege engines to defeat numerically superior forces."

            else -> "Nobody famous known to me died at this age"
        }

        assertEquals("Nobody famous known to me died at this age", result)
    }
}


