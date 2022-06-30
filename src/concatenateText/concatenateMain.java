package concatenateText;

public class concatenateMain {

    public static void main(String[] args) {
        String[] arrayText = fillArray();
        printArray(arrayText);
    }

    public static void printArray(String[] arrayText){
        for (int i = 0; i < arrayText.length; i++) {
            System.out.print(arrayText[i]+"," +"\t");

        }

    }

    public static String[] fillArray(){

        String[] arrayText = new String[5];
        for (int i = 0; i < arrayText.length; i++) {
            arrayText[i] = "I'm the #" +i;
        }
        return arrayText;
    }
}
