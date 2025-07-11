import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Cipher obj = new Cipher();
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Type in the message you would like to decode.");
        String message = keyboard.nextLine();
        for (int i = 0; i < 26; i++){
            obj.setKey(i);
            String result = obj.recursionKey(message);
            System.out.println(result);
        }
    }
}
