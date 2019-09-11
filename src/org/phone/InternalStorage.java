package org.phone;

public class InternalStorage {
	public void processorName() {
		System.out.println("processorName");
	}
	public void ramSize() {
		System.out.println("ramSize");
	}
	public static void main(String agrs[]) {
		
		InternalStorage is=new InternalStorage();
		is.processorName();
		is.ramSize();
		ExternalStorage es=new ExternalStorage();
		es.size();
	}
		
	
	
	
		
	

}
