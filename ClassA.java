
public class ClassA implements Comparable<ClassA> {

	private String a;
	
	private String b;

	public String getA() {
		return a;
	}

	public void setA(String a) {
		this.a = a;
	}

	public String getB() {
		return b;
	}

	public void setB(String b) {
		this.b = b;
	}

	@Override
	public String toString() {
		return "ClassA [a=" + a + ", b=" + b + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = result * prime + ((a == null) ? 0 : a.hashCode()); 
		result = result * prime + ((b== null) ? 0 : b.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ClassA other = (ClassA) obj;
		if (a == null) {
			if (other.a != null)
				return false;
		} else if (!a.equals(other.a))
			return false;
		if (b == null) {
			if (other.b != null)
				return false;
		} else if (!b.equals(other.b))
			return false;
		return true;
	}

	@Override
	public int compareTo(ClassA o) {
		if(this.getA().toCharArray()[0] < o.getA().toCharArray()[0]) {
			return this.getA().toCharArray()[0];
		} else {
			return o.getA().toCharArray()[0];
		}
	}
	
	
}

