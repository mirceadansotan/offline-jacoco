package com.example.myapplication

import android.util.Log
import org.junit.Assert
import org.junit.Test

import org.junit.Assert.*
import org.junit.runner.RunWith
import org.powermock.api.mockito.PowerMockito
import org.powermock.core.classloader.annotations.PrepareForTest
import org.powermock.modules.junit4.PowerMockRunner
import java.util.*

@RunWith(PowerMockRunner::class)
@PrepareForTest(Foo::class)
class FooTest {

    @Test
    fun m1() {
        val date = Date()
        PowerMockito.whenNew(Date::class.java).withAnyArguments().thenReturn(date)
        val r = Foo().m1()

        assertEquals(date, r)
    }
}