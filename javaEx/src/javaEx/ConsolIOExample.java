package javaEx;

import java.util.Scanner;

public class ConsolIOExample {
    public static void main(String[] args) {
        // 콘솔 출력
        System.out.println("Hello, Java!");
        System.out.print("Enter your name: ");

        // 콘솔 입력
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        System.out.println("Welcome, " + name + "!");
    }
}
