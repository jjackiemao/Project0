package FinalExam;

public class counter {

    public int linecount = 0; //
    public int charcount = 0; //
    reader textReader = new reader();
    public counter () {

    }
    public void wordcounter (String counting) {
        for (int i = 0; i < counting.length(); i++) {
            char currentChar = counting.charAt(i);
            if (!Character.isWhitespace(currentChar)) {
                charcount++;
            }
        }
        linecount++;
    }

    public void getCounter (){
        textReader.getTotalLines(linecount);
        textReader.getTotalChar(charcount);
    }

}
