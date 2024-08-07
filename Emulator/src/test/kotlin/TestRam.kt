
import org.example.computer.Ram
import org.junit.jupiter.api.assertThrows

import kotlin.test.Test
import kotlin.test.expect
import kotlin.test.assertEquals

class TestRam {

    @Test
    fun testRamGeneration(){
        val ram = Ram()
        assertEquals(0, ram.read(3999).toInt())
        assertEquals(0 , ram.read(0).toInt())
    }

    @Test
    fun testRamWrite(){
        val ram = Ram()
        assertEquals(0, ram.read(456).toInt())
        ram.write(456,0xF.toUByte())
        assertEquals(0xF,ram.read(456).toInt())
    }



}