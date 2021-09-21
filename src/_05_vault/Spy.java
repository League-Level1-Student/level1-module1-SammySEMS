package _05_vault;

import java.util.Random;

public class Spy {
	String name;
public Spy(String name) {
	this.name=name;
}
		
		
		int findCode(Vault vault){
		for (int i = 0; i < 1000000; i++) {
			if(vault.tryCode(i)) {
				return i;
			}
			
		}
		
		
		return -1;
		}
		}
	

