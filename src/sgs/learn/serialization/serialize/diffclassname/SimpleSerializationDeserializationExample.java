package sgs.learn.serialization.serialize.diffclassname;

import java.io.IOException;
import sgs.learn.serialization.utils.FileReadWriteUtility;

public class SimpleSerializationDeserializationExample {

	private static final String FILE_PATH = "./data_diff_className_obj/SimpleSerializationSameObjectFile.txt";

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		Person personWrite = new Person("John Doe", "99, Street Ave, Imagine City");

		FileReadWriteUtility.createDirectoryIfNotExist(FILE_PATH);
		FileReadWriteUtility.writeToFile(personWrite, FILE_PATH);

		Individual personRead = (Individual) FileReadWriteUtility.readFromFile(FILE_PATH);
		System.out.println("Read Object: " + personRead.toString());

		/**
		 * Exception in thread "main" java.lang.ClassCastException: class
		 * sgs.learn.serialization.serialize.diffclassname.Person cannot be cast to
		 * class sgs.learn.serialization.serialize.diffclassname.Individual
		 * (sgs.learn.serialization.serialize.diffclassname.Person and
		 * sgs.learn.serialization.serialize.diffclassname.Individual are in unnamed
		 * module of loader 'app') at
		 * sgs.learn.serialization.serialize.diffclassname.SimpleSerializationDeserializationExample.main(SimpleSerializationDeserializationExample.java:17)
		 */
	}

}
