import java.util.*;
public class calculator {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        Scanner s2 = new Scanner(System.in);
        Scanner s3 = new Scanner(System.in);
        System.out.println("Number 1: ");
        int n1 = s1.nextInt();
        System.out.println("Number 2:");
        int n2 = s2.nextInt();
        System.out.println("Add or Subtract or Multiply or Divide: ");
        String method = s3.nextLine();
        if(method.equals("Add")){
            int result = n1+n2;
            System.out.println(n1 + " + " + n2 + " = " + result);
        }
        else if(method.equals("Subtract")){
            int result = n1-n2;
            System.out.println(n1 + " - " + n2 + " = " + result);
        }
        else if(method.equals("Multiply")){
            int result = n1*n2;
            System.out.println(n1 + " * " + n2 + " = " + result);
        }
        else{
            int result = n1/n2;
            System.out.println(n1 + " / " + n2 + " = " + result);
        }

    }
}
