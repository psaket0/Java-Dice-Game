package dicegame;
import java.util.Scanner;
import java.util.Random;
import java.util.*;

public class DiceGame {

    
    public static void main(String[] args) {
        
        
 String input = "";
 System.out.println("Welcome to my app!");
   

do
{
  

   Scanner kb = new Scanner(System.in);
    
   Random rand = new Random(); 
      int upperbound = 6;
      int lowerbound = 1;
      
      int die1 = rand.nextInt(lowerbound, upperbound);
      int die2 = rand.nextInt(lowerbound, upperbound);
      int total; 
      total = die1+ die2;
      System.out.println(die1);
      System.out.println(die2);
    
    if (total == 12){
        System.out.println("Boxcars!");
    }
    if (total == 2){
        System.out.println("Snake eyes!");
    }
    
    System.out.print("roll the dice? (y/n)");
    input = kb.next();
    

} 
while(input.equalsIgnoreCase("y") || input.equalsIgnoreCase("Y"));
        

        System.out.println("Thanks for using the app!");
        
    }
    
}
