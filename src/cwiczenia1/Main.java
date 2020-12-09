package cwiczenia1;

public class Main {
    public static void main(String[] args) {
        // 1. Stwórz 4 zmienne przechowujące dowolne słowa. Wypisz je w jednej linijce (pamiętaj o przerwach między słowami)
        //
        // 2. Oblicz program liczący pole prostokąta. Wypisz tą wartość. Wartości a i b przechowuj w zmiennych.
        //
        // 3. Oblicz program liczący pole trójkąta. Wypisz tą wartość. Wartości a i h przechowuj w zmiennych.
        //
        // 3. Napisz program liczący długość przeciwprostokątnej w trójkącie prostokątnym. Wypisz tą wartość.
        //    Długości przyprostokątnych przechowuj w zmiennych
        //    Math.sqrt(liczba) - obliczanie pierwiastka z danej liczby
        //    Math.pow(liczba, potega) - obliczanie potęgi danej liczby
        // 4.
        // Zadanie domowe:
        // Napisz program rozwiązujący równania kwadratowe (o ile istnieje)
        // https://www.matemaks.pl/rownania-kwadratowe-w-postaci-ogolnej.html

        double a = 2;
        double b = 3;
        double c = 4;

        System.out.println(a + "x**2 + " + b + "x + " + c + " = 0");

        double delta = Math.pow(b, 2) + 4 * a * c;

        if (delta > 0) {

        }

        if (delta == 0) {
            System.out.println("Miejsce zerowe: " + (-b/(2*a)));
        }

        if (delta < 0) {

        }
    }
}
