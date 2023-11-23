package FinalExam;
/*
import org.junit.Test;

import static org.junit.Assert.assertEquals;
public class TestClass {

    @Test
    public void testGetCounter() {
        // Creates an instance of the counter class
        counter testCounter = new counter();

        // Prints a message to indicate the start of the test
        System.out.println("Start of Counter Test");

        // Calls the 'wordcounter' method on the counter class to count words in two lines
        testCounter.wordcounter("Testing word counter");
        testCounter.wordcounter("Testing line counter");

        // Defines expected values for character and line counts
        int expectedChar = 40;
        int expectedLine = 2;

        // Gets actual values from the counter class
        int actualChar = testCounter.charcount;
        int actualLine = testCounter.linecount;

        // Asserts that actual values match the expected values with a tolerance of 4 for characters and 5 for lines
        assertEquals(expectedChar,actualChar, 4);
        assertEquals(expectedLine,actualLine, 5);

        // Prints the actual character and line counts
        System.out.println("Characters: " + actualChar);
        System.out.println("Lines: " + actualLine);

        // Prints a message to indicate the end of the test
        System.out.println("End");
        System.out.println("                      ");

    //Creates an instance of the counter class.
        //Prints a message to indicate the start of the test.
        //Calls the wordcounter method on the counter class to count words in two lines.
        //Defines expected values for character and line counts.
        //Gets actual values from the counter class.
        //Asserts that actual values match the expected values with a tolerance of 4 for characters and 5 for lines using assertEquals.
        //Prints the actual character and line counts.
        //Prints a message to indicate the end of the test.
        //Adds some empty lines to make the output more readable.
        //In summary, this test method checks if the wordcounter method in the counter class correctly counts characters and lines and if the actual counts match the expected counts within specified tolerances.


    }

    @Test
    public void testReader() {
        // Prints a message to indicate the start of the test
        System.out.println("Start of Reader Test");

        // Creates an instance of the 'reader' class
        reader testReader = new reader();
       // Calls the 'setWordArray' method on the 'reader' class to set words in the array
        reader.setWordArray("'Testing reader 123'", 0);
        reader.setWordArray("'Reader tested 321'", 1);

        // Calls the 'endResult' method on the 'reader' class to print the stored words
        reader.endResult();

        // Prints a message to indicate the end of the test
        System.out.println("End");
        System.out.println("                   ");

        //System.out.println("Start of Reader Test");: Prints a message indicating the start of the test.
        //reader testReader = new reader();: Creates an instance of the reader class called testReader.
        //reader.setWordArray("'Testing reader 123'", 0);: Calls the setWordArray method on the reader class to set the word "'Testing reader 123'" at position 0 in the array.
        //reader.setWordArray("'Reader tested 321'", 1);: Calls the setWordArray method again to set the word "'Reader tested 321'" at position 1 in the array.
        //reader.endResult();: Calls the endResult method on the reader class to print the stored words in the array.
        //System.out.println("End");: Prints a message indicating the end of the test.
        //In summary, this test method creates a reader object, sets two words in the words array, prints the stored words using the endResult method, and then indicates the end of the test.
    }



    @Test
    public void testMainClass () {
        // Creates an instance of the MainClass
        MainClass testMainClass = new MainClass();

        // Creates instances of the counter and reader classes
        counter testCounter = new counter();
            reader testReader = new reader();

        // Defines two test lines
        String testLine = "'Testing main class counter + reader'";
            String testLine2 = "'Please work'";

        // Prints a message to indicate the start of the test
        System.out.println("Start of Main Test  ");

        // Calls methods on the counter class to count words in the test lines
            testCounter.wordcounter(testLine);
            testCounter.wordcounter(testLine2);

        // Calls a method on the counter class to get and print the word count
        testCounter.getCounter();


        // Calls methods on the reader class to set words in the array
            testReader.setWordArray(testLine, 0);
            testReader.setWordArray(testLine2, 1);

        // Calls a method on the reader class to print the stored words
        testReader.endResult();

        // Prints a message to indicate the end of the test
        System.out.println("End  ");
        System.out.println("                    ");

        //Inside the Test Method:
        //Creates an instance of the MainClass.
        //Creates instances of the counter and reader classes.
        //Defines two test lines.
        //Prints a message to indicate the start of the test.
        //Calls methods on the counter class to count words in the test lines.
        //Calls a method on the counter class to get and print the word count.
        //Calls methods on the reader class to set words in the array.
        //Calls a method on the reader class to print the stored words.
        //Prints a message to indicate the end of the test.
        //Adds some empty lines to make the output more readable.
        //In summary, this test method checks if the counter and reader classes, along with the MainClass, are working as expected by counting words, storing them, and printing the results.

        }

        @Test
    public void TestLongestWord () {
            // Prints a message to indicate the start of the longest word test
            System.out.println("Start of longest word test");

            // Defines a test sentence
            String TestSentence = "Hitta det längsta ordet Supercalifragilisticexpialidocious eller Floccinaucinihilipilification";

            // Calls the 'findLongestWord' method to find the longest word in the test sentence
            String result = longestWordFinder.findLongestWord(TestSentence);

            // Prints the test sentence and the longest word found
            System.out.println("Test sentence: " + TestSentence);
            System.out.println("Longest word in sentence is: " + result);

            // Prints a message to indicate the end of the test
            System.out.println("End");
            System.out.println("                    ");

        //Inside the Test Method:
            //Prints a message to indicate the start of the test.
            //Defines a test sentence, which is the input for the test.
            //Calls a method (findLongestWord) to find the longest word in the test sentence.
            //Prints the original test sentence and the longest word found in it.
            //Prints a message to indicate the end of the test for clarity.
            //Adds some empty lines to make the output more readable.

        }


}
*/