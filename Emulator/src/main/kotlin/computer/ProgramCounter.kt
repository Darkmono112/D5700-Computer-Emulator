package org.example.computer

class ProgramCounter() {

    var currentAddress = 0

    fun increment(){
        currentAddress += 2
    }

    fun jump(address:Int){
        if(address % 2 != 0) throw IllegalArgumentException("Address must be even increments of 2")
        currentAddress = address
    }
}