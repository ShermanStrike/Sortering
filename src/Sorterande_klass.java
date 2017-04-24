/**
 * Created by hawi15 on 2017-04-03.
 */
public class Sorterande_klass {

    public static void main(String[] args) {

        int[] numbers = {45, 32, 128, 42, 9, 83, 52, 96, 1, 75};                //int för heltal eller double för decimaltal, byt mellan int och double

        String[] words ={"Alpha" ,"Echo", "Charlee", "Bravo", "Foxtrot", "Delta", "Hotel", "Juliet", "Golf", "India", "Kilo" };        //fungerar endast för ord

        selSort(numbers);

        selSortStringLength(words);                 //gör till en kommentar för att inaktivera

        selSortStringAlpha(words);                  //gör till en kommentar för att inaktivera


        for (int i = 0; i < numbers.length; i++)
            System.out.println(numbers[i]);

        for (int i = 0; i < words.length; i++)
            System.out.println(words[i]);
    }
    public static void selSort(int[] numbers) {

        int memory = numbers[0];
        int memoryIdx = 0;

        for (int j = 0; j < numbers.length; j++){
            memory = numbers[j];
            memoryIdx = j;
            for (int i = j; i < numbers.length; i++) {
                if ( numbers[i] < memory) {         //bestämmer vilken riktning den sorteras < eller >
                    memory = numbers[i];
                    memoryIdx = i;
                }
            }
            int tmp = numbers[j];
            numbers[j] = numbers[memoryIdx];
            numbers[memoryIdx] = tmp;
        }
    }



    public static void selSort(double[] numbers) {

        double memory = numbers[0];
        int memoryIdx = 0;

        for (int j = 0; j < numbers.length; j++){
            memory = numbers[j];
            memoryIdx = j;
            for (int i = j; i < numbers.length; i++) {
                if ( numbers[i] > memory) {         //bestämmer vilken riktning den sorteras < eller >
                    memory = numbers[i];
                    memoryIdx = i;
                }
            }
            double tmp = numbers[j];
            numbers[j] = numbers[memoryIdx];
            numbers[memoryIdx] = tmp;
        }
    }

    public static void selSortStringLength(String[] words) {

        int memory = words[0].length();
        int memoryIdx = 0;

        for (int j = 0; j < words.length; j++){
            memory = words[j].length();
            memoryIdx = j;
            for (int i = j; i < words.length; i++) {
                if ( words[i].length() < memory) {         //bestämmer vilken riktning den sorteras < eller >
                    memory = words[i].length();
                    memoryIdx = i;
                }
            }
            String tmp = words[j];
            words[j] = words[memoryIdx];
            words[memoryIdx] = tmp;
        }
    }

    public static void selSortStringAlpha(String[] words) {

        String memory = words[0];
        int memoryIdx = 0;

        for (int j = 0; j < words.length; j++){
            memory = words[j];
            memoryIdx = j;
            for (int i = j; i < words.length; i++) {
                if ( words[i].compareTo(memory) < 0) {         //bestämmer vilken riktning den sorteras < eller >
                    memory = words[i];
                    memoryIdx = i;
                }
            }
            String tmp = words[j];
            words[j] = words[memoryIdx];
            words[memoryIdx] = tmp;
        }
    }
}
