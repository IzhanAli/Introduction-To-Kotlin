import java.util.*;
/**
 *This is the main function
 */
fun main(args: Array<String>) {
    
    //Taking input from user using readLine() function
    //We can also use Scanner class after importing from java.util package
    
    //!! for null safety
    
    println("Enter your name")
    var name = readLine()!!
    var read = Scanner(System.`in`)
    
    println("Enter your age")
  	var age = read.nextInt()
    
}