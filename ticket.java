import java.util.Scanner;
public class ticket
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Test Cases?");
        int testCases = sc.nextInt();
        sc.nextLine();
        for(int i=0;i<testCases;i++){
            System.out.println("Case?");
            String line = sc.nextLine();
            String[] parts = line.split(" ");
            int speed = Integer.parseInt(parts[0]);
            if(line.contains("true")){
                if(speed <= 65){
                    System.out.println("no ticket");
                }
                if(speed >= 66 && speed <= 85){
                    System.out.println("small ticket");
                }
                if(speed >= 86){
                    System.out.println("big ticket");
                }
            }else{
               if(speed <= 60){
                    System.out.println("no ticket");
                }
                if(speed >= 61 && speed <= 80){
                    System.out.println("small ticket");
                }
                if(speed >= 81){
                    System.out.println("big ticket");
                }
            }
            
        }
    }
}