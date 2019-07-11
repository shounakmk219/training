package com;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;

public class SerializeDemo {

	public static void main(String[] args) {
		Person person=new Person();
		person.name="Shounak";
		person.age=23;
		File file=new File("test.txt");
		try {
			ObjectOutputStream w=new ObjectOutputStream(new FileOutputStream(file));
			w.writeObject(person);
			w.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		Person person2;
		try {
			ObjectInputStream w=new ObjectInputStream(new FileInputStream(file));
			person2=(Person) w.readObject();
			System.out.println("Name: "+person2.name+"\nAge: "+person2.age);
			w.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}
}
