package sgs.learn.serialization.serialize.basic;

import java.io.FileNotFoundException;
import java.io.IOException;
import sgs.learn.serialization.utils.FileReadWriteUtility;

/**
 * Person class is serialized and write into a file Read from the file.
 */
public class SimpleSerializationDeserializationExample {

	private static final String FILE_PATH = "./basic_scenario/BasicScenarioSerialDeserial.txt";

	public static void main(String[] args) throws ClassNotFoundException, FileNotFoundException, IOException {

		Person personWrite = new Person("John Doe", "99, Street Ave, Imagine City");

		FileReadWriteUtility.createDirectoryIfNotExist(FILE_PATH);
		FileReadWriteUtility.writeToFile(personWrite, FILE_PATH);

		Person personRead = (Person) FileReadWriteUtility.readFromFile(FILE_PATH);
		System.out.println("Read Object: " + personRead.toString());
	}
}
