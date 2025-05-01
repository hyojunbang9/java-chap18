package kh.cunsumer;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

public class ConsumerMain {

	public static void main(String[] args) {
		// 인터페이스 -> 구현클래스 -> 구현 객체 -> 부 자 관계 -> 부.추상 메소드
		// Consumer X -> x -> 구현 객체(부자관계) -> 부.추상 메소드

		Consumer<String> con = t -> System.out.printf("%s님 환영합니다.\n", t);
		con.accept("홍길동");
		con.accept("구길동");
		con.accept("저길동");

		System.out.println("------------------------------------------");

		Consumer<Integer> mt = m -> {
			for (int i = 1; i <= 9; i++) {
				System.out.printf("%d x %d = %d\n", m, i, m * i);
			}
		};
		mt.accept(5);

		System.out.println("------------------------------------------");

		IntConsumer icon = a -> {
			for (int i = 1; i <= 9; i++) {
				System.out.printf("%d x %d = %d\n", a, i, a * i);
			}
		};
		icon.accept(7);

		System.out.println("------------------------------------------");

		BiConsumer<String, Integer> bicon = (name, age) -> System.out.printf("%s 님의 나이는 %d살 입니다.\n", name, age);
		bicon.accept("이호준", 0);
		bicon.accept("박창수", 1);

		System.out.println("The end");
	}
}
