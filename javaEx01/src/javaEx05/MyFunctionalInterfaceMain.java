package javaEx05;

public class MyFunctionalInterfaceMain {

	public static void main(String[] args) {
		//람다식 정의 (매개변수 없고, 리턴값도 없는)
		MyFunctionalInterface f = (x, y) -> {
			return x+y;
		};
		
		// 메서드 호출 
		System.out.println(f.method(10, 5));
	}

}
