package questions;

import java.util.Scanner;  // ✅ Needed for Scanner

public class multiprogrram {
    // 1. Factorial
    static long factorial(int n) {
        long fact = 1;
        for (int i = 1; i <= n; i++) fact *= i;
        return fact;
    }

    // 2. Electricity Bill (simple slab: unit * rate)
    static double electricityBill(int units, double rate) {
        return units * rate;
    }

    // 3. Average of N numbers
    static double average(int[] arr) {
        int sum = 0;
        for (int num : arr) sum += num;
        return (double) sum / arr.length;
    }

    // 4. Discount of Product
    static double discount(double price, double disPercent) {
        return price - (price * disPercent / 100);
    }

    // 5. Distance between two points
    static double distance(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    // 6. Commission
    static double commission(double amount, double percent) {
        return amount * percent / 100;
    }

    // 7. Power
    static double power(double a, double b) {
        return Math.pow(a, b);
    }

    // 8. Depreciation
    static double depreciation(double cost, double rate, int years) {
        return cost * Math.pow((1 - rate / 100), years);
    }

    // 9. Batting Average
    static double battingAverage(int runs, int outs) {
        return (double) runs / outs;
    }

    // 10. CGPA
    static double cgpa(double[] grades) {
        double sum = 0;
        for (double g : grades) sum += g;
        return sum / grades.length;
    }

    // 11. Compound Interest
    static double compoundInterest(double p, double r, int t) {
        return p * Math.pow((1 + r / 100), t) - p;
    }

    // 12. Sum of N numbers
    static int sumN(int n) {
        return n * (n + 1) / 2;
    }

    // 13. Armstrong Number
    static boolean isArmstrong(int n) {
        int sum = 0, temp = n, digits = String.valueOf(n).length();
        while (temp > 0) {
            int d = temp % 10;
            sum += Math.pow(d, digits);
            temp /= 10;
        }
        return sum == n;
    }

    // 14. NCR and NPR
    static long nCr(int n, int r) {
        return factorial(n) / (factorial(r) * factorial(n - r));
    }
    static long nPr(int n, int r) {
        return factorial(n) / factorial(n - r);
    }

    // 15. Reverse String
    static String reverse(String s) {
        return new StringBuilder(s).reverse().toString();
    }

    // 16. Palindrome
    static boolean isPalindrome(int n) {
        return n == Integer.parseInt(new StringBuilder(String.valueOf(n)).reverse().toString());
    }

    // 17. Future Investment
    static double futureInvestment(double p, double r, int t) {
        return p * Math.pow((1 + r / 100), t);
    }

    // 18. HCF and LCM
    static int hcf(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    static int lcm(int a, int b) {
        return (a * b) / hcf(a, b);
    }

    // 19. Vowel or Consonant
    static String vowelOrConsonant(char c) {
        return "aeiouAEIOU".indexOf(c) != -1 ? "Vowel" : "Consonant";
    }

    // 20. Perfect Number
    static boolean isPerfect(int n) {
        int sum = 1;
        for (int i = 2; i <= n / 2; i++) if (n % i == 0) sum += i;
        return n > 1 && sum == n;
    }

    // 21. Leap Year
    static boolean isLeap(int year) {
        return (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);
    }

    // 22. Sum of digits
    static int sumDigits(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }

    // 23. Kunal’s Even Days (August = 31 days)
    static int kunalEvenDays() {
        int count = 0;
        for (int i = 1; i <= 31; i++) if (i % 2 == 0) count++;
        return count;
    }

    // 24. Sum of Neg, Even Pos, Odd Pos
    static void sumOfList(Scanner sc) {
        int negSum = 0, evenSum = 0, oddSum = 0;
        System.out.println("Enter numbers (0 to stop):");
        while (true) {
            int n = sc.nextInt();
            if (n == 0) break;
            if (n < 0) negSum += n;
            else if (n % 2 == 0) evenSum += n;
            else oddSum += n;
        }
        System.out.println("Sum of Negative Numbers = " + negSum);
        System.out.println("Sum of Positive Even Numbers = " + evenSum);
        System.out.println("Sum of Positive Odd Numbers = " + oddSum);
    }

    // ---------- Main Menu ----------
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n===== Multi-Purpose Program =====");
            System.out.println("1. Factorial");
            System.out.println("2. Electricity Bill");
            System.out.println("3. Average of N Numbers");
            System.out.println("4. Discount of Product");
            System.out.println("5. Distance Between Two Points");
            System.out.println("6. Commission Percentage");
            System.out.println("7. Power");
            System.out.println("8. Depreciation of Value");
            System.out.println("9. Batting Average");
            System.out.println("10. CGPA");
            System.out.println("11. Compound Interest");
            System.out.println("12. Sum of N Numbers");
            System.out.println("13. Armstrong Number");
            System.out.println("14. NCR & NPR");
            System.out.println("15. Reverse a String");
            System.out.println("16. Palindrome Number");
            System.out.println("17. Future Investment Value");
            System.out.println("18. HCF of Two Numbers");
            System.out.println("19. LCM of Two Numbers");
            System.out.println("20. Vowel or Consonant");
            System.out.println("21. Perfect Number");
            System.out.println("22. Leap Year");
            System.out.println("23. Sum of Digits");
            System.out.println("24. Kunal’s Even Days in August");
            System.out.println("25. Sum of Negative/Even/Odd Numbers");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            int ch = sc.nextInt();

            if (ch == 0) break;

            switch (ch) {
                case 1 -> {
                    System.out.print("Enter n: ");
                    int n = sc.nextInt();
                    System.out.println("Factorial = " + factorial(n));
                }
                case 2 -> {
                    System.out.print("Enter units & rate: ");
                    int units = sc.nextInt(); double rate = sc.nextDouble();
                    System.out.println("Bill = " + electricityBill(units, rate));
                }
                case 3 -> {
                    System.out.print("Enter count: ");
                    int count = sc.nextInt();
                    int[] arr = new int[count];
                    System.out.println("Enter numbers: ");
                    for (int i = 0; i < count; i++) arr[i] = sc.nextInt();
                    System.out.println("Average = " + average(arr));
                }
                case 4 -> {
                    System.out.print("Enter price & discount %: ");
                    double p = sc.nextDouble(), d = sc.nextDouble();
                    System.out.println("Discounted Price = " + discount(p, d));
                }
                case 5 -> {
                    System.out.print("Enter x1 y1 x2 y2: ");
                    double x1 = sc.nextDouble(), y1 = sc.nextDouble();
                    double x2 = sc.nextDouble(), y2 = sc.nextDouble();
                    System.out.println("Distance = " + distance(x1, y1, x2, y2));
                }
                case 6 -> {
                    System.out.print("Enter amount & %: ");
                    double amt = sc.nextDouble(), per = sc.nextDouble();
                    System.out.println("Commission = " + commission(amt, per));
                }
                case 7 -> {
                    System.out.print("Enter base & power: ");
                    double a = sc.nextDouble(), b = sc.nextDouble();
                    System.out.println("Result = " + power(a, b));
                }
                case 8 -> {
                    System.out.print("Enter cost, rate%, years: ");
                    double c = sc.nextDouble(), rate = sc.nextDouble(); int y = sc.nextInt();
                    System.out.println("Depreciated Value = " + depreciation(c, rate, y));
                }
                case 9 -> {
                    System.out.print("Enter runs & outs: ");
                    int runs = sc.nextInt(), outs = sc.nextInt();
                    System.out.println("Batting Average = " + battingAverage(runs, outs));
                }
                case 10 -> {
                    System.out.print("Enter subjects count: ");
                    int m = sc.nextInt();
                    double[] g = new double[m];
                    System.out.println("Enter grades: ");
                    for (int i = 0; i < m; i++) g[i] = sc.nextDouble();
                    System.out.println("CGPA = " + cgpa(g));
                }
                case 11 -> {
                    System.out.print("Enter P R T: ");
                    double P = sc.nextDouble(), R = sc.nextDouble(); int T = sc.nextInt();
                    System.out.println("Compound Interest = " + compoundInterest(P, R, T));
                }
                case 12 -> {
                    System.out.print("Enter n: ");
                    int n = sc.nextInt();
                    System.out.println("Sum = " + sumN(n));
                }
                case 13 -> {
                    System.out.print("Enter number: ");
                    int n = sc.nextInt();
                    System.out.println(isArmstrong(n) ? "Armstrong" : "Not Armstrong");
                }
                case 14 -> {
                    System.out.print("Enter n & r: ");
                    int n = sc.nextInt(), r = sc.nextInt();
                    System.out.println("nCr = " + nCr(n, r));
                    System.out.println("nPr = " + nPr(n, r));
                }
                case 15 -> {
                    System.out.print("Enter string: ");
                    sc.nextLine(); // flush
                    String s = sc.nextLine();
                    System.out.println("Reverse = " + reverse(s));
                }
                case 16 -> {
                    System.out.print("Enter number: ");
                    int n = sc.nextInt();
                    System.out.println(isPalindrome(n) ? "Palindrome" : "Not Palindrome");
                }
                case 17 -> {
                    System.out.print("Enter P R T: ");
                    double P = sc.nextDouble(), R = sc.nextDouble(); int T = sc.nextInt();
                    System.out.println("Future Value = " + futureInvestment(P, R, T));
                }
                case 18 -> {
                    System.out.print("Enter two numbers: ");
                    int a = sc.nextInt(), b = sc.nextInt();
                    System.out.println("HCF = " + hcf(a, b));
                }
                case 19 -> {
                    System.out.print("Enter two numbers: ");
                    int a = sc.nextInt(), b = sc.nextInt();
                    System.out.println("LCM = " + lcm(a, b));
                }
                case 20 -> {
                    System.out.print("Enter character: ");
                    char c = sc.next().charAt(0);
                    System.out.println(vowelOrConsonant(c));
                }
                case 21 -> {
                    System.out.print("Enter number: ");
                    int n = sc.nextInt();
                    System.out.println(isPerfect(n) ? "Perfect" : "Not Perfect");
                }
                case 22 -> {
                    System.out.print("Enter year: ");
                    int y = sc.nextInt();
                    System.out.println(isLeap(y) ? "Leap Year" : "Not Leap Year");
                }
                case 23 -> {
                    System.out.print("Enter number: ");
                    int n = sc.nextInt();
                    System.out.println("Sum of Digits = " + sumDigits(n));
                }
                case 24 -> System.out.println("Kunal can go out " + kunalEvenDays() + " days in August.");
                case 25 -> sumOfList(sc);
                default -> System.out.println("Invalid choice!");
            }
        }
        sc.close();
    }
}
