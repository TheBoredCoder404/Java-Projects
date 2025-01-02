import java.util.Scanner;
import java.util.ArrayList;
public class binaryV2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("For bin to dec say B or for dec to bin say D");
        String userChoice = sc.nextLine();
        if(userChoice.equals("D")){
            System.out.println("What number would you like to convert?");
            int num = sc.nextInt();
            ArrayList<Integer> orignums = new ArrayList<>();
            orignums.add(1);
            int count = 1;
            for(int i=1;count<=num;i++){
                orignums.add(orignums.get(i-1)*2);
                count = count+orignums.get(i);
            }
            ArrayList<Integer> nums = new ArrayList<>();
            for(int i=0;i<orignums.size();i++){
                nums.add(orignums.get((orignums.size()-i)-1));
            }
            ArrayList<Integer> result = new ArrayList<>();
            for(int i=0;i<nums.size();i++){
                if(nums.get(i)>num){
                    result.add(0);
                }else{
                    num=num-nums.get(i);
                    result.add(1);
                }
            }
            for(int i=0;i<result.size();i++){
                System.out.print(result.get(i));
            }
        }else{
            System.out.println("What is the decimal you would like to convert?");
            String dec = sc.nextLine();
            ArrayList<String> other = new ArrayList<>();
            for(int i=0;i<dec.length();i++){
                other.add(dec.substring(i,i+1));
            }
            ArrayList<Integer> nums2 = new ArrayList<>();
            nums2.add(1);
            for(int i=0;i<dec.length()-1;i++){
                nums2.add(nums2.get(i)*2);
            }
            ArrayList<Integer> nums3 = new ArrayList<>();
            for(int i=0;i<nums2.size();i++){
                nums3.add(nums2.get((nums2.size()-i)-1));
            }
            int total = 0;
            for(int i=0;i<nums3.size();i++){
                if(other.get(i).equals("1")){
                    total=total+nums3.get(i);
                }
            }
            System.out.println(total);

        }
        sc.close();
    }
}
