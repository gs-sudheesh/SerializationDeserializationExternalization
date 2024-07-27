package sgs.learn.serialization.externalization.sameObjectdefDiffPackage.person;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class Person implements Externalizable {

	private static final long serialVersionUID = 1L;
	private String name;
	private String address;
	
	public Person() {
		super();
	}

	public Person(String name, String address) {
		super();
		this.name = name;
		this.address = address;
	}
	
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}
	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return String.format("Person [name=%s, address=%s]", name, address);
	}
	
	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		out.writeUTF(name);
		out.writeUTF(address);
	}

	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		this.name = in.readUTF();
		this.address = in.readUTF();
	}
	
}
