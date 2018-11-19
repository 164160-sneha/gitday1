package com.sneha.oop;

public abstract class Persistance {
	
	abstract void persist();
	
	public static void main(String[] args) {
		FilePersistance P1= new FilePersistance();
		DatabasePersistance P2=new DatabasePersistance();
		P1.persist();
		P2.persist();
		
	}
	
}
