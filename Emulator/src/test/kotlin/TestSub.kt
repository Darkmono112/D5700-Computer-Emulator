import org.example.computer.Computer
import kotlin.test.assertEquals
import kotlin.test.Test


class TestSub {
    //0010 0000
    //0001 0000

    @Test
    fun testSub(){
        // val computer:Computer = Computer(listOf((0x).toUByte))
        val computer = Computer(listOf((0x0).toUByte(),(0xF).toUByte(),(0x1).toUByte(),(0xF).toUByte(),(32).toUByte(),(16).toUByte()))
        assertEquals(0xF,computer.generalRegisters[1].readByte()[0].toInt())
        assertEquals(0,computer.generalRegisters[0].readByte()[0].toInt())

    }
}