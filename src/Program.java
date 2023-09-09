import java.util.Scanner;
public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число n = ");
        int n = sc.nextInt();
        int[] r = exam(n);

        for(int i = 0;i<=n;i++){
            System.out.printf("%d = %d\n",r[i],i);
        }


    }

    public static int[] exam(int n){
        int nums[] = new int[n];
        return nums;
    }
}

