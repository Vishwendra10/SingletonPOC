package test;

import java.io.Serializable;

public class MySingleton implements Cloneable, Serializable{
	
	public static MySingleton s= null;
	private MySingleton() {}
	
	public static MySingleton getSingleton() {
		if(s==null) {
			s= new MySingleton();
		}
		
		return s;
	}
	
	protected Object readResolve() { return s; }
	
	protected Object clone(){
		return new CloneNotSupportedException();
	}

}
