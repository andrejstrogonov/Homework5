public class Main {
    public static void main(String[] args) {
        //1 задача
        int clientOS = 1;
        if (clientOS == 0){
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        //2 задача
        int clientDeviceYear = 2014;
        if (clientOS == 0 && clientDeviceYear >= 2015) {
            System.out.println("Ваша версия системы iOS подходит для корректной работы");
        } else {
            System.out.println("Версия системы iOS устарела. Установите облегченную версию приложения для iOS по ссылке");
        }
        if (clientOS == 1 && clientDeviceYear >= 2015) {
            System.out.println("Ваша версия системы Android подходит для корректной работы");
        } else {
            System.out.println("Версия системы Android устарела. Установите облегченную версию приложения для Android по ссылке");
        }
        //3 задача
        int year = 2021;
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
        //4 задача
        int deliveryDistance = 50;
        if (deliveryDistance > 20 && deliveryDistance <= 60){
            System.out.println("Потребуется дней: " + 2);
        }
        if (deliveryDistance >= 1 && deliveryDistance < 20){
            System.out.println("Потребуется дней: " + 1);
        }
        if (deliveryDistance > 60 && deliveryDistance <= 100){
            System.out.println("Потребуется дней: " +3);
        }
        if (deliveryDistance>100){
            System.out.println("Доставки нет");
        }
        //5 задача
        int monthNumber = 12;
        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println("Зима");
                break;
            case 3:
            case 5:
            case 4:
                System.out.println("Весна");
                break;
            case 6:
            case 8:
            case 7:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;
            default:
                System.out.println("Добавить номер месяца");
        }
    }
}