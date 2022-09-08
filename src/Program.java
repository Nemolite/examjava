import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        System.out.println("Hello Java!");
        int a = 18;
        System.out.println(a);

        var b = 20.13;
        System.out.println(b);

        long num = 2147483649L;
        System.out.println(num);

        int test = 123_456;
        System.out.println(test);

        double chislo = 123.456;
        System.out.println(chislo);

        float endlo = 57.789f;
        System.out.println(endlo);

        final int DART = 34;
        System.out.println(DART);

        char ch='e';
        System.out.println(ch);

        String linty ="Hello , World";
        System.out.println(linty);

        String bigtext = "Пример большого текста\n" +
                "Вторая строка большого текста\n"+
                "Третья строка большого текста\n"+
                "Четвертая строка болього текста";
        System.out.println(bigtext);

        String bigtextnew = """
                Новый пример большого текста
                Вторая строка нового примера
                Третья строка нового примера
                Четвертая строка нового примера
                """;
        System.out.println(bigtextnew);

        int x = 10;
        int y = 20;

        System.out.print("x = "+ x +" "+ "y = "+y+ " сумма = "+ ( x + y )+ "\n");

        String name = "Sergey";
        int age = 51;
        float rating = 123.34f;

        System.out.printf("Имя = %s, Возраст = %d Рейтинг = %f\n",name,age,rating);

        Scanner in = new Scanner(System.in);
        /*
        System.out.print("=");
        int numb = in.nextInt();
        System.out.printf("Твой номер=%d",numb);
        in.close();
        */
        /* Ввод данных из консоли*/

        System.out.print("Ваше имя = ");
        String namemi = in.nextLine();

        System.out.print("Ваш возраст = ");
        int agemi = in.nextInt();

        System.out.print("Ваш рейтинг = ");
        float rite = in.nextFloat();

        System.out.printf("Спасибо\n Ваше имя = %s\n Ваш возраст = %d\n Ваш рейтинг = %.2f\n",namemi,agemi,rite);
        in.close();
    }
}
