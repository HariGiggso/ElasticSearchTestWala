import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.Serializable;

public class MarkerClass implements Serializable, Cloneable, Externalizable {

	int id;
	String name;

	public MarkerClass(int id, String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		
	}

	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		
	}
}
