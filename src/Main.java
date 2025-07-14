import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Cipher obj = new Cipher();
        Scanner keyboard = new Scanner(System.in);
        int answer;
        int key;
        String message;
        System.out.println("Type '1' if you already have a key. Type '2' if you do not.");
        answer = keyboard.nextInt();
        keyboard.nextLine();

        if (answer == 1){
            System.out.println("Enter the key:");
            key = keyboard.nextInt();
            keyboard.nextLine();
            System.out.println("Type in the message you would like to encode/decode.");
            message = keyboard.nextLine();
            obj.setKey(key);
            String result = obj.getKey() + " " + obj.recursionKey(message);
            System.out.println(result);
        }

        else if (answer == 2){
            System.out.println("Type in the message you would like to decode.");
            message = keyboard.nextLine();
            for (int i = 0; i < 26; i++){
                obj.setKey(i);
                String result = obj.getKey() + " " + obj.recursionKey(message);
                System.out.println(result);
            }
        }
    }
}

