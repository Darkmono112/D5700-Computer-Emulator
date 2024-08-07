package org.example.computer.commands

import org.example.computer.Computer

class Invoker(val computer: Computer) {
    private val instructionSet = listOf( Store(),
        Add(),Sub(),Read(),Write(),Jump(),ReadKeyboard(),
        SwitchMemory(),SkipEqual(),SkipNot(),SetA(),SetT(),ReadTimer(),
        ConvertB10(),ByteToAscii(), Draw()
    )
    //shift right for first nib
    // perform an and with an f byte to get second nibble
    fun executeInstruction(first:UByte, second:UByte){
        val funcNum = first.toInt() shr 4
        instructionSet[funcNum].performInstruction(computer,first,second)
    }

}