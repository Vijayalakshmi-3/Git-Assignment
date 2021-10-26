package IntermediateOopsAssignment;

public class _1_InheritedSingletonClass {
// would not be able to inherit singleton class to other class
//public class _1_InheritedSingletonClass extends _1_SingletonClass{
//cannot inherit singleton class because constructors are private
	public static void main(String[] args) {
		_1_SingletonClass obj = _1_SingletonClass.getInstance();
		System.out.println(obj.name); // cannot get instance since singleton class is private with single object
	}

}
