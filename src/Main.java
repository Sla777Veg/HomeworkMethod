import java.time.LocalDate;

public class Main {

    //Задание1
    public static void printLeapYear(int highYear) {
        System.out.println(highYear+" - год является высокосным");
    }

    public static void printNoLeapYear(int highYear) {
        System.out.println(highYear+" - год не является высокосным");
    }

    //Задание2
    public static void applicationVersionIOS(int clientOS, int currentYear) {
        System.out.println("Установите версию приложения для iOS по ссылке");
    }

    public static void applicationVersionAndroid(int clientOS, int currentYear) {
        System.out.println("Установите версию приложения для Android по ссылке");
    }

    public static void lightApplicationVersionIOS(int clientOS, int currentYearr) {
        System.out.println("Установите облегченную версию приложения для iOS по ссылке");
    }

    public static void lightApplicationVersionAndroid(int clientOS, int currentYear) {
        System.out.println("Установите облегченную версию приложения для Android по ссылке");
    }
    //Задание3
    public static void fastDelivery(int deliveryDistance) {
        System.out.println("Потребуется дней: 1 день срок доставки");
    }

    public static void averageDelivery(int deliveryDistance) {
        System.out.println("Потребуется дней: 2 дня срок доставки");
    }

    public static void longDelivery(int deliveryDistance) {
        System.out.println("Потребуется дней: 3 дня срок доставки");
    }

    public static void main(String[] args) {
        //Задание1
        int highYear = 2021;
        if (highYear % 4 == 0 && (highYear % 100 != 0 || highYear % 400 == 0)) {
            printLeapYear(highYear);
        } else {
            printNoLeapYear(highYear);
        }

        //Задание2
        int currentYear = LocalDate.now().getYear();
        // System.out.println(currentYear);
        int clientOS = 0;
        // int clientDeviceYear = 2015;
        if (clientOS == 0 && currentYear >= 2015) {
            applicationVersionIOS(clientOS, currentYear);
        } else if (clientOS == 1 && currentYear >= 2015) {
            applicationVersionAndroid(clientOS, currentYear);
        } else if (clientOS == 0 && currentYear < 2015) {
            lightApplicationVersionIOS(clientOS, currentYear);
        } else {
            lightApplicationVersionAndroid(clientOS, currentYear);
        }
        //Задание3
        int deliveryDistance = 95;
        if (deliveryDistance < 20) {
            fastDelivery(deliveryDistance);
        } else if (deliveryDistance >= 20 && deliveryDistance < 60) {
            averageDelivery(deliveryDistance);
        } else if (deliveryDistance >= 60 && deliveryDistance < 100) {
            longDelivery(deliveryDistance);
        }
    }
}