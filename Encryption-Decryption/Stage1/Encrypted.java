package encryptdecrypt;

public class Main {
    public static void main(String[] args) {
        System.out.println(cipherWord("we") + " " + cipherWord("found") + " " + cipherWord("a") + " " + cipherWord("treasure") + "!");
    }
    
    public static String cipherWord(String origWord) {
        char[] origCharArray = origWord.toCharArray();
        int charIndex = 0;
        
        for(int i = 0; i < origCharArray.length; i++) {
            charIndex = (int)'z' + (int)'a' - (int)origCharArray[i];
            origCharArray[i] = (char)charIndex;
        }
        
        String encrypted = String.valueOf(origCharArray);
        
        return encrypted;
    }
}