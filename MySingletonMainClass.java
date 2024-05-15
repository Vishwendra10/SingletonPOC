package test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.Constructor;

public class MySingletonMainClass implements Serializable{

	public static void main(String[] args){
		
//		MySingleton instance1= MySingleton.getSingleton();
//		MySingleton instance2= MySingleton.getSingleton();
		
//		System.out.println(instance1.hashCode());
//		System.out.println(instance2.hashCode());

//************************************************************************
		
		
//		Breaking the singleton using reflection
//		MySingleton instance2=null;
		
//		try {
//			Constructor[] constructors= MySingleton.class.getDeclaredConstructors();
//			
//			for(Constructor constructor: constructors) {
//				constructor.setAccessible(true);
//				instance2= (MySingleton)constructor.newInstance();
//				break;
//			}
//		}
//		catch(Exception e){
//			e.printStackTrace();
//		}
		
//		System.out.println(instance1.hashCode());
//		System.out.println(instance2.hashCode());
		
		
		//Solution: use ENUM instead
//		MySingletonEnum instance3= MySingletonEnum.INSTANCE;
//		MySingletonEnum instance4= MySingletonEnum.INSTANCE;
		
//		System.out.println(instance3.hashCode());
//		System.out.println(instance4.hashCode());
		
//*************************************************************************
		
		//Breaking the singleton using Serializable
		
		
//		MySingleton instance1= MySingleton.getSingleton();
//		MySingleton instance2= MySingleton.getSingleton();
//		
//		try {
//			//Serialization
//			
//			ObjectOutput out= new ObjectOutputStream(
//					new FileOutputStream("file.txt"));
//			out.writeObject(instance1);
//			out.close();
//			
//			//DeSerialization
//			
//			ObjectInput in= new ObjectInputStream(
//					new FileInputStream("file.txt"));
//			
//			instance2 = (MySingleton)in.readObject();
//			in.close();
//		}
//		catch(Exception e) {
//			e.printStackTrace();
//		}
//		
//		System.out.println(instance1.hashCode());
//		System.out.println(instance2.hashCode());
		
		
		//Solution: use readResolve method in MySingleton Class
//		   protected Object readResolve() { return instance; }
		
//		System.out.println(instance1.hashCode());
//		System.out.println(instance2.hashCode());
		
//*************************************************************************
		
		//Breaking the singleton using Clonable
		
		//use throws after the main method throws CloneNotSupportedException{
		//use implements Cloneable in MySingleton
		//override clone method in MySingleton
//		protected Object clone()
//		        throws CloneNotSupportedException
//		    {
//		        return super.clone();
//		    }
		
		MySingleton instance1= MySingleton.getSingleton();
		MySingleton instance2= (MySingleton)instance1.clone();
		
//		System.out.println(instance1.hashCode());
//		System.out.println(instance2.hashCode());
		
		//Solution: while overrinding clone method use

//		protected Object clone() throws CloneNotSupportedException {
//		        throw new CloneNotSupportedException();
//		    }
		
//		System.out.println(instance1.hashCode());
//		System.out.println(instance2.hashCode());
	}

}
