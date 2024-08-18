package app;

public class Main {

    public static void main(String[] args) {

        Person mykola = new Person("Mykola", 25, "Military");
        Person aliona = new Person("Aliona", 30, "Hairdresser");
        Person anna = new Person("Anna", 22, "Journalist");

        mykola.displayInfo("1. ");
        aliona.displayInfo("   ");
        anna.displayInfo("   ");

        System.out.println();

        Person sergey = new Person("Sergey", 33, "Police");
        sergey.displayInfo("2. ");
        sergey.setProfession("The driver");
        System.out.println("  " +
                "(After updating the profession): ");
        sergey.displayInfo("   ");

    }
}
