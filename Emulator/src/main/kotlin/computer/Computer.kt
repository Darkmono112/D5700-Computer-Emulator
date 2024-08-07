package org.example.computer

import org.example.Console
import org.example.computer.commands.Invoker

class Computer(romData:List<UByte>) {
/*
+programCounter: Register
+timer: Timer
+address: Register
+memory:boolean
+ram: Ram
+rom:Rom
-registers: List<Registers>[8]
+display:display
+invoker:Invoker
+console:Console
 */
    //TEMP while we set up the instructions


    val cpu: Cpu = Cpu()
    val timer: DTimer = DTimer()
    val address: Register = Register(1)
    var memory = false  // false for ram, true for ROM
    val ram: Ram = Ram()
    val rom: Rom = Rom(romData)
    val console = Console()
    val screen = Screen()
    val programCounter = ProgramCounter()
    private val invoker = Invoker(this)

    //Read only list of our 8 registers
    val generalRegisters = buildList<Register>(8){
        for ( i in 0..8) add(Register(1))
    }

    fun invokeInstruction(b1:UByte,b2:UByte){
        invoker.executeInstruction(b1,b2)
    }

    init {
        for(i in 0..romData.size-1 step 2){
            invoker.executeInstruction(romData[i],romData[i+1])
        }

    }

}