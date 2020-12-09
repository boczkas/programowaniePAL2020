package lekcja3;

public class Main {
    public static void main(String[] args) {
        //          1. Konwersja typów numerycznych

        int liczbaInt = 5;
        double liczbaDouble = liczbaInt;

//        System.out.println(liczbaInt);
//        System.out.println(liczbaDouble);


//          2. Rzutowanie (konwersja stratna)

        liczbaDouble = 3.999;
//        liczbaInt = liczbaDouble;

        liczbaInt = (int) liczbaDouble;
        System.out.println(liczbaInt);

        liczbaInt = 300;
        byte liczbaByte = (byte) liczbaInt;

        System.out.println(liczbaByte);


//          3. Operatory z przypisaniem

//        int x = 0;
//
//        x = x + 5;
//        System.out.println(x);
//
//        x += 5;
//        System.out.println(x);
//
//        x *= 2;
//        System.out.println(x);

        DzienTygodnia dzisiaj = DzienTygodnia.SRODA;

        if (dzisiaj.equals(DzienTygodnia.SRODA)) {
            System.out.println("dzisiaj sroda");
        }
    }
}
