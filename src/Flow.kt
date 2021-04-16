import java.util.stream.IntStream.range

fun main() {
    oddNumbers()

    println( countCharacters("sara","sindet","Nashipai","lovelace","AkiraChix"))

    println(serveDrink(5))
    println(serveDrink(16))
    println(serveDrink(23))

    multiples()

}
fun oddNumbers(){
    for (i in range(1,100))
        if(i%2!==0) {
            println(i)
        }
}
fun countCharacters(name1:String,name2:String,name3:String,name4:String,name5:String):Int{
var namesArray= arrayOf(name1,name2,name3,name4,name5)
    var moreThanFiveCharacterName=0;
    namesArray.forEach{name->
        if(name.length>5){
            moreThanFiveCharacterName++;
    }
        }
return moreThanFiveCharacterName

}
fun serveDrink(age:Int):String{
    if(age<6){
      return  "Serve Milk,Enjoy"
    }else if(age>=6 && age<15){
        return "Serve a Bottle of Fanta,Enjoy"
    }else{
        return "Serve Cococola,Enjoy"
    }


}
fun multiples(){
    for (i in range(1,100))
            if(i%3==0 && i%5==0) {
                println("FizzBuzz")
            }
                else if (i%3==0) {

                    println("Fizz")
                }
                    else if (i%5==0 ){
                      println("Buzz")

                    }else{
                        println(i)
            }

                }










