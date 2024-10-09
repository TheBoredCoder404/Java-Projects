import java.util.*;
public class binary{
    public static void main(String[] args) {
        ArrayList<Integer> values = new ArrayList<>(Arrays.asList(128,64,32,16,8,4,2,1));
        Scanner sc = new Scanner(System.in);
        System.out.println("Say B to convert from bin to num or say N to convert from num to bin");
        if(sc.nextLine()=="N"){
            ArrayList<Integer> binary = new ArrayList<>();
        System.out.println("What number would you like to convert to binary? (MAX 255)");
        int num = sc.nextInt();
        for(int i=0;i<values.size();i++){
            if (num >= values.get(i)) {
                binary.add(1);
                num = num - values.get(i);
            } else {
                binary.add(0); 
             }
            }
        System.out.println(binary);
        
        }else{
            ArrayList<Integer> values2 = new ArrayList<>();
            int result = 0;
            System.out.println("Type in the 8 bit binary value");
            for(int i=0;i<8;i++){
                values2.add(sc.nextInt());
            }
            for(int i=0;i<values.size();i++){
                if(values2.get(i)==1){
                    result = result+values.get(i);
                }
            }
        System.out.println(result);
        }
        sc.close();
        
}
}
