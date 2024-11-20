public class FirstClass {
    public static void main(String[] args) {

        square(4);

        cylinderVolume(2, 3);

        exponentiation(2, 3);

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
}
