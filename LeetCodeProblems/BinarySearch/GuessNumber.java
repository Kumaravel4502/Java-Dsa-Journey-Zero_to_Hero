// 374. Guess Number Higher Or Lower

public class GuessNumber {

    private static int PICK = 6;//This is the number to be guessed

    //Guess API
    public static int guess(int mid) {
        if (mid == PICK) {
            return 0;
        }
        return mid > PICK ? 1 : -1;

    }

    public static void main(String[] args) {
        int n = 10;//Assuming the range is from 1 to n
        int Guess = guessNumber(n);
        System.out.println("The guessed number is: " + Guess);
    }

    public static int guessNumber(int n) {
        int low = 0, high = n;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            int res = guess(mid);
            if (res == 0) {
                return mid; // Correct guess
            } else if (res < 0) {
                low = mid + 1; // Guess is higher than the target
            } else {
                high = mid - 1; // Guess is lower than the target
            }
        }
        return -1;
    }
}
