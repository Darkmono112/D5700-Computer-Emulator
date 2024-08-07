
import org.example.computer.Rom
import org.junit.jupiter.api.assertThrows
import kotlin.test.Test
import kotlin.test.assertEquals

class TestRom {

    private val rom= Rom(listOf(0xF.toUByte()))
    @Test
    fun testInit(){
        //Test init to see if values are added in
        assertEquals(0xF, rom.read(0).toInt())
        assertEquals(0, rom.read(3999).toInt())

    }

    @Test
    fun testException(){
       val exception = assertThrows<IllegalAccessException> { rom.write(456,0.toUByte())}
        assertEquals("Cannot write to Read Only Memory", exception.message)
    }


}