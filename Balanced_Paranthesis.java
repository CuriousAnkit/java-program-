import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Balanced_Paranthesis {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter paranthesis......");
    String str = sc.nextLine();

    sc.close();
    // if(ispar(str)){
    //   System.out.println("Balanced");
    // }
    // else{
    // System.out.println("Not Balanced");
    // }

    boolean a = ispar(str);
    System.out.println(a?"Balanced":"Not Balanced");  // using ternary operator

  }
  static boolean ispar(String x)
    {
        // add your code here
        Deque<Character> stack = new ArrayDeque<>();
        for(int i=0;i<x.length();i++){
            char ch = x.charAt(i);
           if(ch =='('|| ch =='{' || ch == '['){ // ),} or ] cannot come first
               stack.push(ch);
           }
           else{
               if(stack.isEmpty() == true)
               return false;
               else if(isMatching(stack.peek(),ch) == false)
               return false;
               else
               stack.pop();
           }
        }
        
        return stack.isEmpty() == true;
    }
    
    static boolean isMatching(char a, char b){
        return (a == '(' && b == ')')  || (a == '{' && b == '}')  || (a == '[' && b == ']');
    }
}
