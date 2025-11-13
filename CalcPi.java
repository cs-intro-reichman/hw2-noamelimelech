public class CalcPi {
    public static void main(String[] args) {
        int nummber = Integer.parseInt(args[0]);
		double p = Math.PI;
		System.out.println("pi according to Java: " + p);
		double result = 0.0;
		for (int i = 0; i < nummber; i++ ) {
		double term = (i % 2 == 0 ? 1 :-1) * (1.0 / (2 * i + 1));
		result = result + term;
		}
				double calc = result * 4;
				System.out.println("pi, approximated:" + calc);

		}



    }

