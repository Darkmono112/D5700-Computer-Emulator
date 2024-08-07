
import org.example.computer.Computer
import kotlin.test.Test
import kotlin.test.assertEquals


class TestRead {
    //0100 0000 0000 0000 write to mem
    //0011 0001 0000 0000 read from mem and write to r1
    //
    @Test
    fun testRead(){
        val computer = Computer(listOf((0x0).toUByte(),(0xF).toUByte(),0x40.toUByte(), 0.toUByte(),0x31.toUByte(),0.toUByte() ))

        assertEquals(15, computer.generalRegisters[1].readByte()[0].toInt())


    }


}