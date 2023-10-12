public class Example {
    public static void main(String[] args) {
        int[] nums = new int[4];

        System.out.println("Перед генерацией исключения.");

        try {
            nums[7] = 10;
            System.out.println("Это отображаться не будет");
             }
        catch (ArrayIndexOutOfBoundsException exc) {
            System.out.println("Индекс вышел за границы массива!");

        }
        System.out.println("После оператора catch.");
    }
}
