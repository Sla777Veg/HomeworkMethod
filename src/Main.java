import java.time.LocalDate;

public class Main {

    //Задание1
    public static String printLeapYear(int highYear) {
        if (highYear % 4 == 0 && (highYear % 100 != 0 || highYear % 400 == 0)) {
            return " - год является высокосным";
        } else {
            return " - год не является высокосным";
        }
    }

    //Задание2
    public static String applicationVersion(int clientOS, int currentYear) {
        if (clientOS == 0 && currentYear >= 2015) {
            return "Установите версию приложения для iOS по ссылке";
        } else if (clientOS == 1 && currentYear >= 2015) {
            return "Установите версию приложения для Android по ссылке";
        } else if (clientOS == 0 && currentYear < 2015) {
            return "Установите облегченную версию приложения для iOS по ссылке";
        } else if (clientOS == 1 && currentYear < 2015) {
            return "Установите облегченную версию приложения для Android по ссылке";
        } else {
            return "Не корректно введенные данные";
        }
    }

    //Задание3
    public static String fastDelivery(int deliveryDistance) {
        if (deliveryDistance < 20) {
            return "Потребуется дней: 1 день срок доставки";
        } else if (deliveryDistance >= 20 && deliveryDistance < 60) {
            return "Потребуется дней: 2 дня срок доставки";
        } else if (deliveryDistance >= 60 && deliveryDistance < 100) {
            return "Потребуется дней: 3 дня срок доставки";
        }
          return "Слишком далеко, доставка не возможна";
    }



    public static void main(String[] args) {
        //Задание1
        int highYear = 2021;
        System.out.println(highYear+printLeapYear(highYear));

        //Задание2
        int currentYear = LocalDate.now().getYear();
        // System.out.println(currentYear);
        int clientOS = 0;
        // int clientDeviceYear = 2015;
        System.out.println(applicationVersion(clientOS, currentYear));

        //Задание3
        int deliveryDistance = 95;
        System.out.println(fastDelivery(deliveryDistance));
    }
}