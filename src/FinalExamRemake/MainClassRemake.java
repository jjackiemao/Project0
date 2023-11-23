package FinalExamRemake;

import java.util.Scanner;

    public class MainClassRemake {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Write anything to start!");
            System.out.println("To exit type: 'stop'");

            FinalExamRemake.LogicClass logic = new FinalExamRemake.LogicClass();
            LogicClass.Counter counter = logic.getCounterInstance();
            LogicClass.Reader reader = logic.getReaderInstance();
            FinalExamRemake.LogicClass.LongestWordFinder longestWordFinder = logic.getLongestWordFinder();

            String longestWord = "";


            int i = -1;
            while (true) {

                i++;
                String line = scanner.nextLine();

                if (line.equalsIgnoreCase("stop")) {
                    break;
                }
                counter.charCounter(line);
                counter.wordCounter(line);
                reader.setWordArray(line, i);


                String currentLongestWord = longestWordFinder.findLongestWord(line);

                if (currentLongestWord.length() > longestWord.length()) {
                    longestWord = currentLongestWord;
                }

            }

            counter.getCounter();
            reader.endResult();
            System.out.println("Longest word: " + longestWord);
            scanner.close();

        }
    }
