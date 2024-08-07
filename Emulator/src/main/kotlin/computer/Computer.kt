package org.example.computer

import org.example.Console

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
    val cpu: Cpu = Cpu()
    val timer: DTimer = DTimer()
    val address: Register = Register(1)
    val memory = false  // false for ram, true for ROM
    val ram: Ram = Ram()
    val rom: Rom = Rom(romData)
    val console = Console()
    val screen = Screen()
    val programCounter = ProgramCounter()

}