public class Guesser {
	private int low;
	private int high;

	public Guesser(int low, int high) {
		this.low = low;
		this.high = high;
	}

	public void start() {
		rules();
		doGuesses();
	}

	public void rules() {
		System.out.println("Think of a number between " + low + " and " + high);
        	System.out.println("In order to guess your number, I will ask a series of questions.");
	        System.out.println("Answer T for true, and F for false.");
	}

	public void doGuesses() {
	int numberOfGuesses = 0;
        int middle = 0;

        while (low < high) {
            middle = low + (high - low)/2;

            System.out.println("Is the number less than or equal to " + middle + "?");

            String reply = getReply();
            if (reply.equals("T")) {
                high = middle;
            }
            else {
                low = middle + 1;
            }
            numberOfGuesses++;
	}
}
