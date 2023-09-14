import java.util.Scanner;
public class Program3 {
    public static void main(String[] args) {
        System.out.print("Введите строку для шифрования = ");
        Scanner sc = new Scanner(System.in);
        String userset = sc.nextLine();
        int len = userset.length();
        int d;
        System.out.print("Зашифрованная строка = ");
        for (int i = 0;i<len;i++){
                d = userset.charAt(i);
            if ((48<=d)&(57>=d)){
                System.out.print(Character.toChars(d+1));
            } else if ((97<=d)&(122>=d)){
                System.out.print(d);
            }
        }
        sc.close();
    }
}
