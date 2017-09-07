package org.jrocky.advanced.free.demo.jdk;

import javax.inject.Inject;

public class House {
	
	@Inject private Person owner;
	
	@Inject 
	public House() {}
	
	@Inject  
	public House(Person owner) {  
	    System.out.println("---这是房屋构造函数---");  
	    this.owner = owner;  
	}  
	
	@Inject  
	public void setOwner(Person owner) {  
	    this.owner = owner;  
	}

	public Person getOwner() {
		return owner;
	}  
	
}
