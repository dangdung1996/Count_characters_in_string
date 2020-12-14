package com.codegym;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập vào chuỗi:");
        String s = sc.next();
        System.out.println("nhập vào kí tự cần kiểm tra: ");
        char c = sc.next().charAt(0);

        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == c) {
                count ++;
            }
        }
        System.out.print("số lần xuất hiện kí tự " + c + " trong chuỗi "+ s + " là : "+ count);
    }
}
