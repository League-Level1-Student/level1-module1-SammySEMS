package _06_duck;

import javax.swing.JOptionPane;

public class Duck {

String favoriteFood;
int numberOfFriends;

Duck(String favoriteFood, int numberOfFriends) {
  
	
	this.favoriteFood = favoriteFood;
       this.numberOfFriends = numberOfFriends;
       
       JOptionPane.showMessageDialog(null,numberOfFriends);
       JOptionPane.showMessageDialog(null,favoriteFood);
}


public void quack() {
	System.out.println("Quack");
	// TODO Auto-generated method stub
	
}

}
