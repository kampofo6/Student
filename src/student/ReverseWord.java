
package student;
import java.util.Scanner; 

public class ReverseWord {
    public static void main(String[] args){
    
    Scanner scan = new Scanner(System.in); 
    
    System.out.println("Enter a Word");
    
    String userInput = scan.nextLine();
    
    char[] myLetters = new char[userInput.length()];
    
    for(int i = 0; i < myLetters.length; i++)
    {
        myLetters[i]= userInput.charAt(i);
        System.out.print(myLetters[i]);
    }
      for(int i = myLetters.length - 1; i >= 0; i--)
    {
        System.out.print(myLetters[i]);
    }
    }
    
   
    
    
}
