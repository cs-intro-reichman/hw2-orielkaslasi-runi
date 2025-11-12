public class TimeCalc {
    public static void main(String[] args) {
        int hours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));
		// Does the same with the minutes part of the input.
		int minutes = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4));
		int minutesToAdd = Integer.parseInt(args[1]);
        int totalMinutes = ((hours * 60) + minutes + minutesToAdd);
        int totalHours = (totalMinutes / 60);
        int newHours = (totalHours%24);
        int newMinutes = (totalMinutes % 60);
        String hoursStr;
        if (newHours < 10) { 
            hoursStr = "0" + newHours;
        } else {
            hoursStr = newHours +""; //converts to string
        }
        String minutesStr;
        if (newMinutes < 10) { 
            minutesStr = "0" + newMinutes;
        } else {
            minutesStr = newMinutes +"";
        }
        System.out.println(hoursStr + ":" + minutesStr);
    }

}
