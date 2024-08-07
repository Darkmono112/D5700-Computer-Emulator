package org.example.computer

class Register(size:Int) {

    private val bytes = mutableListOf<UByte>()
    init {
        for(i in 0..size){
            bytes.add((0).toUByte())
        }
    }

    fun readByte():List<UByte>{
        return bytes
    }
    fun updateByte(position:Int, nb:UByte){
        bytes[position] = nb
    }

}