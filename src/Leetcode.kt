fun main(){

    var healthPoints = 89
    val karma = (Math.pow(Math.random(), (110 - healthPoints) / 100.0) * 20 ).toInt()

    val aura = when (karma){
        in 0..5 -> "Red"
        in 6..10 -> "Orange"
        in 11..15 -> "Purple"
        in 16..20 -> "Green"
        else -> "No aura"
    }

    println("Player's aura is $aura")


    ///


    // Aura
    var isBlessed = true
    var isImmortal = false
    var name = "Madrigal"
    var healthStatus = "Is in excellent condition"
    val auraVisible = isBlessed && healthPoints > 50 || isImmortal
    val auraColor = if (auraVisible) "GREEN" else "NONE"
    println(auraColor)

// Player status
    println("(Aura: $auraColor) " +
            "(Blessed: ${if (isBlessed) "YES" else "NO"})")
    println("$name $healthStatus")

    val statusFormatString = "(HP:$healthPoints)(A:$aura) -> $name $healthStatus"
    println(statusFormatString)

    val statusFormatString2 = "(HP)(A) -> D"
    val status = statusFormatString2
        .replace("HP","HP:$healthPoints")
        .replace("A","A:$aura")
        .replace("D","$name $healthStatus")

    println(status)



}