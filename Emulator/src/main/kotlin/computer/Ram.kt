package org.example.computer

class Ram {

    //Creates an array of 4000 bytes, the address is in terms of numbers
    private val memory = Array<UByte>(4000) { _ -> 0.toUByte()}

    fun read(address:Int):UByte{
        return memory[address]
    }

    fun write(address: Int, newByte: UByte){
        memory[address] = newByte
    }


}