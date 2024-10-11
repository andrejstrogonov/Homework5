public class MonthCalculator {
    public static void main(String[] args){
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
