package FinalExamRemake;
import java.util.Arrays;
import java.util.Objects;
public class LogicClass {
    public static class Counter {
        public int linecount = 0;
        public int charcount = 0;
        public int wordcount = 0;
        Reader textReader = new Reader();

        public Counter() {
        }

        public void charCounter(String counting) {

            for (int i = 0; i < counting.length(); i++) {
                char currentChar = counting.charAt(i);
                if (!Character.isWhitespace(currentChar)) {
                    charcount++;
                }
            }
            linecount++;
        }
        public void wordCounter(String counting) {
            String[] words = counting.split("\\s+");
            wordcount += words.length;
        }

        public void getCounter() {
            textReader.getTotalLines(linecount);
            textReader.getTotalChar(charcount);
            textReader.getTotalWords(wordcount);
        }
    }

    public static class LongestWordFinder {
        public static String findLongestWord(String input) {
            String[] words = input.split("\\s+");
            String longestWord = "";

            for (String word : words) {
                if (word.length() > longestWord.length()) {
                    longestWord = word;
                }
            }

            return longestWord;
        }
    }

    public static class Reader {
        private static int totalLines = 0;
        private static int totalChar = 0;
        private static int totalWords = 0;
        private static String[] words = new String[100];

        public Reader() {
        }

        public void setWordArray(String input, int pos) {
            int o = pos;
            words[o] = input;
        }

        public void getTotalLines(int getTotalLines) {
            totalLines = getTotalLines;
            System.out.println("Total lines: " + totalLines);
        }

        public void getTotalChar(int getTotalChar) {
            totalChar = getTotalChar;
            System.out.println("Total characters: " + totalChar);
        }
        public void getTotalWords(int getTotalWords) {
            totalWords = getTotalWords;
            System.out.println("Total words: " + totalWords);
        }

        public void endResult() {
            for (int i = 0; words[i] != null; i++) {
                System.out.println(words[i]);
            }
        }

        public String[] getWordsArray() {
            return Arrays.stream(words)
                    .filter(Objects::nonNull)
                    .toArray(String[]::new);
        }
    }
    public Counter getCounterInstance() {
        return new Counter();
    }

    public Reader getReaderInstance() {
        return new Reader();
    }

    public LongestWordFinder getLongestWordFinder() {
        return new LongestWordFinder();
    }

}
