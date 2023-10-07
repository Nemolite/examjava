import java.util.Scanner;
public class Program21 {
    public static void main(String[] args) {
        // Программа должна считывать 4 числа с клавиатуры.
        Scanner sc = new Scanner(System.in);
        // 1 чилсо, стоимость работ
        System.out.println("Введите стоимость работ:");
        float jobs = sc.nextFloat();
        // 2 чилсо, стоимость материалов
        System.out.println("Введите стоимость материалов:");
        float materials = sc.nextFloat();
        // 3.скидку в процентах
        System.out.println("Введите скидку в процентах:");
        float discounts = sc.nextFloat();
        // 4.скидку в процентах
        System.out.println("Введите бюджет заказчика:");
        float budget = sc.nextFloat();
        // Расчет стоимости проекта без учета скидки
        float project = jobs + materials;
        // Расчет скидки от стоимости проекта
        float x = (discounts * project)/100;
        System.out.print("Стоимость скидки = ");
        System.out.println(x);
        // Расчет  стоимости проекта c учетом (с минусом) скидки
        float price_project = project - x;
        System.out.print("Стоимость проекта с учетом скидки = ");
        System.out.println(price_project);
        if (price_project<=budget) {
            System.out.println("Бюджета достаточно");
        } else {
            System.out.println("Бюджета не хватит");
        }
    }
}
