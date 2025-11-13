// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
	int number = Integer.parseInt(args[0]);
        // עוברת על כל המספרים מ-1 עד המספר שנבחר
        for (int i = 1; i <= number; i++) {
            int current = i; // מתחילים מהמספר הנוכחי

            // כל עוד המספר לא הגיע ל-1
            while (current != 1) {
                System.out.print(current + " "); // מדפיסה את המספר ואת רווח
                if (current % 2 == 0) { 
                    current = current / 2;
                } else { 
                    current = 3 * current + 1;
                }
            }

            // מדפיסים את ה-1 ומורידים שורה
            System.out.println(1);
        }
    }
}
