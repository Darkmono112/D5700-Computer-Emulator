package org.example.computer.commands

import org.example.computer.Computer

abstract class BaseInstruction(): Instruction {


    override fun performInstruction(computer:Computer, instruction1:UByte,instruction2: UByte) {
        splitByte()
        performOperation()
        incrementPcount(computer)
    }

    open fun splitByte(){
        return
    }
    abstract fun performOperation()

    open fun incrementPcount(computer:Computer){
        computer.programCounter.increment()
    }

}