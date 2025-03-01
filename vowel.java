import java.util.ArrayList;
import java.util.Scanner; 
public class vowel
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> other = new ArrayList<Integer>();
        
        int cases = sc.nextInt();
        sc.nextLine();
        for(int j=0;j<cases;j++){
            
            String word = sc.nextLine();
            int count = 0;
            for(int i=0;i<word.length();i++){
                if(word.substring(i,i+1).equals("a") || word.substring(i,i+1).equals("e") || word.substring(i,i+1).equals("i") || word.substring(i,i+1).equals("o") || word.substring(i,i+1).equals("u")){
                    count++;
                }
                
            }
            other.add(count);
        }
        for(int i=0;i<other.size();i++){
                System.out.println(other.get(i));
            
            
        }
    
        sc.close();
    }
}

