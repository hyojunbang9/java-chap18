package kh.lambda;

public interface A {
	// 입력 없고, 리턴 없다.
	public abstract void method();
}

interface D {
	// 입력 있고, 리턴 있다.
	public abstract double methodD(int B, double b);

}

interface C {
	// 입력 있고, 리턴 있다.
	int methodC();
}

interface E {
	// 입력 있고, 리턴 없다
	void methodE(int F);
}
