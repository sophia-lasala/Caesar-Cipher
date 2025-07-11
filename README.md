# Caesar-Cipher

A basic implementation of a Caesar Cipher in Java. Meant to be used to "brute force" the solution rather than having the specific key.

## How to Use 

Download the files provided, (Cipher.java and Main.java) and run Main.java. Follow the instructions provided in the output stream and input your message!

## How it Works 

In the Cipher class, the alphabet is divided into uppercase and lowercase letters and implemented into two arrays respectfully. The letter is searched for linearly by a for loop that goes through each array. After that, recursively the index is moved over # amount until the whole phrase is completed. In the Main class, the user is prompted to type in the full encypted message. Then, a for loop is used to cycle through all 25 possible combinations and the value is implemented into the recurssion to calculate. All 26 messages, including the user input, is then printed in the output stream alongside the key number. Through this the user can look for the message that makes the most sense decypted. 

## Plans for the Future 

I plan to include the option to pick a key beforehand rather than brute forcing a solution. Additionally, allowing users the option to encrypt their own ciphers if desired. In the future, I also wish to create GUI to make the program more accessible and visually pleasing using JavaFX. Lastly, I am looking into a way to have this program figure out the cipher on its own or having "guesses" as to which key fits, potentially by searching through common words or phrases for matches.
