
public interface InterfaceB {

	public void test();
	
	public default void tested() {
		System.out.println("A");
	}
	
}
