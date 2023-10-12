public class Example2 {
    public static void main(String[] args) {
        int[]  nums1 =  {1,2,3,4,5,7,8,9};
        int[]  nums2 =  {1,0,3,0,5};

        for(int i =0;i<=nums1.length;i++){
            try {
                double res =  nums1[i] / nums2[i];
                System.out.println("Резульат= " + res );
            }
            catch (ArithmeticException e){
                System.out.println("Warning! Divader on zero");

            }
            catch (ArrayIndexOutOfBoundsException e){
                System.out.println("Индекс вышел за границы массива!");
            }
        }
    }
}
