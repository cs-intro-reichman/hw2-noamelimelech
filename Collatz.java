// Demonstrates the Collatz conjecture.
public class Collatz {
    public static void main(String[] args) {
        int number = Integer.parseInt(args[0]);
        String mode = args[1];  // "v" or "c"

        for (int i = 1; i <= number; i++) {
            int current = i;
            int max = i;

            if (mode.equals("v")) {
                // טיפול מיוחד למספר 1
                if (i == 1) {
                    System.out.println("1 4 2 1 (4)");
                    continue;
                }
                while (current != 1) {
                    System.out.print(current + " ");
                    if (current % 2 == 0) {
                        current = current / 2;
                    } else {
                        current = 3 * current + 1;
                    }
                    if (current > max) {
                        max = current;
                    }
                }
                System.out.println("1 (" + max + ")");
            } 
            else if (mode.equals("c")) {
                while (current != 1) {
                    if (current % 2 == 0) {
                        current = current / 2;
                    } else {
                        current = 3 * current + 1;
                    }
                }
            }
        }

        System.out.println("Every one of the first " + number + " hailstone sequences reached 1.");
    }
}
