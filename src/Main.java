
public class Main {
    static void main(String[] args) {

        byte byteVar = 127;
        short shortVar = 32767;
        int intVar = 2147483647;
        long longVar = 9223372036854775807L;
        float floatVar = 3.14f;
        double doubleVar = 3.1415926535;
        char charVar = 'A';
        boolean booleanVar = true;

        greet(" Alex");


        System.out.println(isNegative(-5));


        checkNumberSign(42);


        printMultiplesOfThree();
    }

    public static void greet(String name) {
        System.out.println("Привет, " + name + "!");
    }

    public static boolean isNegative(int number) {
        return number < 0;
    }

    public static void checkNumberSign(int number) {
        if (number < 0) {
            System.out.println("Число отрицательное");
        } else {
            System.out.println("Число положительное");
        }
    }

    public static void printMultiplesOfThree() {
        for (int i = 1000; i >= 0; i--) {
            if (i % 3 == 0) {
                System.out.print(i + " ");
            }
        }
    }
}