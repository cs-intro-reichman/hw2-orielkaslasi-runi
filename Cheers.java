//feedback

/*
Great work boaz!
*/


// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {
                String cheer = args[0];
                cheer = cheer.toUpperCase();
                int times = Integer.parseInt(args[1]);
                int length = cheer.length();
                String specialLetters = "AEFHILUMNOR";
                for (int i = 0; i < length; i++) {
                        System.out.print("Give me ");
                        char currentLetter = cheer.charAt(i);
                        String letterToCheck = "" + currentLetter; //converts char to string
                        if (specialLetters.contains(letterToCheck)) {
                                System.out.print("an ");
                        }
                        else {
                                System.out.print("a  ");
                        }
                        System.out.println(currentLetter + ": " + currentLetter + "!");
                        }
                System.out.println("What does that spell?");
                for (int j = 0; j < times; j++) {
                     System.out.println(cheer + "!!!");   
                }
                        
                }




        }
