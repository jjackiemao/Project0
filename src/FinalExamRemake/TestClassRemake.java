package FinalExamRemake;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class TestClassRemake {

    @Test
    public void testGetCounter() {
        LogicClass.Counter testCounter = new LogicClass.Counter();

        System.out.println("Start of Counter Test");

        testCounter.charCounter("Testing word counter");
        testCounter.charCounter("Testing line counter");

        int expectedChar = 36;
        int expectedLine = 2;

        int actualChar = testCounter.charcount;
        int actualLine = testCounter.linecount;

        assertEquals("Character count is incorrect", expectedChar, actualChar);
        assertEquals("Line count is incorrect", expectedLine, actualLine);

        System.out.println("Characters: " + actualChar);
        System.out.println("Lines: " + actualLine);

        System.out.println("End");
        System.out.println("                      ");
    }

    @Test
    public void testReader() {
        System.out.println("Start of Reader Test");

        LogicClass.Reader testReader = new LogicClass.Reader();
        testReader.setWordArray("'Testing reader 123'", 0);
        testReader.setWordArray("'Reader tested 321'", 1);

        String[] expectedWords = {"'Testing reader 123'", "'Reader tested 321'"};
        String[] actualWords = testReader.getWordsArray();

        assertArrayEquals("Words array is incorrect", expectedWords, actualWords);

        testReader.endResult();

        System.out.println("End");
        System.out.println("                   ");

    }


    @Test
    public void testLongestWordFinder() {
        System.out.println("Start of longest word test");

        String testSentence = "Hitta det längsta ordet Supercalifragilisticexpialidocious eller Floccinaucinihilipilification";
        String expectedResult = "Supercalifragilisticexpialidocious";

        String result = LogicClass.LongestWordFinder.findLongestWord(testSentence);

        assertEquals("Longest word is incorrect", expectedResult, result);

        System.out.println("Test sentence: " + testSentence);
        System.out.println("Longest word in sentence is: " + result);

        System.out.println("End");
        System.out.println("                    ");

    }

    @Test
    public void testCountWords() {
        LogicClass.Counter wordCounter = new LogicClass.Counter();

        String sentence = "There should be about 12 words in this sentence, is that correct?";

        int expectedWordCount = 12;
        wordCounter.wordCounter(sentence);
        int actualWordCount = wordCounter.wordcount;

        System.out.println("Actual Word Count: " + actualWordCount);
        System.out.println("Expected Word Count: " + expectedWordCount);

        assertEquals("Word count is incorrect", expectedWordCount, actualWordCount);
    }
}
