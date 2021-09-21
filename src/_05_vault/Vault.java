package _05_vault;

import java.util.Random;

import javax.swing.JOptionPane;

public class Vault {

int code;




public Vault() {
	Random r = new Random();
	code=r.nextInt(1000000);
	// TODO Auto-generated constructor stub
}



	

boolean tryCode(int guess) {

if (guess==code) {
return true;
}
else {
	return false;
}
}

}
