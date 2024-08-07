
import org.example.computer.Computer
import kotlin.test.Test
import kotlin.test.assertEquals

class TestStore {

    @Test
    fun testStore(){
        val computer = Computer(listOf((0x0).toUByte(),(0xFF).toUByte()))
    }


}