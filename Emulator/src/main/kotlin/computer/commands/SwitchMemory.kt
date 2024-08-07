package org.example.computer.commands

import org.example.computer.Computer

class SwitchMemory:BaseInstruction() {

    override fun performOperation(parts: List<Int>, computer: Computer) {
        computer.memory = !computer.memory
    }

    override fun splitByte(b1: UByte, b2: UByte): List<Int> {
        return listOf<Int>(0)
    }
}