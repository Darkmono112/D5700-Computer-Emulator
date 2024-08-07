package org.example.computer.commands

import org.example.computer.Computer

interface Instruction {
    fun performInstruction(computer: Computer, instruction:UByte)
}