package m3_1_LinkedList;

import java.io.Serializable;

public class Hero{
	
	public String name;
	public float hp;
	
	Hero () {
		
	}
	
	public Hero(String name) {
		this.name = name;
	}
	
	public String toString() {
		return this.name;
	}
}
