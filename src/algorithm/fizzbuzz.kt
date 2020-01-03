import java.util.*
 
fun main(args: Array<String>) {
    for(x in 1..100){
    	if(x % 3 == 0){
    		if(x % 5 == 0){
    			println("FizzBuzz")
    		}
    		else {
    			println("Fizz")
    		}
    	}
    	else if(x % 5 == 0) {
    		println("Buzz")
    	}
    	else {
    		println(x)
    	}
    }
}
