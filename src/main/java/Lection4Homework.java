public class Lection4Homework {
    public static void main(String[] args) {

//        square(4);
//
//        cylinderVolume(2, 3);
//
//        exponentiation(2, 3);

//        System.out.println(calculateSum(1, 1, 2, 5, 10, 1));
        System.out.println(calculator("plus", 5,10, 15));
        System.out.println(calculator("minus", 50,20, 10));
        System.out.println(calculator("multiply", 2,3, 4));
        System.out.println(calculator("divide", 100,5, 2));
        System.out.println(calculator("divide", 100,0, 5));
        System.out.println(calculator("dividde", 100,0, 5));
    }


    public static void square(int a){
        int res = a*a;
        System.out.println("square of " + a + "m = " + res + "m2");
    }

    public static void cylinderVolume(double radius, double height){
        double res =  3.14*radius*radius*height;
        System.out.println("radius = " + radius + "m \n"+
                "height = " + height + "m \n"+
                "cylinder's volume = " + res + "m3");

    }

    public static void exponentiation(int a, int b){
        int res = 1;
        for (int i = 1; i <=b; i ++) {
            res = res * a;
        }
        System.out.println(a + " to the " + b + " power = " + res);
    }

    public static int calculateSum(int... elements) {

        int res = 0;
        for (int element : elements) {
            res = res + element;
        }
        return res;
    }

    public static int calculator(String operation, int ... elements) {
        int res = elements[0];
        for (int i = 1; i < elements.length; i ++)
        {
            switch (operation){
                case "plus": res = res + elements[i]; break;
                case "minus":
                    res = res - elements[i]; break;
                case "multiply": res = res * elements[i]; break;
                case "divide":
                    if (res == 0 || elements[i] == 0){
                        return 0;
                    }
                    res = res / elements[i]; break;
                default:
                    return -1;
            }
        }

        return res;
    }
}

