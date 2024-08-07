package org.example.computer.commands

import org.example.computer.Computer

class Read:BaseInstruction() {


    override fun performOperation(parts: List<Int>, computer: Computer) {

        if(!computer.memory){
            val value = computer.ram.read(parts[2])
            computer.generalRegisters[parts[1]].updateByte(0,value)
        }else{
            val value = computer.rom.read(parts[2])
            computer.generalRegisters[parts[1]].updateByte(0,value)
        }


    }

    override fun splitByte(b1: UByte, b2: UByte): List<Int> {
        val first = b1.toInt() shr 4
        val second = b1.toInt() and 0xF
        val third = b2.toInt()
        return listOf(first,second,third)
    }
}