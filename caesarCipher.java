import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
public class caesarCipher{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String current;
        int index;
        ArrayList<String> letters = new ArrayList<>(Arrays.asList("a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"));
        System.out.println("Word:");
        String word = sc.nextLine();
        System.out.println("Amount:");
        int amount = sc.nextInt();
        for(int i=0;i<word.length();i++){
            current = word.substring(i,i+1);
            index = letters.indexOf(current);
            System.out.print(letters.get((index+amount)%26));
        }
        sc.close();
    }
}