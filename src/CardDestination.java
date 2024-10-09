public class CardDestination {
    public static void main(String[] args) {
        int deliveryDistance = 95;
        if (deliveryDistance > 20 && deliveryDistance <= 60){
            System.out.println("Потребуется дней: " + 3);
        } else if (deliveryDistance >= 1 && deliveryDistance < 20){
            System.out.println("Потребуется дней: " + 1);
        }else if (deliveryDistance > 60 && deliveryDistance <= 100){
            System.out.println("Потребуется дней: " +4 );
        }else{
            System.out.println("Доставки нет");
        }
    }
}
