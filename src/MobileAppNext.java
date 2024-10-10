public class MobileAppNext {
    public static void main(String[] args){
      int clientDeviceYear = 2014;
      int  clientOS = 1;
        if (clientOS == 0 && clientDeviceYear >= 2015) {
            System.out.println("Ваша версия системы iOS подходит для корректной работы");
        } else {
            if (clientOS == 0 && clientDeviceYear < 2015)
                System.out.println("Версия системы iOS устарела. Установите облегченную версию приложения для iOS по ссылке");
        }
        if (clientOS == 1 && clientDeviceYear >= 2015) {
            System.out.println("Ваша версия системы Android подходит для корректной работы");
        } else {
            if (clientOS == 1 && clientDeviceYear < 2015)
                System.out.println("Версия системы Android устарела. Установите облегченную версию приложения для Android по ссылке");
        }
    }
}
