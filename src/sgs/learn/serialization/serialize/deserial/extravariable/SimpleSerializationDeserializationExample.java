package sgs.learn.serialization.serialize.deserial.extravariable;

import java.io.IOException;
import sgs.learn.serialization.utils.FileReadWriteUtility;

/**
 * Read from the file written with Person class with two variables and read with
 * three variables.
 */
public class SimpleSerializationDeserializationExample {

	private static final String FILE_PATH = "./deserial_extra_variable/SimpleSerializationSameObjectFile.txt";

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		// 1. Comment phoneNumber variable
		// 2. Uncomment below commented lines
		// 3. Run
		// 4. Comment the below code
		// 5. Uncomment phoneNumber variable
		// 6. re-run

//		Person personWrite = new Person("John Doe", "99, Street Ave, Imagine City", 1L);
//		FileReadWriteUtility.createDirectoryIfNotExist(FILE_PATH);
//		FileReadWriteUtility.writeToFile(personWrite, FILE_PATH);

		Person personRead = (Person) FileReadWriteUtility.readFromFile(FILE_PATH);
		System.out.println("Read Object: " + personRead.toString());
		// Read Object: Person [name=John Doe, address=99,
		// Street Ave, Imagine City, phoneNumber=null]
	}

}
