import java.util.Scanner;
class reverseWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Word?");
        String word = sc.nextLine();
        for(int i=word.length();i>0;i--){
            System.out.print(word.substring(i-1,i));
        }
    }
}
