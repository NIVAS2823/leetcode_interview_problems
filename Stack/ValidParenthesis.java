// 20. Valid Parentheses


// Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

// An input string is valid if:

// Open brackets must be closed by the same type of brackets.
// Open brackets must be closed in the correct order.
// Every close bracket has a corresponding open bracket of the same type.
 

// Example 1:

// Input: s = "()"

// Output: true

// Example 2:

// Input: s = "()[]{}"

// Output: true

// Example 3:

// Input: s = "(]"

// Output: false

// Example 4:

// Input: s = "([])"

// Output: true

 










package Stack;

import java.util.Stack;

public class ValidParenthesis {
    public static boolean isValid(String s) {
        if(s == null || s.length() == 0) {
            return true;
        }
        Stack<Character>stack = new Stack<>();
        for(int i = 0;i<s.length();i++){
            char c = s.charAt(i);
            if(c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else {
                if(stack.isEmpty()) {
                    return false;
                    
                }   
                char top = stack.pop();
                if((c == ')' && top != '(') ||
                   (c == '}' && top != '{') ||
                   (c == ']' && top != '[')) {
                    return false;
                }       
            }
           
        }
         return stack.isEmpty();

    
}
public static void main(String[] args) {
        String s = "()";
        boolean result = isValid(s);
        System.out.println("Is the string valid? " + result);
    }

}