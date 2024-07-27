package sgs.learn.serialization.serialize.sameObjectdefDiffPackage.individual;

import java.io.Serializable;


public class Person implements Serializable {

	private static final long serialVersionUID = 1L;
	private String name;
	private String address;
	
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
	
	
}
