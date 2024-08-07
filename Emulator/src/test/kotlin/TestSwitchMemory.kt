
import org.example.computer.Computer
import kotlin.test.Test
import kotlin.test.assertTrue

class TestSwitchMemory {
    //0111 0000 0000 0000
    @Test
    fun testSwitch(){
        val computer = Computer(listOf(0x70.toUByte(), 0.toUByte()))

        assertTrue { computer.memory }

    }

}