package bai1;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class BinaryConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> num = new Stack<Integer>();
        System.out.println("Nhập vào 1 số bất kì: ");
        Integer n = sc.nextInt();
        while (n>0){
            Integer soDu = n%2;
            num.push(soDu);
            n=n/2;
        }
        int a= num.size();
        System.out.println("Hệ nhị phân: ");
        for(int i =0; i<a;i++) {
            System.out.print( num.pop());
        }
    }
}
