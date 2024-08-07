
import org.example.computer.Computer
import kotlin.test.Test
import kotlin.test.assertEquals

class TestStore {

    @Test
    fun testStore(){
        val computer = Computer(listOf((0x0).toUByte(),(0xF).toUByte()))
        assertEquals(15, computer.generalRegisters[0].readByte()[0].toInt())
    }


}