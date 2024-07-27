package sgs.learn.serialization.externalization.basic;

import java.io.IOException;

import sgs.learn.serialization.utils.FileReadWriteUtility;

public class ExternalizationExample {

	private static final String FILE_PATH = "./externalization/ExternalizationFileSamePkg.txt";

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		Person personWrite = new Person("John Doe", "99, Street Ave, Imagine City");

		FileReadWriteUtility.createDirectoryIfNotExist(FILE_PATH);
		FileReadWriteUtility.writeToFile(personWrite, FILE_PATH);

		Person personRead = (Person) FileReadWriteUtility
				.readFromFile(FILE_PATH);
		System.out.println("Read Object: " + personRead.toString());
	}

}
