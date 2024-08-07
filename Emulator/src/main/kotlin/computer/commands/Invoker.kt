package org.example.computer.commands

import org.example.computer.Computer

class Invoker(computer: Computer) {

    val instructions = listOf( Store(),
        Add(),Sub(),Read(),Write(),Jump(),ReadKeyboard(),
        SwitchMemory(),SkipEqual(),SkipNot(),SetA(),SetT(),ReadTimer(),
        ConvertB10(),ByteToAscii(), Draw()

    )

    fun executeInstruction(first:UByte, second:UByte){

        



    }

}