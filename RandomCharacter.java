public class RandomCharacter {
    public static char getRandomCharacter(char ch1, char ch2){
        return (char)(ch1 + Math.random() * (ch2 - ch1 + 1));
    }

    /*
    generate a random lowercase letter
     */
    public static char getRandomLowerCaseLetter(){
        return getRandomCharacter('a' ,'z');
    }

    /*
    generate a random uppercase letter
     */
    public static char getRandomUpperCase(){
        return getRandomCharacter('A', 'Z');
    }

    /*
    get a random digit
     */
    public static char getRandomDigit(){
        return getRandomCharacter('0', '9');
    }
    /*
    get a random character
     */
    public static char getRandomCharacter(){
        return getRandomCharacter('\u0000', '\uFFFF');
    }
}