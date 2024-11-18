package org.example

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {

//    for (i in 1..5) {
//        //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
//        // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
//        println("i = $i")
//    }
    val rs= getTrafficLightAction("green")

    println(" --> $rs")
}
public fun getTrafficLightAction(trafficLightState: String): String{
    var trafficAction:String = ""
    when(trafficLightState){
        "Red"-> trafficAction = "Stop"
        "Yellow"-> trafficAction ="Slow down"
    }
    return trafficAction
}