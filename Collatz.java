// Demonstrates the Collatz conjecture.
public class Collatz {
    public static void main(String args[]) {
        int seed = Integer.parseInt(args[0]);
        String mode = args[1].toLowerCase();
        int currentNum;
        int count;

        if (mode.equals("v")) {
            // verbose mode
            for (int i = 1; i <= seed; i++) {
                if (i == 1 && seed > 1) {
                    System.out.println("1 4 2 1 (4)");
                } else {
                    currentNum = i;
                    count = 0;
                    System.out.print(currentNum + " ");
                    while (currentNum != 1) {
                        if (currentNum % 2 == 0) {
                            currentNum = currentNum / 2;
                        } else {
                            currentNum = currentNum * 3 + 1;
                        }
                        System.out.print(currentNum + " ");
                        count++;
                    }
                    System.out.println("(" + (count + 1) + ")");
                }
            }
            System.out.println("Every one of the first " + seed + " hailstone sequences reached 1.");
        } else if (mode.equals("c")) {
            // concise mode
            for (int i = 1; i <= seed; i++) {
                currentNum = i;
                while (currentNum != 1) {
                    if (currentNum % 2 == 0) {
                        currentNum = currentNum / 2;
                    } else {
                        currentNum = currentNum * 3 + 1;
                    }
                }
            }
            System.out.println("Every one of the first " + seed + " hailstone sequences reached 1.");
        } else {
            System.out.println("NOT A REAL MODE. only v or c.");
        }
    }
}
