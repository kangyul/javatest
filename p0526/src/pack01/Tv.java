package pack01;

public class Tv {
	
	boolean power; // true, false 
	int channel;
	void power() {
		power = !power;
	}
	
	void channelUp() {
		channel++;
	}
	
	void channelDown() {
		channel--;
	}

}
