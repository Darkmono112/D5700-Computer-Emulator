package org.example.computer.commands

import org.example.computer.Computer

abstract class BaseInstruction(): Instruction {



    override fun performInstruction(computer:Computer, instruction1:UByte,instruction2: UByte) {
        var splitBytes = splitByte(instruction1,instruction2)
        performOperation(splitBytes, computer)
        incrementPcount(computer)
    }

    open fun splitByte(b1:UByte, b2:UByte): List<Int>{

        val firstNib = b1.toInt() shr 4
        val secondNib = b1.toInt() and 0xF
        val thirdNib = b1.toInt() shr 4
        val fourthNib = b1.toInt() and 0xF

        return listOf(firstNib,secondNib,thirdNib,fourthNib)
    }

    abstract fun performOperation(parts:List<Int>, computer: Computer)

    open fun incrementPcount(computer:Computer){
        computer.programCounter.increment()
    }

}