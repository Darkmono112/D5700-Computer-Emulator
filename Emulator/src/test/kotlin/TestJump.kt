
import org.example.computer.Computer
import kotlin.test.Test
import kotlin.test.assertEquals

class TestJump {
    //0101 0000 0110 1000
    //
    @Test
    fun testJump(){

        val computer = Computer(listOf((0x50).toUByte(),  0x68.toUByte()))
        println(0x68.toString(2))
        assertEquals(0x68, computer.programCounter.currentAddress)

    }


}