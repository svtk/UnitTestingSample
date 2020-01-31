package mypackage

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class SampleTest {
    @Test
    fun testFoo() {
        assertEquals(
            expected = 42,
            actual = foo(),
            message = "The 'mypackage.foo' function is expected to return 42")
    }
}