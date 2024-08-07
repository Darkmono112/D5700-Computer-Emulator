package org.example.computer.commands

import org.example.computer.Computer

class Store:BaseInstruction() {
    override fun performOperation(parts: List<Int>, computer: Computer) {
        computer.generalRegisters[parts[1]].updateByte(0,parts[2].toUByte())
    }
    override fun splitByte(b1: UByte, b2: UByte): List<Int> {
        val firstNib = b1.toInt() shr 4
        val secondNib = b1.toInt() and 0xF
        val byteToStore = b2.toInt()
        return listOf(firstNib,secondNib,byteToStore)

    }
}