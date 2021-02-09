package binSearchProof;

public class Main {

	public static void main(String[] args) {
		Random randNum = new Random();
		int hiddenNumber = randNum.nextInt(101);
		
		int avgRandom = 0;
		int avgHiLo = 0;
		int limit = 100;
		
		for(int i = 0; i < 100; i++) {
			int hiddenNumber = randNumber = randNum.nextInt(limit);
			
		}
		
		
	}
	
	public randomGuesser(int high, int hiddenNumber) {
		Random rand = new Random();
		int tempGuess;
		boolean finished = false;
		List<Integer> randomGuesses = new ArrayList<Integer>();
		int countguesses = 0;
		outer:
		do {
			tempguess = rand.nextInt(high);
			System.out.printf("Random guess is: %d\n", tempGuess);
			if(tempGuess == hiddenNumber) {
				finished = true;
			}else {
				for(int pastGuess : randomGuesses) {
					if(pastGuess == tempGuess) {
						continue outer;
					}
				}
				randomGuesses.add(tempGuess);
				countGuesses++;
				}
			} while (finished == false);
		return countGuesses;
	}
	public int highLowGuesser(int low, int high, int hiddenNumber) {
		Random rand = new Random();
		int tempGuess;
		boolean finished = false;
		int countHiLoGuesses = 0;
		outer:
			do {
				tempGuess = rand.nextInt(high-low)+low;
				System.out.printf("High low guess is: %d\n", tempGuess);
				if(tempGuess == hiddenNumber) {
					finished = true;
				}else {
					
				}
			}
	}
	}
	
	public highLowGuesser(int high, int hiddenNumber) {

}
