//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {

    //Define a variable called hasSteed to track
    //whether the player has acquired one. Give the variable an initial state indicating
    //that the player does not have one yet.


    var hasSteed:Boolean = false

    //For this challenge, add below your hasSteed variable the variables required
    //for the scene at the Unicorn’s Horn, using type inference and assigned values
    //where possible. Add variables to hold values for the name of the pub, the name
    //of the current publican on duty, and how much gold the player has acquired so
    //far.
    //Notice that the Unicorn’s Horn has a menu of drinks the hero can select from.
    //What type might you use to represent the menu?

    val pubName:String = "Unicorn's Horn"

    var publican:String = "Publican"

    var gold:Int = 50

    val menu: List<String> = listOf("mead", "wine", "LaCroix")

    val playerName: String = "Estragon"

    //The hero discovers a magic mirror that shows a player the reflection of their
    //playerName. Using the String type’s magic, transform the playerName
    //string "Estragon" into "nogartsE", a reflection of its value.

    var reflection:String = playerName.reversed()





}
