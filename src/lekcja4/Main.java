package lekcja4;

public class Main {
    public static void main(String[] args) {

//          1. Operatory inkrementacji i dekrementacji
//
//        int i = 0;
//
//        // postinkrementacji
//        i++;
//        System.out.println(i);
//
//        // postdekrementacji
//        i--;
//        System.out.println(i);
//
//        // preinkrementacji
//        ++i;
//        System.out.println(i);
//
//        // postdekrementacji
//        --i;
//        System.out.println(i);
//
//        int m = 7;
//        int n = 7;
//
//        int a = 2 * ++m;
//        int b = 2 * n++;
//
//        System.out.println("m = " + m);
//        System.out.println("n = " + n);
//        System.out.println("a = " + a);
//        System.out.println("b = " + b);


//          2. Operatory relacyjne i logiczne

//        System.out.println( "3 == 7 " + (3 == 7));
//        System.out.println( "3 != 7 " + (3 != 7));
//        System.out.println( "3 > 7 " + (3 > 7));
//        System.out.println( "3 >= 7 " + (3 >= 7));
//        System.out.println( "3 <= 7 " + (3 <= 7));
//        System.out.println("!true " + (!true));
//
//        System.out.println("true || false " + (true || false));
//        System.out.println("true && false " + (true && false));

//      Operatory są leniwe

//        if (zwracamFalse1() || zwracamTrue1() || zwracamTrue2()) {
//            System.out.println("No fajnie");
//        }
//
//        if (zwracamTrue1() && zwracamFalse1() && zwracamFalse2() && zwracamTrue2()) {
//            System.out.println("No fajnie");
//        } else {
//            System.out.println("No nie fajnie");
//        }
    }

    static boolean zwracamTrue1() {
        System.out.println("Zwracam True1");
        return true;
    }

    static boolean zwracamTrue2() {
        System.out.println("Zwracam True2");
        return true;
    }

    static boolean zwracamFalse1() {
        System.out.println("Zwracam False1");
        return false;
    }

    static boolean zwracamFalse2() {
        System.out.println("Zwracam False2");
        return false;
    }
}
