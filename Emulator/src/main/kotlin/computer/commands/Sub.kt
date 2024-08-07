package org.example.computer.commands

import org.example.computer.Computer

class Sub:BaseInstruction() {
    override fun performOperation(parts: List<Int>, computer: Computer) {
        val result = computer.generalRegisters[parts[2]].readByte()[0].toInt() - computer.generalRegisters[parts[1]].readByte()[0].toInt()
        computer.generalRegisters[parts[3]].updateByte(0,result.toUByte())
    }


}