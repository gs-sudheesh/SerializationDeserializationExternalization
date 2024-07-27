package sgs.learn.serialization.serialize.change.serialid;

import java.io.IOException;
import sgs.learn.serialization.utils.FileReadWriteUtility;

/**
 * Read from the file written with Person class with serial number as 1000L.
 */
public class SimpleSerializationDeserializationExample {

	private static final String FILE_PATH = "./change_serial_scenario/ModifySerialTest.txt";

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		// 1. Change the serial number to 1000L
		// 2. Uncomment below commented lines
		// 3. Run
		// 4. Comment the below code
		// 5. Change the serial number to 2000L
		// 6. re-run

//		 Person personWrite = new Person("John Doe", "99, Street Ave, Imagine City");
//		 FileReadWriteUtility.createDirectoryIfNotExist(FILE_PATH);
//		 FileReadWriteUtility.writeToFile(personWrite, FILE_PATH);

		Person personRead = (Person) FileReadWriteUtility.readFromFile(FILE_PATH);
		System.out.println("Read Object: " + personRead.toString());

		/*
		 * Exception in thread "main" java.io.InvalidClassException:
		 * sgs.learn.serialization.serialize.change.serialid.Person; local class
		 * incompatible: stream classdesc serialVersionUID = 1000, local class
		 * serialVersionUID = 2000 at
		 * java.base/java.io.ObjectStreamClass.initNonProxy(ObjectStreamClass.java:598)
		 * at
		 * java.base/java.io.ObjectInputStream.readNonProxyDesc(ObjectInputStream.java:
		 * 2078) at
		 * java.base/java.io.ObjectInputStream.readClassDesc(ObjectInputStream.java:
		 * 1927) at
		 * java.base/java.io.ObjectInputStream.readOrdinaryObject(ObjectInputStream.java
		 * :2252) at
		 * java.base/java.io.ObjectInputStream.readObject0(ObjectInputStream.java:1762)
		 * at java.base/java.io.ObjectInputStream.readObject(ObjectInputStream.java:540)
		 * at java.base/java.io.ObjectInputStream.readObject(ObjectInputStream.java:498)
		 * at sgs.learn.serialization.utils.FileReadWriteUtility.readFromFile(
		 * FileReadWriteUtility.java:16) at
		 * sgs.learn.serialization.serialize.change.serialid.
		 * SimpleSerializationDeserializationExample.main(
		 * SimpleSerializationDeserializationExample.java:28)
		 */

	}

}
