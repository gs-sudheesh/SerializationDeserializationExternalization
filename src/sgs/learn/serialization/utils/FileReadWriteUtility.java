package sgs.learn.serialization.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public final class FileReadWriteUtility {
	public static Object readFromFile(String filePath) throws FileNotFoundException, IOException, ClassNotFoundException {
		System.out.println(String.format("Reading from file: %s", filePath));
		FileInputStream fis = new FileInputStream(filePath);
		ObjectInputStream ois = new ObjectInputStream(fis);
		Object object = ois.readObject();
		ois.close();
		fis.close();
		System.out.println("File read and transform completed");
		return object;
	}
	
	public static void writeToFile(Object obj, String filePath) throws FileNotFoundException, IOException {
		System.out.println(String.format("Writing to file: %s", filePath));
		FileOutputStream fos = new FileOutputStream(filePath);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(obj);
		oos.close();
		fos.close();
		System.out.println("File write completed");
	}
	
	public static void createDirectoryIfNotExist(String filePath) {
		File file = new File(filePath);
		if (file.getParentFile() != null && !file.getParentFile().exists()) {
			System.out.println("Parent directory not found");
			file.getParentFile().mkdir();
		}
	}
}
