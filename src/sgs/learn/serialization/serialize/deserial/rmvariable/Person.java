package sgs.learn.serialization.serialize.deserial.rmvariable;

import java.io.Serializable;


public class Person implements Serializable {

	private static final long serialVersionUID = 1L;
	private String name;
	private String address;
//	private Long phoneNumber;
	
	public Person(String name, String address, Long phoneNumber) {
		super();
		this.name = name;
		this.address = address;
//		this.phoneNumber = phoneNumber;
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

	/**
	 * @return the phoneNumber
	 */
//	public Long getPhoneNumber() {
//		return phoneNumber;
//	}

	/**
	 * @param phoneNumber the phoneNumber to set
	 */
//	public void setPhoneNumber(Long phoneNumber) {
//		this.phoneNumber = phoneNumber;
//	}

//	@Override
//	public String toString() {
//		return String.format("Person [name=%s, address=%s, phoneNumber=%s]", name, address, phoneNumber);
//	}
	
	@Override
	public String toString() {
		return String.format("Person [name=%s, address=%s]", name, address);
	}
	
}
