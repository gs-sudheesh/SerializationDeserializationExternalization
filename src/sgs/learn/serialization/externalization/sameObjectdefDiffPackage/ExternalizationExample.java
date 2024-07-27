package sgs.learn.serialization.externalization.sameObjectdefDiffPackage;

import java.io.IOException;

import sgs.learn.serialization.externalization.sameObjectdefDiffPackage.person.Person;
import sgs.learn.serialization.utils.FileReadWriteUtility;

public class ExternalizationExample {

	private static final String FILE_PATH = "./externalization/ExternalizationFile.txt";

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		Person personWrite = new Person("John Doe", "99, Street Ave, Imagine City");

		FileReadWriteUtility.createDirectoryIfNotExist(FILE_PATH);
		FileReadWriteUtility.writeToFile(personWrite, FILE_PATH);

		sgs.learn.serialization.externalization.sameObjectdefDiffPackage.individual.Person personRead = (sgs.learn.serialization.externalization.sameObjectdefDiffPackage.individual.Person) FileReadWriteUtility
				.readFromFile(FILE_PATH);
		System.out.println("Read Object: " + personRead.toString());
		/**
		 * Code compiles however, throws below error in runtime 
		 * Exception in thread
		 * "main" java.lang.ClassCastException: class
		 * sgs.learn.serialization.externalization.sameObjectdefDiffPackage.person.Person
		 * cannot be cast to class
		 * sgs.learn.serialization.externalization.sameObjectdefDiffPackage.individual.Person
		 * (sgs.learn.serialization.externalization.sameObjectdefDiffPackage.person.Person
		 * and
		 * sgs.learn.serialization.externalization.sameObjectdefDiffPackage.individual.Person
		 * are in unnamed module of loader 'app') at
		 * sgs.learn.serialization.externalization.sameObjectdefDiffPackage.ExternalizationExample.main(ExternalizationExample.java:19)
		 */
	}

}
