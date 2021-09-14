package _04_popcorn;

public class PopcornRunner {
public static void main(String[] args) {
	Popcorn popcorn = new Popcorn("lemon");
	Microwave microwave = new Microwave();

microwave.putInMicrowave(popcorn);
microwave.setTime(10);
microwave.startMicrowave();
popcorn.eat();
popcorn.applyHeat();
	
}
}
