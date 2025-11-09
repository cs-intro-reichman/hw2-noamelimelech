// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 
	String time = args[0];
	int hours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));
	int minutes = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4)); 
	int minutesToAdd = Integer.parseInt(args [1]);
	int TotalMinutes = minutes + minutesToAdd;
	int NewHours = hours + (TotalMinutes / 60) % 24;
	int NewMinutes = (TotalMinutes % 60); 

	if (NewHours >= 24){
		NewHours = NewHours - 24;
	} 
	String hoursString;
	if (NewHours < 10){
		hoursString = "0" + NewHours;
	} else {
		hoursString = "" + NewHours;
	}

	String minutesString;
	if (NewMinutes < 10){
		minutesString = "0" + NewMinutes;
	} else {
		minutesString = "" + NewMinutes;
	}
	System.out.println(hoursString + " : " + minutesString);
	}
}
