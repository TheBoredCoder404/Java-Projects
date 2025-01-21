import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
public class basicstats{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Would you like to find mean, mode, or median");
        String userChoice = sc.nextLine();
        ArrayList <Double> list = new ArrayList<>();
        System.out.println("How many values in list?");
        int userAmount = sc.nextInt();
        for(int i=0;i<userAmount;i++){
            System.out.println("Value:");
            list.add(sc.nextDouble());
        }
        if(userChoice.equals("mean")){
            Double sum = 0.0;
            for(int i=0;i<list.size();i++){
                sum=sum+list.get(i);
            }
            System.out.println("The mean is: "+sum/list.size());
        }else if(userChoice.equals("median")){
            Collections.sort(list);
            if(userAmount%2==0){
                System.out.println("The median is: "+(list.get((list.size() / 2) - 1) + list.get(list.size() / 2)) / 2.0);

            }else{
                System.out.println("The median is: "+list.get((userAmount-1)/2));
            }
        }else{
            ArrayList<Double> list2 = new ArrayList<>();
            for(int i=0;i<list.size();i++){
                Double count = 0.0;
                for(int j=0;j<list.size();j++){
                    if(list.get(i).equals(list.get(j))){
                        count++;
                    }
                }
                list2.add(count);
            }
            Double currentNum = list2.get(0);
            for(int i=0;i<list2.size()-1;i++){
                if(list2.get(i+1)>list2.get(i)){
                    currentNum = list2.get(i+1);
                }
            }
            Double mode = list.get(list2.indexOf(currentNum));
            System.out.println("The mode is: "+mode);
        }
        sc.close();
    }
}