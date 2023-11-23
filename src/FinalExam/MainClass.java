package FinalExam;
/*
import java.util.Scanner;


public class MainClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Creates a Scanner object named scanner to read input from the user.
        //Prints messages instructing the user to start typing and to type "stop" to exit.

        System.out.println("Write anything to start!");
        System.out.println("To exit type: 'stop'");

        LogicClass logic = new LogicClass();
        LogicClass.Counter counter = logic.getCounter();
        LogicClass.Reader reader = logic.getReader();
        LogicClass.LongestWordFinder longestWordFinder = logic.getLongestWordFinder();
        //counter textCounter = new countAndread();
        //counter textReader = new countAndread();
        //Creates instances of two classes: practiceCounter and practiceReader.
        // These classes appear to handle counting words (textCounter) and storing words in an array (textReader), respectively.
        String longestWord = "";


        int i = -1;// Initializes an integer variable i with the value -1.
        while (true) {//Initiates an infinite loop. The condition true means the loop will run indefinitely until explicitly broken out of

            i++;// Increments the value of i by 1 in each iteration. This serves as a counter to keep track of the number of iterations.
            String line = scanner.nextLine();

            if (line.equalsIgnoreCase("stop")) {
                break;
                //Checks if the user entered "stop" (case-insensitive). If true, it breaks out of the loop, ending the infinite loop.
            }
            logic.getCounter().wordCounter(line);
            //Calls wordcounter method from the textCounter instance to count words in the input line.
            logic.getReader().setWordArray(line, i);
            //Calls setWordArray method from the textReader instance to store words in an array.


            String currentLongestWord = logic.findLongestWord(line);
            //Calls findLongestWord method from the LongestWordFinder class to find the longest word in the current input line.
            if (currentLongestWord.length() > longestWord.length()) {
                longestWord = currentLongestWord;
                //Compares the length of the current longest word with the length of the new longest word found. If the new word is longer, it updates the longestWord variable.
            }

        }
        logic.getCounter().getCounter();//Gets result from counter class
        logic.endResult().endResult();//Gets the result from reader class
        System.out.println("Longest word: " + longestWord);//Prints the longest word found during the entire program.
        scanner.close();//Closes the Scanner since no more input is needed.

    }
}
*/