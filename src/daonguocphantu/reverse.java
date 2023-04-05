package daonguocphantu;

import java.util.Scanner;
import java.util.Stack;

public class reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<String> array = new Stack<String>();
        System.out.println("Nhập vào chuỗi: ");
        String arr  = sc.nextLine();
        for(int i =0; i<arr.length();i++){
            array.push(arr.charAt(i)+"");
        }
        System.out.println("chuỗi đảo ngược:");
        for(int i=0;i<arr.length();i++){
            System.out.print(array.pop());
        }

    }
}
