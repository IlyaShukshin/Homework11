import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        System.out.println("Tack 1");
        isLeapYear(2024);

        System.out.println("Tack 2");
        checkOS(2020, 0);

        System.out.println("Tack 3");
        calculationDelivery(95);

    }

    public static void isLeapYear(int year) {
        if (year > 1584 && year % 4 == 0 && year % 100 != 0) {
            System.out.println(year + " год - високосный год.");
        } else {
            System.out.println(year + " год - невисокосный год.");
        }
    }

    public static void checkOS(int clientDeviceYear, int clientOS) {
        int currentYear = LocalDate.now().getYear();

        if (clientOS == 0 && clientDeviceYear < currentYear) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS == 0 && clientDeviceYear >= currentYear) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1 && clientDeviceYear < currentYear) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientOS == 1 && clientDeviceYear >= currentYear) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
    }

    public static void calculationDelivery(int deliveryDistance) {
        int deliveryTime;
        if (deliveryDistance <= 20) {
            deliveryTime = 1;
            System.out.println("Потребуется дней: " + deliveryTime);
        } else if (deliveryDistance >= 20 && deliveryDistance <= 60) {
            deliveryTime = 2;
            System.out.println("Потребуется дней: " + deliveryTime);
        } else if (deliveryDistance >= 60 && deliveryDistance <= 100) {
            deliveryTime = 3;
            System.out.println("Потребуется дней: " + deliveryTime);
        } else {
            System.out.println("Свыше 100 км доставки нет");
        }
    }
}