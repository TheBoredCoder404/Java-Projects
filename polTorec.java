import java.util.*;
public class polTorec {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Polar to Rectanular Conversion");
        System.out.println("Input in radians(1) or degrees(0)?");
        double choice = sc.nextDouble();
        double r;
        double theta;
        if(choice==0){
            System.out.println("r: ");
            r = sc.nextDouble();
            System.out.println("theta: ");
            theta = Math.toRadians(sc.nextDouble());

        }else{
            System.out.println("r: ");
            r = sc.nextDouble();
            System.out.println("theta: ");
            theta = sc.nextDouble();

        }
        System.out.println("The x value is "+(r*(Math.cos(theta))));
        System.out.println("The y value is "+(r*(Math.sin(theta))));
        sc.close();
    }
}
