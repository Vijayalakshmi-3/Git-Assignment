package Assignment_2;

public class _1_InheritedSingletonClass extends _1_SingletonClass{

	public static void main(String[] args) {
		_1_InheritedSingletonClass obj=new _1_InheritedSingletonClass;
		obj.getInstance(); //cannot get instance since singleton class is private with single object
	}

}
