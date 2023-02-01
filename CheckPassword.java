
import java.util.*;  
import java.lang.String;  
import java.lang.Character;  

public class CheckPassword {  
   public static void main(String[] args) {  
      Scanner sc = new Scanner(System.in);  
      System.out.print("Enter your password: ");  
      String password = sc.next();  
      if (goodPass(password)) {  
         System.out.println("True");  
      } else {  
         System.out.println("False");  
      }  
   }  

   public static boolean goodPass(String password) {  
      if (password.length() < 8) {   
         return false;  
      } else {      
         char char1;  
         int count = 1;   
         for (int i = 0; i < password.length() - 1; i++) {  
            char1 = password.charAt(i);  
            if (!Character.isLetterOrDigit(char1)) {          
               return false;  
            } else if (Character.isDigit(char1)) {  
               count++;  
               if (count < 2)   {     
                  return false;  
               }     
            }  
         }  
      }  
      return true;  
   }  
}