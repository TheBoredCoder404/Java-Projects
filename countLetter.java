import java.util.*;
public class countLetter{
    public static void main(String[] args) {
        Scanner wordScan = new Scanner(System.in);
        Scanner letterScan = new Scanner(System.in);
        int count = 0;
        System.out.println("Word: ");
        String word = wordScan.nextLine();
        System.out.println("What Letter? (Will return times that letter appears): ");
        String letter = letterScan.nextLine();
        for(int i=0;i<word.length();i++){
            if(word.substring(i, i+1).equals(letter))
                count+=1;
        }
        System.out.println("The amount of times the letter " +letter+ " appears is "+count+" times.");
    }
}