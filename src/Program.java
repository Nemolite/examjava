import java.lang.reflect.Array;
import java.util.Scanner;
import javax.swing.*;
//Домашнее задание 2. Программа для расчета сметы.
//        Условие. Для упрощения типовых расчетов прораб заказал разработчикам
//        создать программу для расчета сметы проекта.
//        Программа получает на вход 4 числа:
//        стоимость работ,
//        стоимость материалов,
//        скидку в процентах
//        и бюджет заказчика.
//        Программа должна считать всю стоимость проекта (материалы+работы)
//        с учетом скидки и определять, хватит ли у заказчика денег.
//
//        Требования:
//        1) Программа должна считывать 4 числа с клавиатуры.
//        2) Программа должна корректно рассчитывать стоимость проекта с учетом скидки.
//        3) Программа должна выводить общую стоимость проекта с учетом скидки.
//        4) Программа должна проверять, хватит ли у заказчика денег и выводить результат проверки.
//        5) Необходимо загрузить код программы с комментариями.

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите стоимость работ:");
        float jobs = sc.nextInt();
        System.out.println("Введите стоимость материалов:");
        float materials = sc.nextInt();
        System.out.println("Введите скидку в процентах:");
        float discounts = sc.nextInt();
        System.out.println("Введите бюджет заказчика:");
        float budget = sc.nextInt();

        float price_project = (jobs + materials) - (jobs + materials)*(discounts/100);
            System.out.println(price_project);
        if (price_project>=budget) {
            System.out.println("Бюджета достаточно");
        } else {
            System.out.println("Бюджета не хватит");
        }
    }
}

