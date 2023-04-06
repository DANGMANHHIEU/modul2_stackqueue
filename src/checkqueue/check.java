package checkqueue;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class  check {
    public static boolean checkString(String s){
        String s1 = s.toLowerCase();
        Queue<Character>queue=new LinkedList<>();
        Stack<Character>stack=new Stack<>();
        for(int i =0; i<s1.length();i++){
            queue.offer(s1.charAt(i));
            stack.push(s1.charAt(i));
        }

        while (!queue.isEmpty() && !stack.isEmpty()){
            if(queue.poll()!=stack.pop()){
                return false;
            }
        }
        return true;
    }

        }



