import java.util.Scanner;
public class Program3 {
    public static String userset;
    public static int len;
    public static boolean marker = true;
    public static Scanner sc;
    // Начало и конец диапозона кода чисел от 0 до 9
    public static final int START_COD_NUMBER = 48;
    public static final int END_COD_NUMBER = 57;
    // Начало и конец диапозона кода символов латинского алфавита от a до z
    public static final int START_COD_SIMBOL = 97;
    public static final int END_COD_SIMBOL = 122;

    public static final int ZERO_CODE = 48;
    public static final int ONE_CODE = 49;
    public static void main(String[] args) {
        while (marker){
            System.out.print("Введите строку для шифрования ( 5 символов)= ");
            sc = new Scanner(System.in);
            userset = sc.nextLine();
            len = Program3.userset.length();
            marker = checker(len)|checkerLatin(userset);
        }
        sc.close();

        int d;
        System.out.print("Зашифрованная строка = ");
        for (int i = 0;i<len;i++){
                d = userset.charAt(i);
            if ((START_COD_NUMBER<=d)&(END_COD_NUMBER>d)){
                // Если это код числа, то +1 и отображаем число
                System.out.print(Character.toChars(d+1));
            } else if ((START_COD_SIMBOL<=d)&(END_COD_SIMBOL>=d)){
                // Если это код латинского символа, то отображаем код символа
                System.out.print(d);
            } else if (END_COD_NUMBER==d){
                // При вводе 9 , выводим 10
                System.out.print(Character.toChars(ONE_CODE));
                System.out.print(Character.toChars(ZERO_CODE));
            }
        }

    }
    // Проверка количества вводимых символов
    public static boolean checker(int len){
        if(len>5){
            marker = true;
            System.out.println("Вы ввели больше 5 символов, повторите ввод");
        } else if (len<5){
            marker = true;
            System.out.println("Вы ввели меньше 5 символов, повторите ввод");
        } else {
            marker =false;
        }
        return marker;
    }
    // Проверка символов на числа и на латинские символы
    public static boolean checkerLatin(String userset){
        int d;
        for (int i = 0;i<len;i++){
            d = userset.charAt(i);
            // Проверка на принадлежность символа диапозонам от 0 до 9 ИЛИ от a до z
            if ((START_COD_NUMBER<=d)&(END_COD_NUMBER>=d)|(START_COD_SIMBOL<=d)&(END_COD_SIMBOL>=d)){
                marker = false;
            } else {
                marker = true;
            }
        }
        if (marker){
            System.out.println("Вы ввели символы не латинскими буквами");
        }
        return marker;
    }
}
