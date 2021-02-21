package com.example.mylibrary

import android.util.Log
import org.junit.Test

import org.junit.Assert.*
import org.junit.runner.RunWith
import org.powermock.api.mockito.PowerMockito
import org.powermock.core.classloader.annotations.PrepareForTest
import org.powermock.modules.junit4.PowerMockRunner
import java.util.*

@RunWith(PowerMockRunner::class)
@PrepareForTest(Foo2::class)
class Foo2Test {

    @Test
    fun m2() {
        val date = Date()
        PowerMockito.whenNew(Date::class.java).withAnyArguments().thenReturn(date)
        val r = Foo2().m2()

        assertEquals(date, r)
    }
}