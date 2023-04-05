package daonguocphantu;

import java.util.Scanner;
import java.util.Stack;

public class integer {
    public static void main(String[] args) {
        // đảo ngược số nguyên
        Stack<Integer> arr = new Stack<Integer>();
        Scanner sc= new Scanner(System.in);
        int choice;
        do {
            choice=sc.nextInt();
            System.out.println("Nhập số : ");
            Integer n = sc.nextInt();
          arr.push(n);
        }while (choice!=0);
int a =arr.size();
       for(int i=0;i<a;i++){
           System.out.print(arr.pop());
       }
    }
}
