package kiemtrangoac;

import java.util.Stack;

public class Check {
    public static boolean checkBrackets(String s){
        Stack<Character>stack=new Stack<Character>();
        for(int i =0;i<s.length();i++){
            char s1 = s.charAt(i);
            if(s1 == '(' || s1 =='{' || s1=='['){
                stack.push(s1);
            }
            else if (s1 ==')') {
                if(stack.isEmpty() || stack.pop() != '('){
                    return false;
                }
                
            } else if (s1 == '}') {
                if(stack.isEmpty() || stack.pop() != '{'){
                    return false;
                }
            } else if (s1 == ']') {
                if(stack.isEmpty() || stack.pop() != ']'){
                    return false;
                }

            }
        }
        return stack.isEmpty();
    }
}
