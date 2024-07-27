package sgs.learn.serialization.serialize.sameObjectdefDiffPackage;

import java.io.IOException;
import sgs.learn.serialization.serialize.sameObjectdefDiffPackage.person.Person;
import sgs.learn.serialization.utils.FileReadWriteUtility;

public class SimpleSerializationDeserializationExample {

	private static final String FILE_PATH = "./data_same_obj_diff_pkg/SimpleSerializationSameObjectFile.txt";

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		Person personWrite = new Person("John Doe", "99, Street Ave, Imagine City");

		FileReadWriteUtility.createDirectoryIfNotExist(FILE_PATH);
		FileReadWriteUtility.writeToFile(personWrite, FILE_PATH);

		sgs.learn.serialization.serialize.sameObjectdefDiffPackage.individual.Person personRead = (sgs.learn.serialization.serialize.sameObjectdefDiffPackage.individual.Person) FileReadWriteUtility
				.readFromFile(FILE_PATH);
		System.out.println("Read Object: " + personRead.toString());
		/**
		 * Code compiles however, throws below error in runtime 
		 * Exception in thread "main" java.lang.ClassCastException: class
		 * sgs.learn.serialization.serialize.sameObjectdefDiffPackage.person.Person
		 * cannot be cast to class
		 * sgs.learn.serialization.serialize.sameObjectdefDiffPackage.individual.Person
		 * (sgs.learn.serialization.serialize.sameObjectdefDiffPackage.person.Person and
		 * sgs.learn.serialization.serialize.sameObjectdefDiffPackage.individual.Person
		 * are in unnamed module of loader 'app') at
		 * sgs.learn.serialization.serialize.sameObjectdefDiffPackage.SimpleSerializationDeserializationExample.main(SimpleSerializationDeserializationExample.java:18)
		 */
	}

}
