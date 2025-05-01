package kh.predicate;

import java.util.function.Predicate;

public class PredicateMain {

	public static void main(String[] args) {
		// Predicate<T> => boolean test(T t) : 추상 메소드
		Predicate<String> pre = t -> {
			boolean flag = false;
			try {
				Integer.parseInt(t);
				flag = true;
			} catch (NumberFormatException e) {
				flag = false;
			} catch (Exception e) {
				flag = false;
			}
			return flag;
		};
		boolean flag = pre.test("123213");
		System.out.printf("%s\n", (flag == true) ? "숫자로 변환 됩니다." : "숫자로 변환 안 됩니다.");

		System.out.println("한 큐에 쓰리 큐");
	}

}
