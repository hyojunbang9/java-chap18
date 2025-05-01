package kh.function;

import java.util.function.Function;

public class FunctionMain {

	public static void main(String[] args) {
		// Function<T,R> => 리턴 값은 R, 추상 메소드는 apply(T t) 구조

		String name = "차기훈";

		Function<String, Integer> func = t -> t.length();
		int length = func.apply("차기훈");

		System.out.printf("%s 님의 리턴 문자열 길이는 %d이다.", name, length);

		System.out.println("끝.");
	}

}
