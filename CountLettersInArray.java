public class CountLettersInArray {
    public static void main(String [] args){
        char[] chars = createArray();

        //display the array
        System.out.println("the lowercase are: ");
        displayArray(chars);

        //count
        int[] counts = countLetter(chars);
        System.out.println();
        System.out.println("the occurrences of each letter are: ");
        displayCounta( counts);


    }
     //create an array of characters
    public static char[] createArray(){
        char[] chars = new char[100];
        for(int i = 0; i < chars.length; i++)
            chars[i] = RandomCharacter.getRandomLowerCaseLetter();

        return chars;
    }

    //display the array of character
    public static void displayArray(char[] chars){
        for(int i = 0; i < chars.length; i++){
            if((i + 1) % 20 == 0)
                System.out.println(chars[i]);
            else
                System.out.print(chars[i] + " ");
        }
    }

    //count the occurrence of each letter
    public static int[] countLetter(char[] chars){
        int[] counts = new int[26];

        for(int i = 0; i < chars.length; i++)
            counts[chars[i] - 'a']++;
        return counts;
    }

    // display counts
    public static void displayCounta(int[] counts){
        for(int i = 0; i < counts.length; i++){
            if((i + 1) % 10 == 0)
                System.out.println(counts[i] + " " + (char)(i + 'a'));
            else
                System.out.print(counts[i] + " " + (char)(i + 'a') + " ");
        }
    }
}
