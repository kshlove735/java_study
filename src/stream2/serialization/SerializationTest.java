package stream2.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Person implements Serializable{

	private static final long serialVersionUID = 3770443057139443013L;
	String name;
	transient String title;
	
	public Person() {}
	public Person(String name, String title) {
		this.name = name;
		this.title = title;
	}
	@Override
	public String toString() {
		return name + ", " + title;
	}
	
	
}

public class SerializationTest {

	public static void main(String[] args) throws ClassNotFoundException {
		Person personL= new Person("Lee", "Manager");
		try(
				FileOutputStream fos = new FileOutputStream("serial.dat");
				ObjectOutputStream oop = new ObjectOutputStream(fos);
				){
				oop.writeObject(personL);
			
		}catch(IOException e) {
			System.out.println(e);
		}
		
		
		try(
				FileInputStream fis = new FileInputStream("serial.dat");
				ObjectInputStream ois = new ObjectInputStream(fis);
					){
				Object obj = ois.readObject();
				if(obj instanceof Person) {
					Person p = (Person)obj;
					System.out.println(p); // Lee, null
				}
				
			}catch(IOException e) {
				System.out.println(e);
			}
		
	}

}
