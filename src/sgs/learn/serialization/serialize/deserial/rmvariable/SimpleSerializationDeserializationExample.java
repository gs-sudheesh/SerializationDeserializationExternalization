package sgs.learn.serialization.serialize.deserial.rmvariable;

import java.io.IOException;
import sgs.learn.serialization.utils.FileReadWriteUtility;

public class SimpleSerializationDeserializationExample {

	private static final String FILE_PATH = "./remove_variable_deserial/RemovePhoneNumberForDeserial.txt";

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		/*
		 * The below code can be used to create the file. Before running remove
		 * phoneNumber from Person and execute Add phoneNumber and Comment the File
		 * write section for results
		 */
		// 1. Uncomment phoneNumber variable
		// 2. Uncomment below commented lines
		// 3. Run
		// 4. Comment the below code
		// 5. Comment phoneNumber variable
		// 6. re-run

//		Person personWrite = new Person("John Doe", "99, Street Ave, Imagine City", 1L);
//		FileReadWriteUtility.createDirectoryIfNotExist(FILE_PATH);
//		FileReadWriteUtility.writeToFile(personWrite, FILE_PATH);

		Person personRead = (Person) FileReadWriteUtility.readFromFile(FILE_PATH);
		System.out.println("Read Object: " + personRead.toString());// Read Object: Person [name=John Doe, address=99,
																	// Street Ave, Imagine City, phoneNumber=null]
	}

}
