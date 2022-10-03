package at.ac.fhcampuswien;

import java.util.Scanner;

public class App {

    //todo Task 1
    public void sayHelloWorld(){
        System.out.println("Hello World!");
        // input your solution here
    }

    //todo Task 2
    public void helloRobot(){
        System.out.println("0123456789012345678901");
        System.out.println("         __");
        System.out.println(" _(\\    |@@|");
        System.out.println("(__/\\__ \\--/ __");
        System.out.println("   \\___|----|  |   __");
        System.out.println("       \\ }{ /\\ )_ / _\\");
        System.out.println("       /\\__/\\ \\__O (__");
        System.out.println("      (--/\\--)    \\__/");
        System.out.println("      _)(  )(_");
        System.out.println("     `---''---`");
        // input your solution here
    }

    //todo Task 3
    public void sumOfLiterals(){
        char a='Z';
        int b=0xface; //Hexadecimal geschriebener int
        int c = 012; // Octalzahl
        long d = 80L;
        float e = 44e-1f;
        float f = 5.5f;
        double g = 8.88e1;
        double h = 99.9;

        int sum;
        sum = Integer.valueOf(a) + b+c+(int)d+(int)e+(int)f+(int)g+(int)h;
        System.out.println(sum);
        // input your solution here
    }

    //todo Task 4
    public void addTwoNumbers(){
        Scanner scan = new Scanner(System.in);
        int num1, num2;
        num1 = scan.nextInt();
        num2 = scan.nextInt();
        System.out.println(num1+num2);
        // input your solution here
    }

    //todo Task 5
    public void swapTwoNumbers(){
        Scanner scan = new Scanner(System.in);
        int num1, num2;

        System.out.println("Before Swap:");
        System.out.print("x: ");
        num1 = scan.nextInt();
        System.out.print("y: ");
        num2 = scan.nextInt();

        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;

        System.out.println("After Swap:");
        System.out.println("x: "+num1);
        System.out.println("y: "+num2);

        // input your solution here
    }

    //todo Task 6
    public void compareTwoNumbers(){
        int num1, num2;
        Scanner scan = new Scanner(System.in);


        System.out.print("n1: ");
        num1 = scan.nextInt();
        System.out.print("n2: ");
        num2 = scan.nextInt();

        if (num1 > num2) System.out.println("n1 > n2");
        else if (num1 < num2) System.out.println("n2 > n1");
        else System.out.println("n1 == n2");
        // input your solution here
    }

    //todo Task 7
    public void ratingSalesPerson(){
        Scanner scan = new Scanner(System.in);
        int money;
        System.out.print("Enter annual Revenue: ");
        money = scan.nextInt();

        if (money < 0  || money >=100000) System.out.println("Invalid Revenue");
        else if (money <20000) System.out.println("Poor Sales Revenue");
        else if (money <50000) System.out.println("Average Sales Revenue");
        else if (money <80000) System.out.println("Good Sales Revenue");
        else System.out.println("Excellent Sales Revenue");
        // input your solution here
    }

    //todo Task 8
    public void getCommissionRate(){

        Scanner scan = new Scanner(System.in);
        int co;
        System.out.print("Enter CommissionClass: ");
        co = scan.nextInt();
        System.out.print("Your Commission Rate was set to ");
        switch (co)
        {
            case 1: System.out.println("0.01");
                break;
            case 2: System.out.println("0.02");
                break;
            case 3: System.out.println("0.03");
                break;
            case 4: System.out.println("0.04");
                break;
            default: System.out.println("0.0");
                break;
        }
        // input your solution here
    }

    //todo Task 9
    public void leapyear(){
        Scanner scan =  new Scanner(System.in);
        int year;
        System.out.print("Year: ");
        year = scan.nextInt();

        if((year%4==0 && year%100!=0) || year%400==0) System.out.println("Leapyear");
        else System.out.println("Not a Leapyear");
        // input your solution here
    }

    //todo Task 10
    public void transposedNumbers(){
        int num1, num2=0;

        Scanner scan =  new Scanner(System.in);
        System.out.print("Number: ");
        num1 = scan.nextInt();

        do {
            num2 = num2 *10;
            num2 = num2 + (num1 % 10);
            num1 = num1/10;
        }while (num1 >0);

        System.out.println(num2);
        // input your solution here
    }


    public static void main(String[] args){
        App exercise1 = new App();

        System.out.println("Task 1: Say Hello World");
        exercise1.sayHelloWorld();

        System.out.println("\nTask 2: Hello Robot");
        exercise1.helloRobot();

        System.out.println("\nTask 3: Literals");
        exercise1.sumOfLiterals();

        System.out.println("\nTask 4: Add two Numbers");
        exercise1.addTwoNumbers();

        System.out.println("\nTask 5: Swap two Numbers without using a helper variable");
        exercise1.swapTwoNumbers();

        System.out.println("\nTask 6: Compare two Numbers");
        exercise1.compareTwoNumbers();

        System.out.println("\nTask 7: Rating Sales Person");
        exercise1.ratingSalesPerson();

        System.out.println("\nTask 8: Commission Rate");
        exercise1.getCommissionRate();

        System.out.println("\nTask 9: Leapyear");
        exercise1.leapyear();

        System.out.println("\nTask 10: Transposed Numbers");
        exercise1.transposedNumbers();
    }
}