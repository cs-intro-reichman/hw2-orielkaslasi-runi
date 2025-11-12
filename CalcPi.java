// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 
	    // Understand the problem
		// leading questions : 
		// dividing into smaller problems: calculating this term in the length requested, multiplying by 4 for pi.
		//calculate terms: for loop. 1/n + 1/n+2 - 1/n+4. n starts as 1.
		// Pseudo code:
		// get args[0] num of terms -> calculate terms
		// writing JAVA
        int times = Integer.parseInt(args[0]);
        double denominator = 1;
        double sign = -1;
        double pi = 0;

        for (int i = 0; i < times; i++) {
            sign = sign * -1;
            pi = pi + (sign * (1.0 / denominator));
            denominator = denominator + 2;
        }

        System.out.println("pi according to Java: " + Math.PI);
        System.out.println("pi, approximated:     " + (pi * 4));
    }
}
