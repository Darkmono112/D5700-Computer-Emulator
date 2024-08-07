
import org.example.computer.Computer
import kotlin.test.Test
import kotlin.test.assertEquals

class TestWrite {

    @Test
    fun testWrite(){
        val computer = Computer(listOf((0x0).toUByte(),(0xF).toUByte(),0x40.toUByte(), 0.toUByte()))
        assertEquals(15, computer.ram.read(0).toInt())
    }

}