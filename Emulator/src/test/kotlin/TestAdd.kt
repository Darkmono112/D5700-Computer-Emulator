
import org.example.computer.Computer
import kotlin.test.Test
import kotlin.test.assertEquals

class TestAdd {
//00010000
    //0001 0000
    @Test
    fun testAdd(){
       // val computer:Computer = Computer(listOf((0x).toUByte))
        val computer = Computer(listOf((0x0).toUByte(),(0xF).toUByte(),(0x1).toUByte(),(0xF).toUByte(),(16).toUByte(),(16).toUByte()))
        assertEquals(0xF,computer.generalRegisters[1].readByte()[0].toInt())
        assertEquals(0xF+0xF,computer.generalRegisters[0].readByte()[0].toInt())

    }
}