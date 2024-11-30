import java.util.Scanner;

public class change {
    public static void main(String[] args) {
        int temp = 0;
        int currentAmount = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Dollar Amount:");
        int dollarAmount = sc.nextInt();
        System.out.println("Cent Amount:");
        int centAmount = sc.nextInt();

        if(dollarAmount != 0){
            if(dollarAmount >= 100){
                currentAmount = 100;
                dollarAmount = checkDollar(temp, dollarAmount, currentAmount);
            }
            if(dollarAmount >= 50){
                currentAmount = 50;
                dollarAmount = checkDollar(temp, dollarAmount, currentAmount);
            }
            if(dollarAmount >= 20){
                currentAmount = 20;
                dollarAmount = checkDollar(temp, dollarAmount, currentAmount);
            }
            if(dollarAmount >= 10){
                currentAmount = 10;
                dollarAmount = checkDollar(temp, dollarAmount, currentAmount);
            }
            if(dollarAmount >= 5){
                currentAmount = 5;
                dollarAmount = checkDollar(temp, dollarAmount, currentAmount);
            }
            if(dollarAmount >= 2){
                currentAmount = 2;
                dollarAmount = checkDollar(temp, dollarAmount, currentAmount);
            }
            if(dollarAmount >= 1){
                currentAmount = 1;
                dollarAmount = checkDollar(temp, dollarAmount, currentAmount);
            }
        }
        if(centAmount != 0){
            if(centAmount>=25){
                currentAmount = 25;
                centAmount = checkCent(temp, centAmount, currentAmount);
            }
            if(centAmount>=10){
                currentAmount = 10;
                centAmount = checkCent(temp, centAmount, currentAmount);
            }
            if(centAmount>=5){
                currentAmount = 5;
                centAmount = checkCent(temp, centAmount, currentAmount);
            }
            if(centAmount>=1){
                currentAmount = 1;
                centAmount = checkCent(temp, centAmount, currentAmount);
            }
        }

        sc.close();
    }

    static int checkDollar(int temp, int dollarAmount, int currentAmount){
        temp = (dollarAmount - dollarAmount % currentAmount) / currentAmount;
        System.out.println("$" + currentAmount + " Bills: " + temp);
        return dollarAmount % currentAmount;
    }
    static int checkCent(int temp, int centAmount, int currentAmount){
        temp = (centAmount - centAmount % currentAmount) / currentAmount;
        if(currentAmount == 25){
            System.out.println("Quarters: "+temp);
        }else if(currentAmount == 10){
            System.out.println("Dimes: "+temp);
        }else if(currentAmount == 5){
            System.out.println("Nickels: "+temp);
        }else{
            System.out.println("Pennies: "+temp);
        }
        return centAmount % currentAmount;
}
}

