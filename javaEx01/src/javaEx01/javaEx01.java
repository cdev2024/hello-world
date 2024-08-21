package javaEx01;

import java.util.Scanner;

public class javaEx01 {

	public static void main(String[] args) {
		// 콘솔 출력
		System.out.println("Hello, Java!");      // 줄바꿈 o
		System.out.print("Enter yout name: ");   // 줄바꿈 x
		
		
		// 콘솔 입력
		Scanner sc = new Scanner(System.in);
		/*
		String name = sc.nextLine(); // nextInt(), nextDouble()
		
		System.out.println("Welcome, " + name + "!");
		*/
		
		// 변수 : 데이터 저장하는 메모리 공간. 선언과 초기화
		// 데이터 타입
		// 정수형
		int age =24;
		long population = 89000000000000L;
		
		// 실수형
		float weight = 70.5f;
		double height = 169.4;
		
		// 문자형
		char ch = '3';
		
		// 논리형
		boolean isStudent = true; // true/false
		
		//출력
		System.out.println("Age: " + age);
		
		// 명시적 형 변환(타입 캐스팅): 큰 타입에서 작은 타입으로 수동 변환
		double pi = 3.14;
		int truncatedPi = (int) pi;
		
		System.out.println("pi: "+ pi+", truncatedPi: " + truncatedPi);
		
		// 연산자
		// 산술연산자 : +, -, *, /, %
		// 비교연산자 : ==, !=, < , >, <=, >=
		// 논리연산자 : &&, ||, !
		
		// 수를 입력 받아 홀수 인지 짝수인지 판별하는 프로그램
		System.out.print("Enter number: ");
		int num = sc.nextInt();
		
		if (num%2==0) {
			System.out.println(num + " is an even number.");
		} else {
			System.out.println(num + " is an odd number.");
		}
	}

}
