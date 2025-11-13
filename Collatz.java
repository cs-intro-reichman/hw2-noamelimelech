// Demonstrates the Collatz conjecture.
public class Collatz {
    public static void main(String[] args) {
        int number = Integer.parseInt(args[0]);

        // לולאה שרצה על כל המספרים מ-1 עד number
        for (int i = 1; i <= number; i++) {
            int current = i;  // מתחילים מהמספר הנוכחי
            int max = i;      // שומרים את המספר הכי גדול ברצף

            // כל עוד לא הגענו ל-1
            while (current != 1) {
                System.out.print(current + " ");  // מדפיסים באותה שורה
                if (current % 2 == 0) {
                    current = current / 2;
                } else {
                    current = 3 * current + 1;
                }

                // אם מצאנו ערך גבוה יותר – נעדכן את max
                if (current > max) {
                    max = current;
                }
            }

            // אחרי שהגענו ל-1, מדפיסים את הסוף של הרצף
            System.out.println("1 (" + max + ")");
        }

        // אחרי שכל הרצפים הודפסו, מוסיפים הודעה מסכמת
        System.out.println("Every one of the first " + number + " hailstone sequences reached 1.");
    }
}
