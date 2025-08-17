

public class SmallestLetter {
    
    public char nextGreatestLetter(char[] letters, char target) {
        int low = 0, high = letters.length - 1, mid = 0;
        while (low <= high) {
            mid = low + (high - low) / 2;
            if (letters[mid] > target) {
                high = mid - 1; // move left
            } else {
                low = mid + 1; // move right
            }
        }
        return letters[low % letters.length];
    }

    public static void main(String[] args) {
        SmallestLetter sl = new SmallestLetter();
        char[] letters = {'c', 'f', 'j'};
        char target = 'a';
        char result = sl.nextGreatestLetter(letters, target);
        System.out.println("The smallest letter greater than " + target + " is: " + result);
    }
}
