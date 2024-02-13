public class sqrRoot {
    public static void main(String[] args) {
        int num1 = 49;
        int num2 = 0;
        
        while (num2 * num2 != num1) {
            num2 += 1;
        }
        
        System.out.println("The square root of " + num1 + " is approximately " + num2);
    }
}
 