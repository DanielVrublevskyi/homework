public class Lection5_Homework {
    public static void main(String[] args) {
        checkAge(18);
        checkAge(0);
        checkAge(-99);

        System.out.println(isPerfectSquare(25));

        calculateSumUpToN(1);
        calculateSumUpToN(3);
        calculateSumUpToN(0);

        getGrade(5);
        getGrade(1);
        getGrade(-3);

        System.out.println("0 - " + isPrime(0));
        System.out.println("2 - " + isPrime(2));
        System.out.println("4 - " + isPrime(4));
        System.out.println("7 - " + isPrime(7));
        System.out.println("8 - " + isPrime(8));
        System.out.println("9 - " + isPrime(9));
        System.out.println("11 - " + isPrime(11));
        System.out.println("13 - " + isPrime(13));

    }
    public static void checkAge(int age){
        if (age < 18 && age >= 0){
            System.out.println("Ви не є дорослою особою");
        } else if (age >= 18) {
            System.out.println("Ви доросла особа");
        } else {
            System.out.println("Помилка");
        }
    }

    public static boolean isPerfectSquare(double num){
        return Math.sqrt(num) % 1 == 0;
    }

    public static void calculateSumUpToN(int a){
        if (a < 1){
            System.out.println("Wrong N");
            return;
        }
        int sum = 0;
        for (int i = 1; i <= a; i++){
            sum = sum + i;
        }
        System.out.println(sum);
    }

    public static void getGrade(int grade){
        switch (grade){
            case 5:
                System.out.println("Great"); break;
            case 4:
                System.out.println("Good"); break;
            case 3:
                System.out.println("Middling"); break;
            case 2:
                System.out.println("Below average"); break;
            case 1:
                System.out.println("Bad"); break;
            default:
                System.out.println("Wrong grade");
        }
    }

//    Просто́е число́ — это натуральное число, большее единицы, имеющее ровно два натуральных делителя: 1 и само себя.
    public static boolean isPrime(int num){
        boolean res = true;
        if (num <=1){
            return false;
        }
        for (int i = 2; (i * i) <= num; i++){
            res = num % i != 0;
        }
        return res;
    }


}
