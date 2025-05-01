package kh.lambda;

public class InstanceLambdaMain {

	public static void main(String[] args) {
		// 람다식인데, 아까는 함수형 인터페이스를 이용했고,
		// 지금은 인스턴스 메소드를 이용 (그 중에 sysout.println 을 사용)

		E e = f -> System.out.println(f);
		E e2 = System.out::println;

		e.methodE(10);
		e2.methodE(100);

		System.out.println("------------------");
		A a = () -> Bobject.bcd();
		//이걸 이거로 어떻게 바꾸냐고 이게 ㅁㄴㅇㄴㅁㅇㄴㅁㅇㄴㅁ쉽냐고
		A a2 = Bobject::bcd;
		a.method();

		ATest atest = (b, k) -> b.bcd(k);
		//위에가 어떻게 이게 되냐고
		ATest atest2 = B::bcd;
		
		atest.abc(new B(), 10);
		atest2.abc(new B(), 20);
		
		System.out.println("이게 끝 맞냐고 ㅋㅋㅋ");
	}

}
