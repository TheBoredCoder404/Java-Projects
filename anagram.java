import java.util.Scanner;
class anagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Amount of cases?");
        int testCases = sc.nextInt();
        sc.nextLine();
        for(int i=0;i<testCases;i++){
        int count = 0;
        System.out.println("Word 1:");
        String word1 = sc.nextLine(); 
        System.out.println("Word 2:");
        String word2 = sc.nextLine();
        if(word1.length()==word2.length()){
            for(int j=0;j<word1.length();j++){
                if(word2.contains(word1.substring(i,i+1))){
                    count++;
                }
            }
            if(count == word1.length()){
                System.out.println(word1+"|"+word2+" = ANAGRAM");
            }else{
                System.out.println(word1+"|"+word2+" = NOT AN ANAGRAM");
            }
        }else{
            System.out.println(word1+"|"+word2+" = NOT AN ANAGRAM");
        }
    }
}
}

