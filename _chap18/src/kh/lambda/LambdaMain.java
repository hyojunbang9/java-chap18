package kh.lambda;

import java.util.Scanner;

public class LambdaMain {

	public static void main(String[] args) {
		// 임시 객체 부 = new 자식()
		// 입력 없고, 리턴 없다.
		A a = () -> System.out.println("입력 없고, 리턴 없다."); // 자식 임시 객체 자식이 부모 오버라이딩

		// 부모 추상 메소드를 불러주면 -> 자식의 오버라이딩 함수가 작동된다.
		// 그냥 실행하면 실행 안 되니까.
		a.method();
		System.out.println("-------------------------------");

		// 입력 있고, 리턴 있다.
		D d = (B, b) -> B + b;
		double value = d.methodD(10, 20.5);
		System.out.printf("d.methodD(10, 20.5) = %.2f", value);
		
		// 입력 없고, 리턴 있다.
		/*C c = new C() {
			
			@Override
			public int methodB() {
				Scanner scan = new Scanner(System.in);
				System.out.print("당신의 나이 입력>");
				int age = Integer.parseInt(scan.nextLine());
				return age;
				return 0;
			}
		};*/
		
		C c = () -> {
				Scanner scan = new Scanner(System.in);
				System.out.print("당신의 나이 입력>");
				int age = Integer.parseInt(scan.nextLine());
				return age;
		};
		
		int age = c.methodC();
		System.out.printf("당신의 나이는 %d 살 입니다.\n",age);
		
		
		
		

		System.out.println("The end!");
	}

}
