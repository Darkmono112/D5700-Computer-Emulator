package org.example.computer.commands

import org.example.computer.Computer

class Jump:BaseInstruction() {

    override fun performOperation(parts: List<Int>, computer: Computer) {
        computer.programCounter.jump(parts[1])
    }

    override fun splitByte(b1: UByte, b2: UByte): List<Int> {
        val firstNib = b1.toInt() shr 4
        var secondNib = b1.toInt() and 0xF
        secondNib = secondNib shl 8
        var third = b2.toInt()
        third += secondNib

        return listOf(firstNib,third)

    }

    override fun incrementPcount(computer: Computer) {
        return
    }
}