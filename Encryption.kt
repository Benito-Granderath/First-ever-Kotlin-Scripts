fun main(args: Array<String>) {
    val meinArray: String = "Yeeeeeeah!"
    var verschluesselt = meinArray.toCharArray()
    var entschlüsselt = meinArray.toCharArray()
    val EntschlüsselCode = false

    for (i in meinArray.indices) {
        verschluesselt[i] = meinArray[i] + 3
    }

    for (i in verschluesselt)
        print(i)

    for(i in verschluesselt.indices)
        entschlüsselt[i] = verschluesselt[i] - 3

    if (EntschlüsselCode){
        println()
        println(entschlüsselt)
    }
}