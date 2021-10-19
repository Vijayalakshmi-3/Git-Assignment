package Assignment_2;

public class _4_UsingAbstractMethod extends _4_AbstractClass{
	int add(int a, int b) {
		return a+b;
	}
	public static void main(String[] args) {
		_4_UsingAbstractMethod abs= new _4_UsingAbstractMethod();
		System.out.println(abs.add(10, 20));
	}

}
