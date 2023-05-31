import java.util.Random;

public class TestDemo {
	int sum = 0;
	
	public int addPositive(int a, int b) {
		if(a > 0 && b > 0) {
			sum = a + b;
		}else {
			throw new IllegalArgumentException("Both parameters need to be positive!");
		}
		return sum;
	}
	
	int getRandomInt() {
	        Random random = new Random();
	        return random.nextInt(10) + 1;
	    }
	  
	int randomNumberSquared() {
	        int randomNumber = getRandomInt();
	        return randomNumber * randomNumber;
	    }

}
