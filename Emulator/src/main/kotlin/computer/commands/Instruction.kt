package org.example.computer.commands

import org.example.computer.Computer

interface Instruction {
    fun performInstruction(computer: Computer, b1:UByte, b2: UByte)
}