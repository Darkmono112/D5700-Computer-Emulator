package org.example.computer.commands

import org.example.computer.Computer

class ReadKeyboard:BaseInstruction() {


    @OptIn(ExperimentalStdlibApi::class)
    override fun performOperation(parts: List<Int>, computer: Computer) {
        println("Input base 16 number (only last two digits will be used")

        val input = readln()
        var numberToWrite  = 0
        if(input.isNotEmpty()){
            try {
                val lastTwo = input.hexToInt().toUByte()
                numberToWrite = lastTwo.toInt() and 0xFF //Only grab the last two digits
            }catch(e: Exception) {
                throw IllegalArgumentException("Input must be an INteger in hex")
            }

        }
        computer.generalRegisters[parts[0]].updateByte(0,numberToWrite.toUByte())

    }

    override fun splitByte(b1: UByte, b2: UByte): List<Int> {
        return listOf(b1.toInt() and 0xF)
    }
}