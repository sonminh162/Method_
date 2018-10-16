package com.company;

import java.util.Scanner;

public class Main {

    public static int count(String text){
        return text.length();
    }

    public static void main(String[] args) {
	// write your code here
        String text;
        Scanner scanner = new Scanner(System.in);
        System.out.println("xin moi nhap vao chuoi:");
        text = scanner.next();
        System.out.println(count(text));



    }
}
