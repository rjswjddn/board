package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.print("명령어 > ");
            String command = sc.nextLine();
            System.out.println(command);
        }
    }
}