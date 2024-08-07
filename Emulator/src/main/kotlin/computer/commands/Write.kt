package org.example.computer.commands

import org.example.computer.Computer

class Write:BaseInstruction() {
    override fun performOperation(parts: List<Int>, computer: Computer) {

        if(!computer.memory){
            val value =  computer.generalRegisters[parts[1]].readByte()[0]
            computer.ram.write(parts[2],value)

        }else{
            val value =  computer.generalRegisters[parts[1]].readByte()[0]
            computer.rom.write(parts[2],value)
        }
    }

    override fun splitByte(b1: UByte, b2: UByte): List<Int> {
        val first = b1.toInt() shr 4
        val second = b1.toInt() and 0xF
        val third = b2.toInt()
        return listOf(first,second,third)

    }

}