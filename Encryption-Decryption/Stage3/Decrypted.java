package encryptdecrypt;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String targetOperation = s.nextLine();
        String msgInput = s.nextLine();
        String msgOutput = "";
        int key = s.nextInt();
        
        if (targetOperation.equals("enc")) {
            msgOutput = encryptionWithKey(msgInput, key);
        } else if (targetOperation.equals("dec")) {
            msgOutput = decryptionWithKey(msgInput, key);
        }
        
        System.out.println(msgOutput);
    }
    
    public static String encryptionWithKey(String origMsg, int key) {
        char[] origMsgArray = origMsg.toCharArray();
        char[] encryptedMsgArray = new char[origMsgArray.length];
        int orgCharIndex;
        int newCharIndex;
        
        for(int i = 0; i < origMsgArray.length; i++) {
            
            orgCharIndex = (int)origMsgArray[i];
            newCharIndex = orgCharIndex + key;
            encryptedMsgArray[i] = (char)newCharIndex;
        }
        
        String encrypted = String.valueOf(encryptedMsgArray);
        
        return encrypted;
    }
    
    public static String decryptionWithKey(String origMsg, int key) {
        int decKey = 0 - key;
        String decrypted = encryptionWithKey(origMsg, decKey);
        
        return decrypted;
    }
}
