package org.example.computer

class Rom(dataSet: List<UByte> ) {

    //val readMem = dataSet.toList()
    private val memory = Array<UByte>(4000) {
        i -> if(i < dataSet.size) dataSet[i] else 0.toUByte()
    }

    fun read(address:Int):UByte{
        return memory[address]
    }

    fun write(address: Int, uByte: UByte){
        throw IllegalAccessException("Cannot write to Read Only Memory")
    }

}