public class ClassStatic implements InterfaceA, InterfaceB, Cloneable {

	public static void main(String[] args) {

		AbstractClassOne classOne = new SubClass();
		classOne.test();
		
	}

	@Override
	public void test() {
		
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException();
	}

	@Override
	public void tested() {
		InterfaceA.super.tested();
	}

}