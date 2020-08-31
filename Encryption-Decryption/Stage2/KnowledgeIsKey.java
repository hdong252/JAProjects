package encryptdecrypt;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String msgToEncrypt = s.nextLine();
        int key = s.nextInt();
        
        String msgEncrypted = encryptionWithKey(msgToEncrypt, key);
        System.out.println(msgEncrypted);
    }
    
    public static String encryptionWithKey(String origMsg, int key) {
        char[] origMsgArray = origMsg.toCharArray();
        char[] encryptedMsgArray = new char[origMsgArray.length];
        int charIndex = 0;
        
        for(int i = 0; i < origMsgArray.length; i++) {
            
            charIndex = (int)origMsgArray[i];
            
            if (charIndex < 97 || charIndex > 122) {
                encryptedMsgArray[i] = origMsgArray[i];
            } else {
                int newIndex = (((charIndex + key) <= 122) ? (charIndex + key) : (charIndex + key - 122 + 96));
                encryptedMsgArray[i] = (char)newIndex;
            }
        }
        
        String encrypted = String.valueOf(encryptedMsgArray);
        
        return encrypted;
    }
}