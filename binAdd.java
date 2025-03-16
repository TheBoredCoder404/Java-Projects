import java.util.*;

public class binAdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> a = new ArrayList<>();
        ArrayList<String> b = new ArrayList<>();
        ArrayList<String> result = new ArrayList<>();
        System.out.println("Binary number 1: ");
        String la = sc.nextLine();
        System.out.println("Binary number 2: ");
        String lb = sc.nextLine();
        for (int i = 0; i < la.length(); i++) {
            a.add(la.substring(i, i + 1));
        }
        for (int i = 0; i < lb.length(); i++) {
            b.add(lb.substring(i, i + 1));
        }
        if (la.length() > lb.length()) {
            for (int i = 0; i < (la.length() - lb.length()); i++) {
                b.add(i, "0");
            }
        }
        if (lb.length() > la.length()) {
            for (int i = 0; i < (lb.length() - la.length()); i++) {
                a.add(i, "0");
            }
        }
        String carry = "0";
        for (int i = a.size() - 1; i >= 0; i--) {
            if (a.get(i).equals("0") && b.get(i).equals("0")) {
                result.add(carry);
                carry = "0";
            } else if ((a.get(i).equals("0") && b.get(i).equals("1")) || (a.get(i).equals("1") && b.get(i).equals("0"))) {
                if (carry.equals("1")) {
                    result.add("0");
                    carry = "1";  // Carry remains 1
                } else {
                    result.add("1");
                }
            } else if (a.get(i).equals("1") && b.get(i).equals("1")) {
                result.add(carry);
                carry = "1";
            }
        }
        if(carry.equals("1")){
            result.add("1");
        }
        System.out.println("Result: ");
        for(int i=result.size()-1;i>=0;i--){
            System.out.print(result.get(i));
        }
        sc.close();
    }
}

